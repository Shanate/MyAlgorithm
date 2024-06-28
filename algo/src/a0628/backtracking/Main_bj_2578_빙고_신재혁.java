package a0628.backtracking;

import java.io.*;
import java.util.*;

public class Main_bj_2578_빙고_신재혁 {
	

	public static void main(String[] args) throws Exception {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[][] board = new int[6][6]; // 첫째 줄 ~ 다섯번 째 줄
		int[]   call = new int[25];
		int numCount = 0, lineCount = 0;
		
		for(int i=1; i<6; i++) { // i =>  행, j => 열
			st = new StringTokenizer(br.readLine()," ");
			for(int j=1; j<6; j++) {
				board[i][j] = Integer.parseInt(st.nextToken()); // 빙고 기입 완료
			}
		}
		

		st = new StringTokenizer(br.readLine()," ");
		for(int k=1; k<26; k++) {
			call[k] = Integer.parseInt(st.nextToken());
			}
		
		System.out.println(Arrays.deepToString(board));	
		
		
	}

}