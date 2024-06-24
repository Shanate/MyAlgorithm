package a0624.stackqueue;

import java.io.*;
import java.util.*;

public class Main_bj_2468_안전영역_신재혁 {
		static final int[] di = {-1,0,1,0}; // 상 우 하 좌 (시계방향)
		static final int[] dj = {0,1,0,-1};
		static boolean[][] visited;
		static int[][] area;
		static int N;
		static int maxHeight, maxSafeArea = 0;
		static int C=0;
		
		private static void dfs(int i, int j, int h) {
			visited[i][j] = true;
			for(int d=0; d<4; d++) {
				int ni = i +di[d];
				int nj = j +dj[d];
				
				if (ni>=0 && ni<N && nj>=0 && nj<N) {
					if(area[ni][nj] > h && !visited[ni][nj]) {
						dfs(ni,nj,h);
					}
				}
			}
		}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		area = new int[N][N];
		visited = new boolean[N][N];

		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j=0; j<N; j++) {
				area[i][j] = Integer.parseInt(st.nextToken());
				if(area[i][j]>maxHeight) {
					maxHeight = area[i][j]; // 최대 높이 구하기
				}
			}
		}
		// 각 높이별로 안전 영역 개수 구하기
		for (int h=0; h<=maxHeight; h++) {
			visited = new boolean[N][N];
			int safeAreaCount = 0;
			
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					if (area[i][j] > h && !visited[i][j]) { // 방문하지 않았을 때의 코드
						dfs(i, j, h);
						safeAreaCount++;
					}
				}
			}
			// 최대 안전 영역 개수 카운트
			if (safeAreaCount > maxSafeArea ) {
				maxSafeArea = safeAreaCount;
			}
		}
		
		System.out.println(maxSafeArea);
		
	}
}
