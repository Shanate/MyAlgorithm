package a0624.stackqueue;
// bfs, dfs 둘 다 코딩.
import java.io.*;
import java.util.*;

public class Main_bj_4963_섬의개수_신재혁 {
	static int[][] array;
	static boolean[][] v; // 방문처리
	static int[] di = {0,0,-1,1,-1,1,-1,1};
	static int[] dj = {-1,1,0,0,1,1,-1,-1}; //상 하 좌 우 상좌 상우 하좌 하우
	static int w, h, nowX, nowY;
	public static void main(String[] args) throws Exception {

		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str = " ";
		while(!(str=br.readLine()).equals("0 0")) {
			st = new StringTokenizer(str);
			
			w=Integer.parseInt(st.nextToken()); // w = 너비
			h=Integer.parseInt(st.nextToken()); // h = 높이
			array = new int[h][w];
			v = new boolean[h][w];
			
			for(int i=0; i<h; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<w; j++) {
					array[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
		}
		
	}
}
