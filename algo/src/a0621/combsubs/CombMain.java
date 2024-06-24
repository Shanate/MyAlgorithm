package a0621.combsubs;

import java.io.*;
import java.util.*;

public class CombMain {
	static int N = 4, R = 3, C = 0; // N=Number, R=Select, C=Count
	static int[] a= {1,2,3, 4}, b=new int[R]; // a->b
//	static boolean[] v=new boolean[N]; // Combi는 이 줄이 필요가 없다.
	
	static void comb(int cnt, int start) {
		if(cnt==R) {//종료조건
			System.out.println(Arrays.toString(b)); C++;
			return;
		}
		//재귀본문
		for(int i=start; i<N; i++) {
//			if(v[i]) continue;
//			v[i]=true;
			b[cnt]=a[i];
			comb(cnt+1,i+1); // comb(cnt+1,i); 중복조합
//			v[i]=false;
		}
	}
	public static void main(String[] args) throws Exception {
		C=0;
		comb(0,0);
		System.out.println(C);
	}
}
