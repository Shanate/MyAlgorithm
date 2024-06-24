package a0624.stackqueue;

import java.util.*;


public class BfsDfsReturn {
	static final int[] di = {-1,0,1,0}; // 상우하좌(시계방향)
	static final int[] dj = {0,1,0,-1};
	static int N=5,C=0;
	static int[][] a;
	static boolean[][] v; // 방문처리
	
	private static void bfs(int i, int j) {
		ArrayDeque<int[]> q=new ArrayDeque<>();
		v[i][j]=true;
		q.offer(new int[] {i,j});
		while(!q.isEmpty()) {
			int[] ij=q.poll(); //?
			i=ij[0];
			j=ij[1];
			a[i][j]=C++;
//		for(int[] b:a) System.out.println(Arrays.toString(b)); System.out.println(); // 루트 찾기 위한 한줄
			for(int d=0; d<4; d++) {//사방탐색
				int ni=i+di[d];
				int nj=j+dj[d];
				if(0<=ni&&ni<N && 0<=nj&&nj<N && !v[ni][nj]) { //기존 방문한 곳을 방문하지 않기 위해 !v 사용
					v[ni][nj]=true;
					q.offer(new int[] {ni,nj});
				}
			}
		}
	}
	private static void dfs(int i, int j) {
		v[i][j]=true;
		a[i][j]=C++;
//		for(int[] b:a) System.out.println(Arrays.toString(b)); System.out.println(); // 루트 찾기 위한 한줄
		for(int d=0; d<4; d++) {//사방탐색
			int ni=i+di[d];
			int nj=j+dj[d];
			if(0<=ni&&ni<N && 0<=nj&&nj<N && !v[ni][nj]) { //기존 방문한 곳을 방문하지 않기 위해 !v 사용
				dfs(ni,nj); // 재귀호출
			} // 25에서 끝나는 것이 아닌 1로 다시 돌아와서 Exit한다.
		}
	}
	public static void main(String[] args) throws Exception {
		a=new int[N][N];
		v=new boolean[N][N];
		C=1;
		bfs(N/2,N/2);
//		dfs(N/2,N/2);
		for(int[] b:a) System.out.println(Arrays.toString(b)); System.out.println();
	}

}