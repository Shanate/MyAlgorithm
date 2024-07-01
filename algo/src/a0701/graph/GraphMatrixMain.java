package a0701.graph;

import java.io.*;
import java.util.*;

public class GraphMatrixMain {
	static int N;
	static int[][] g;//
	static boolean[] v;
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/a0701/graph/input_graph.txt"));
		Scanner sc =new Scanner(System.in);
		N=sc.nextInt();
		int E=sc.nextInt();
		g=new int[N][N];
		v=new boolean[N];
		for(int i=0; i<E; i++) {
			int from = sc.nextInt();
			int   to = sc.nextInt();
			g[from][to]=1; // 단방향
			g[to][from]=1; // 양방향
		}
//		for(int[] a:g) System.out.println(Arrays.toString(a)); System.out.println();
		dfs(0);
//		bfs(0);
		sc.close();
	}

	 static void bfs(int i) {
		ArrayDeque<Integer> q=new ArrayDeque<>();
		v[i]=true;
		q.offer(i);
		while(!q.isEmpty()) {
			i=q.poll();
			System.out.print((char)(i+'A')+" ");
			for(int j=0; j<N; j++)    { // 0->N
//			for(int j=N-1; j>=0; j--) { // N->0
				if(g[i][j] != 0 && !v[j]) { //배열이기 때문에 인접했는지 체크해야 한다.
					v[j]=true;
					q.offer(j);
				}
			} 
		}
	}

	 static void dfs(int i) {
		v[i]=true;
		System.out.print((char)(i+'A')+" ");
		for(int j=0; j<N; j++)    { // 0->N
//		for(int j=N-1; j>=0; j--) { // N->0
			if(g[i][j] != 0 && !v[j]) {
				dfs(j);
			}
		} 
	}
}
/*

=BFS==========
A B C D E F G 
A C B E D F G
=DFS==========
A B D F E C G
A C E F G D B

x 0 1 2 3 4 5 6
0 . 1 1 . . . .
1 1 . . 1 1 . .
2 1 . . . 1 . .
3 . 1 . . . 1 .
4 . 1 1 . . 1 .
5 . . . 1 1 . 1
6 . . . . . 1 .
*/