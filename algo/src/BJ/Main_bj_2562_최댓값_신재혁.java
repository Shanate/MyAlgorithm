package BJ;

import java.io.*;
import java.util.*;

public class Main_bj_2562_최댓값_신재혁 {

	public static void main(String[] args) throws Exception {
		int max = 0;
		int count = 0;
		int[] number = new int[9];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<9; i++) {
			int userNumber = sc.nextInt();
			number[i] = userNumber;
			max = (max>number[i]) ? max : number[i]; // 최댓값 판별
			
			//최대값 자리
		}
		
		System.out.println(max);
		System.out.println(count);
		
		
	}

}
