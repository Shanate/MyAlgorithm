package a0626.listtree;

import java.io.FileInputStream;
import java.util.*;

public class NodeMain {
	static class Node{
		int vertex; // 정점번호 //data
		Node link; // 정점의 다음 정점 //next    // Tree Structure를 만들기 위해선 link를 left와 right로 쪼갠다.
		Node(int vertex,Node link){
			this.vertex=vertex;
			this.link=link;
		}
//		@Override
//		public String toString() {
////			return vertex+"->"+link;
//			return ""+(char)(vertex+'A')+vertex+"->"+link; // 0-> A, 1-> B // char를 통해서 형변환
//		}
	}
	static int N;
	static Node[] g;  // graph 표현
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_graph.txt"));
		Scanner sc = new Scanner(System.in);
		N =sc.nextInt();
		int E=sc.nextInt();
		g=new Node[N];
		for(int i=0; i<E; i++) {
			int from = sc.nextInt();
			int to	 = sc.nextInt();
			g[from]	 = new Node(to  ,g[from]); //단방향				//addFirst
//			g[to  ]	 = new Node(from,g[to  ]); // 주석 풀면 양방향
		}
		
		for(int i=0; i<N; i++) {
			 System.out.print(""+(char)(i+'A')+i+": "); //dump while문보다 for loop문을 사용
			 for(Node j=g[i]; j!=null; j=j.link) {
				 System.out.print(""+(char)(j.vertex+'A')+j.vertex+"->");
			 }
			 System.out.println("null");
		}
		System.out.println();

//		for(Node a:g) System.out.println(a); System.out.println();
//		for(int i=0; i<N; i++) System.out.println(""+(char)(i+'A')+i+": "+g[i]);
		sc.close();
		//arraylist는 삽입 삭제를 통해서 배열이 계속 바뀌는 반면에, linkedlist는 링크만 바꾸기 때문에 퍼포먼스에서 더 좋다.
	}
}
/* 인접관계
....A0		7(정점)
.../.\		8(간선)
..B1.C2		0 1		0 2
./.\./		1 3		1 4		2 4
D3..E4		3 5		4 5
..\.|		5 6
...F5-G6

*/