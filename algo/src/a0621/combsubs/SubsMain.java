package a0621.combsubs;

import java.io.*;
import java.util.*;

public class SubsMain {//부분집합에 R개념은 없음.
	static int N = 4, /*R = 3,*/ C = 0; // N=Number, R=Select, C=Count
	static int[] a= {1,2,3};/*, b=new int[R];*/ // a->b
//	static boolean[] v=new boolean[N]; // visit array
	
	static void subs(int cnt,String str) {
		if(cnt==N) {
			System.out.println(str); C++;
			return;
		}
			subs(cnt+1,str+a[cnt]); //선택
			subs(cnt+1,str+'x'); // 비선택
		}
	public static void main(String[] args) throws Exception {
		C=0;
		subs(0,"");
		System.out.println(C);
	}
//	static void subs(int cnt) {
//		if(cnt==N) {
///*			System.out.println(Arrays.toString(v)); */C++;
//			for(int i=0; i<N; i++) System.out.print((v[i]?a[i]:"x"));
//			System.out.println();
//			return;
//		}
//			v[cnt]=true; //선택
//			subs(cnt+1);
//			v[cnt]=false;//비선택
//			subs(cnt+1);
//		}
//	public static void main(String[] args) throws Exception {
//		C=0;
//		subs(0);
//		System.out.println(C);
//	}
}
