package a0620.perm;

import java.io.*;
import java.util.*;

public class PermMain {
	static int N = 4, R = 3, C = 0; // N=Number, R=Select, C=Count
	static int[] a= {1,2,3,4}, b=new int[R]; // a->b
	static boolean[] v=new boolean[N]; // visit array
	
	static void perm(int cnt) {
		if(cnt==R) {//종료조건
			System.out.println(Arrays.toString(b)); C++;
			return;
		}
		//재귀본문
		for(int i=0; i<N; i++) {
			if(v[i]) continue;
			v[i]=true;
//			int T=b[cnt];
			b[cnt]=a[i];
			perm(cnt+1);
//			b[cnt]=T;
			v[i]=false;
		}
	}
	public static void main(String[] args) throws Exception {
		C=0;
		perm(0);
		System.out.println(C);
	}
}
//쪽지테스트 암기

// 중복순열
//for(int i=0; i<N; i++) {
//	b[cnt]=a[i];
//	perm(cnt+1);
//}