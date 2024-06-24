package a0620.perm;

import java.io.*;
import java.util.*;

public class Main_bj_10807_개수세기_신재혁 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int v;
		int sum=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
//			System.out.print(arr[i]+" "); // 출력
		}
		v=sc.nextInt();
		
		for(int j=0;j<n;j++) {//v랑 배열 비교
			
		if(v==arr[j]) {
			sum = sum+1;
		} else sum = sum+0;
		}
		System.out.println(sum); // 갯수 출력
	}
}
