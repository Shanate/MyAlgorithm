package a0620.perm;

import java.io.*;
import java.util.*;

public class Main_bj_15649_N과M_신재혁 {
	
	static int M;
	static int N;
	static int C;
	
	static int[] a= {1,2,3,4};
	static int[] b= new int[M];
	static boolean[] v=new boolean[N];
	
	static void perm(int cnt) {
		if(cnt==M) {
			System.out.println(Arrays.toString(b)); C++;
			return;
		}
		for(int i=0; i<N; i++) {
			if(v[i]) continue;
			v[i]=true;
			b[cnt]=a[i];
			perm(cnt+1);
			v[i]=false;
		}
	}
	public static void main(String[] args) throws Exception {
		C=0;
		Scanner in = new Scanner(System.in);
		 M = in.nextInt();
		 N = in.nextInt();
		
		perm(0);
		System.out.println(C);
	}
}
