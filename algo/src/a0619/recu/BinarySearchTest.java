package a0619.recu;

import java.io.*;
import java.util.*;

public class BinarySearchTest {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_bj_0000.txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=null;
		StringBuilder sb=new StringBuilder();
		
		int T=Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			int N=Integer.parseInt(br.readLine());
			int[] a=new int[N];
			st=new StringTokenizer(br.readLine()," ");
			for (int i = 0; i < N; i++) {
				a[i]=Integer.parseInt(st.nextToken());
			}
//			System.out.println(Arrays.toString(a));System.out.println(); //1차원배열
//			for(int[] b:aa) System.out.println(Arrays.toString(a));System.out.println(); //2차원배열
			int key=Integer.parseInt(br.readLine());
			int ans=Arrays.binarySearch(a, key);
			sb.append("#").append(tc).append(" ").append(ans).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}