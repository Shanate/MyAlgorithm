package m0625;

import java.io.*;
import java.util.*;

public class Main_bj_10810_공넣기_신재혁 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] baskets = new int[N+1]; // 바구니 개수 // baskets[0] 사용 X
		int[] ball = new int[N+1];
		
		for(int n=1; n<=N; n++) {
			baskets[n] = 0;  // 초기 바구니 초기화
			ball[n] = n; 	 // 공에 번호 부여
		}
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int I = Integer.parseInt(st.nextToken()); // 시점 바구니
			int J = Integer.parseInt(st.nextToken()); // 종점 바구니
			int K = Integer.parseInt(st.nextToken()); // 넣을 공의 번호
			
			for(int n=I; n<=J; n++) {
				baskets[n] = K;
			}
		}
		for(int n=1; n<=N; n++) {
			System.out.print(baskets[n]+" ");
		}
	}
}
//		int i,j,k = Integer.parseInt(br.readLine()); // i~j번 바구니에 k번 공 집어넣기
//		for(i; i<=j; i++) {
//			baskets[i] = k;
//		}
		
