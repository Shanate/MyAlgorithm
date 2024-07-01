package a0701.graph;

import java.io.*;
import java.util.*;

public class GraphListMain {
	static int N;
	static List<Integer>[] g;//
	static boolean[] v;
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/a0701/graph/input_graph.txt"));
		Scanner sc =new Scanner(System.in);
		N=sc.nextInt();
		int E=sc.nextInt();
		g=new List[N]; for(int i=0; i<N; i++) g[i]=new ArrayList<>(); // 이 코드 한 줄을 넣어야한다. 아니면 Null에 걸린다.
		v=new boolean[N];
		for(int i=0; i<E; i++) {
			int from = sc.nextInt();
			int   to = sc.nextInt();
			g[from].add(to); // 단방향
			g[to].add(from); // 양방향
		}
//		for(List<Integer> a:g) System.out.println(a); System.out.println();
		for(int i=0; i<N; i++) System.out.println(""+(char)(i+'A')+i+": "+g[i]); System.out.println();
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
			for(int j:g[i])    { // 0->N
				if(!v[j]) { //인접하는지 체크할 필요가 없다.
					v[j]=true;
					q.offer(j);
				}
			} 
		}
	}
	 static void dfs(int i) {
		v[i]=true;
		System.out.print((char)(i+'A')+" ");
		for(int j:g[i]) { // 0->N
			if(!v[j]) { //인접하는지 체크할 필요가 없다.
				dfs(j);
			}
		} 
	}
}
/*
=BFS==========
A B C D E F G : 0->N
A C B E D F G : N->0
=DFS==========
A B D F E C G
A C E F G D B 21,22번째 줄에 (0,to), (0,from) 으로 쓰면 역방향이 된다.

x 단방향
A0 -> 1 2
B1 -> 3 4
C2 -> 4
D3 -> 5
E4 -> 5
F5 -> 6
G6 -> X

x 양방향
A0 -> 1 2
B1 -> 0 3 4
C2 -> 0 4
D3 -> 1 5
E4 -> 1 2 5
F5 -> 3 4 6
G6 -> 5
adjacent Matrix

*/