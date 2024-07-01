package myAlgorithm;

import java.io.*;
import java.util.*;

public class Main_bj_1189_컴백홈_신재혁2 {
	static int R, C, K;
	static char[][] map;
	static boolean[][] visited;
	static int[] dr = {-1, 0, 1, 0};	//상우하좌
	static int[] dc = {0, 1, 0, -1};
	static int res = 0;
	
	static void dfs(int r, int c, int depth) {
		if(r==1 && c==C) {
			if(depth==K) res++;
			return;
		}
		
		for(int i=0; i<4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			
			if(1<=nr && nr<=R && 1<=nc && nc <=C) {
				if(visited[nr][nc]) continue;
				visited[nr][nc] = true;
				map[nr][nc] = '-';
				dfs(nr, nc, depth+1);
				visited[nr][nc] = false;
				map[nr][nc] = '.';
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		map = new char[R+1][C+1];
		visited = new boolean[R+1][C+1];
		
		for(int i=1; i<=R; i++) {			//맵 입력
			String input = br.readLine();
			for(int j=1; j<=C; j++) {
				char c = input.charAt(j-1);
				map[i][j] = c;
				
				if(c=='T')
					visited[i][j] = true;
			}
		}
		
		visited[R][1] = true;
		dfs(R, 1, 1);
		
		bw.write(res + "");
		bw.flush();
		bw.close();
		br.close();
	}
	
}
