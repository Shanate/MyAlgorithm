package a0627.greedy;

import java.io.*;
import java.util.*;

public class Main_bj_2630_색종이만들기_신재혁 {

	static void split(int width, int length, int count) {
//		if ()
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] Paper = new int[N][N]; // 전체 종이

		StringTokenizer st = null;
		
		for(int i=0; i<N; i++) { // i = width, j = length
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<N; j++) {
			Paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		split(N, N, 0); // width, length, count
		
	}

}