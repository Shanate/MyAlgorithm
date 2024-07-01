package a0701.graph;

import java.io.*;
import java.util.*;

public class GraphNodeMain {
	static int N;
	static Node[] g;//
	static boolean[] v;
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/a0701/graph/input_graph.txt"));
		Scanner sc =new Scanner(System.in);
		N=sc.nextInt();
		int E=sc.nextInt();
		g=new Node[N];
		v=new boolean[N];
		for(int i=0; i<E; i++) {
			int from = sc.nextInt();
			int   to = sc.nextInt();
			g[from]=new Node(to,g[from]); // 단방향
			g[to]=new Node(from,g[to]); // 양방향
		}
//		for(Node a:g) System.out.println(a); System.out.println();
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
			for(Node j=g[i]; j!=null; j=j.link)    { // N->0
				if(!v[j.vertex]) { //인접하는지 체크할 필요가 없다.
					v[j.vertex]=true;
					q.offer(j.vertex);
				}
			} 
		}
	}
	 static void dfs(int i) {
		v[i]=true;
		System.out.print((char)(i+'A')+" ");
		for(Node j=g[i]; j!=null; j=j.link) { // N->0
			if(!v[j.vertex]) { //인접하는지 체크할 필요가 없다.
				dfs(j.vertex);
			}
		} 
	}
	static class Node{
		int vertex;
		Node link;
		Node(int vertext, Node link){
			this.vertex=vertext;
			this.link=link;
		}
		@Override
		public String toString() {
//		return vertex+"->"+link;
		return ""+(char)(vertex+'A')+vertex+"->"+link;
		}
	}
}

/*
=BFS==========
A B C D E F G : 0->N
A C B E D F G : N->0 Add First
=DFS==========
A B D F E C G : 0->N
A C E F G D B : N->0 Add First

  <>
0 -> 2->1->Null
1 -> 4->3->0->Null
2 -> 4->0->Null
3 -> 5->1->Null
4 -> 5->2->1->Null
5 -> 6->4->3->Null
6 -> 5->Null


*/