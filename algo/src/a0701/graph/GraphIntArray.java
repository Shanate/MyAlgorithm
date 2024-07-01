package a0701.graph;

import java.io.*;
import java.util.*;

public class GraphIntArray {
	public static void main(String[] args) throws Exception {
		//메모리 2048 기준
//		int[] a = new int[1_065_877_500]; //OK
//		int[] a = new int[1_065_877_501]; //OutOfMemoryError
		int[][] a = new int[32_541][32_541]; //OK //정점의 개수가 이정도면 이렇게 풀어도 된다.
//		int[][] a = new int[32_542][32_542]; //OutOfMemoryError
		System.out.println(a);
		System.out.println();
		
		int[] ia=new int[3];
		ia[0]='A';
		System.out.println(Arrays.toString(ia));
		System.out.println();

		List<Integer>[] la=new List[3];//new List<>[3]; x Generic이 되면 안된다.
		System.out.println(Arrays.toString(la));
		for(int i=0; i<la.length; i++) la[i]=new ArrayList<>();
		System.out.println(Arrays.toString(la));
		la[0].add(123);//NullPointerException
		System.out.println(Arrays.toString(la));
		System.out.println();
	}
}
