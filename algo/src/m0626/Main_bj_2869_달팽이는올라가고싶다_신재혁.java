package m0626;

import java.io.*;
import java.util.*;

public class Main_bj_2869_달팽이는올라가고싶다_신재혁 {

		static int I = 0; // 시작점 할당
	
		static void go(int A, int B, int V) {
						
			while(I<V) {
				I += A;
				if(I == V) return;
				else	I -= B;
			}
		}
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken()); // + 거리
		int B = Integer.parseInt(st.nextToken()); // - 거리
		int V = Integer.parseInt(st.nextToken()); // 목적지
		
		go(A,B,V);
		
		System.out.println(I);
	}
}
