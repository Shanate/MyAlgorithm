package m0625;

import java.io.*;
import java.util.*;

public class Main_bj_2750_수정렬하기_신재혁 {
	static int[] a;
	static int[] s;
	
	static void merge(int L, int M, int R) { 
		int i=L, j=M+1, k=L;				
		while(i<=M && j<=R) {
			if(a[i]<=a[j]) s[k++]=a[i++];
			else		   s[k++]=a[j++];
		}
		if(i>M) for(int l=j; l<=R; l++) s[k++]=a[l];
		else	for(int l=i; l<=M; l++) s[k++]=a[l];
		for(int l=L; l<=R; l++) a[l]=s[l];			
	}
	static void mergesort(int L, int R) {
		if(L<R) {
			int M=(L+R)/2;
			mergesort(L, M);
			mergesort(M+1, R);
			merge(L,M,R);
			System.out.println(Arrays.toString(a));
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] a = new int[N]; // 읽어올 라인의 갯수
		
		for(int i=0; i<N; i++) { // 라인 카운팅
			a[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(Arrays.toString(a));
		s = new int[a.length];
		mergesort(0, a.length-1);
		
	}
}
