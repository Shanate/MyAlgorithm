//package a0621.combsubs;
//
//import java.io.*;
//import java.util.*;
//
//public class Main_bj_2961_도영이가만든맛있는음식_신재혁 {
//	static int N, C; // 재료 개수와 카운트
//	static int[] arrayS; // 신맛
//	static int[] arrayB; // 쓴맛
//	static int A1, A2; 
//	
//	private static void subs(int cnt, String str) {
//		if(cnt==N) {
//			System.out.println(str); C++;
//			return;
//		}	else {
//			subs(cnt+1,str+arrayS[cnt]);
//			subs(cnt+1, str+'x');
//		}
//	}
//	
//	public static void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(System.in);
//		
//		N = sc.nextInt(); // 받아야 하는 갯수
//		for (int i=0; i<N; i++) { // 배열 받기
//			arrayS[i] = sc.nextInt(); arrayB[i] = sc.nextInt();
//		}
//		C=0;
//		subs(0,1,0); // 위로 올라가
//	}
//
//
//}
