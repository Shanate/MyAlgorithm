package a0701.graph;

import java.io.*;
import java.util.*;

public class Main_bj_1743_음식물피하기_신재혁 {
	static int N,M,K;
	static int[][] g;
	static boolean[][] v;
	static int Max;
	
	static void dfs(int i, int j) {
		v[i][j]=true;
		for(int k=0; k<N; k++) {
			for(int l=0; l<N; l++) {
			if(g[i][j] != 0 && !v[j]) {
				dfs(j);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			g = new int[N][N];
			v = new boolean[N][N];
		
		for(int i=0; i<K; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int r = Integer.parseInt(st.nextToken()) - 1; // 시정점
			int c = Integer.parseInt(st.nextToken()) - 1; // 종정점
			g[r][c]=1;
		}
		
		dfs(0,0);
		System.out.println(Max);
		
	}

}

// N : 세로	M : 가로		K : 쓰레기 개수(정점) 	k개 : (r, c) 음식물이 떨어진 좌표	r은 위에서부터, c는 왼쪽에서부터