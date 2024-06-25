package a0625.sortkmp;

import java.util.*;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a= {69,10,30,2,16,8,31,22};
		System.out.println(Arrays.toString(a)); // 배열확인
		for(int i=1; i<a.length; i++) {
			int k=i;
//			for(int j=i-1; j>=0; j--) {
//				if(a[j]>a[k]) {
//					int T=a[j]; a[j]=a[k]; a[k]=T; // swap
//					k=j;
//				}
//			}
			
			
			int j, 								T=a[i];
			for(j=i; j>0 && a[j-1]>T; j--) a[j]=a[j-1];
										   a[j]=T;
			
			
			System.out.println(Arrays.toString(a)); // 삽입 순서 확인
		}
//		System.out.println(Arrays.toString(a)); // 최종 삽입 정렬
		
	}
}