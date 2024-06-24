package a0624.stackqueue;

import java.util.*;


public class BfsDfsDepth {
	static final int[] di = {-1,0,1,0}; // 상우하좌(시계방향)
	static final int[] dj = {0,1,0,-1};
	static int N=5,C=0;
	static int[][] a;
	static boolean[][] v; // 방문처리
	
	private static void bfs(int i, int j) {
		ArrayDeque<int[]> q=new ArrayDeque<>();
		v[i][j]=true;
		q.offer(new int[] {i,j});
		int depth=0;
		while(!q.isEmpty()) {
		int S=q.size();
		System.out.println("=> "+q.size());
		for(int s=0; s<S; s++) {
			
			int[] ij=q.poll(); //?
			i=ij[0];
			j=ij[1];
			a[i][j]=C++;
			System.out.println(depth);
		for(int[] b:a) System.out.println(Arrays.toString(b)); System.out.println(); // 루트 찾기 위한 한줄
			for(int d=0; d<4; d++) {//사방탐색
				int ni=i+di[d];
				int nj=j+dj[d];
				if(0<=ni&&ni<N && 0<=nj&&nj<N && !v[ni][nj]) { //기존 방문한 곳을 방문하지 않기 위해 !v 사용
					v[ni][nj]=true;
					q.offer(new int[] {ni,nj});
				}
				}
			}
		depth++;
		}
	}
//	private static void dfs(int i, int j, int depth) {
//		v[i][j]=true;
//		a[i][j]=C++;
//		System.out.println(depth);
//		for(int[] b:a) System.out.println(Arrays.toString(b)); System.out.println(); // 루트 찾기 위한 한줄
//		for(int d=0; d<4; d++) {//사방탐색
//			int ni=i+di[d];
//			int nj=j+dj[d];
//			if(0<=ni&&ni<N && 0<=nj&&nj<N && !v[ni][nj]) { //기존 방문한 곳을 방문하지 않기 위해 !v 사용
//				dfs(ni,nj, depth+1); // 재귀호출
//			}
//		}
//	}
	public static void main(String[] args) throws Exception {
		a=new int[N][N];
		v=new boolean[N][N];
		C=1;
		bfs(N/2,N/2);
//		dfs(N/2,N/2, 0);
		for(int[] b:a) System.out.println(Arrays.toString(b)); System.out.println();
	}

}