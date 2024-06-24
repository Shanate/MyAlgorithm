package a0624.stackqueue;

import java.io.*;
import java.util.*;

public class Main_bj_2667_단지번호붙이기_신재혁 {
	
	static final int[] di = {-1,0,1,0}; // 상 우 하 좌(시계방향)
	static final int[] dj = {0,1,0,-1};
	static int[][] arr;
	static boolean[][] visited;
	static int cnt, N = 0;
	static List<Integer> nums; // 단지에 묶인 집의 갯수를 오름차순 정렬
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N][N];
		visited = new boolean[N][N];
		nums = new ArrayList<>();
		cnt = 0;
		

		
	}

}
