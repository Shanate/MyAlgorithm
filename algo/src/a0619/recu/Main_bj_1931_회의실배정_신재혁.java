package a0619.recu;

import java.io.*;
import java.util.*;

public class Main_bj_1931_회의실배정_신재혁 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_bj_1931.txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=null;
		StringBuilder sb=new StringBuilder();
		
		int T=Integer.parseInt(br.readLine()); // 1
		for(int tc=1; tc<=T; tc++) {
			int N=Integer.parseInt(br.readLine());//11
			int[][] meetings = new int[N][2];
			for(int i =0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			meetings[i][0] = Integer.parseInt(input[0]);
			meetings[i][1] = Integer.parseInt(input[1]);
			}
			Arrays.sort(meetings, new Comparator<int[]>() {
				public int compare(int[] a, int[] b) {
					if(a[1] == b[1]) {
						return Integer.compare(a[0], b[0]);
					}
					return Integer.compare(a[1], b[1]);
				}
			});
			
			int count = 0;
			int endTime = -1;
	        for (int i = 0; i < N; i++) {
	            if (meetings[i][0] >= endTime) {
	                endTime = meetings[i][1];
	                count++;
	            }
	        }
	        int ans = count;
			sb.append("#").append(tc).append(" ").append(ans).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}