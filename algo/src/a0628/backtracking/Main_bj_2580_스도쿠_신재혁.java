package a0628.backtracking;

import java.io.*;
import java.util.*;

public class Main_bj_2580_스도쿠_신재혁 {

	public static void main(String[] args) throws Exception {

		int[][] Sdoku = new int[9][9];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for(int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<9; j++) {
				Sdoku[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
	}
}