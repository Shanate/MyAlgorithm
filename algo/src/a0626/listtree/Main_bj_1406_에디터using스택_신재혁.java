package a0626.listtree;

import java.io.*;
import java.util.*;

public class Main_bj_1406_에디터using스택_신재혁 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine(); // 입력된 문자열 
		int	   M   = Integer.parseInt(br.readLine()); // 명령어의 개수
		
		Stack<Character> stackList = new Stack<Character>();
		
		for(int i=0; i < str.length(); i++) {
			stackList.add(str.charAt(i));
		}
		int N = stackList.size();
		
		for(int i=0; i<M; i++) {
			String command = br.readLine();
			char c = command.charAt(0);
			
			switch (c) {
			case 'L' : // move 'left' the cursor
				if (N != 0) {
					N = N-1;
				} break;
			case 'D' : // move 'right' the cursor
				if (N != str.length()) {
					N = N+1;
				} break;
			case 'B' : // 'delete' string by forward cursor
				if (N != 0) {
					stackList.remove(N-1);
					N--;
				} break;
			case 'P' : // 'add' string by forward cursor
				char s = command.charAt(2);
					stackList.add(N, s);
					N++;
					break;
			default :
					break;
			}
		}
		for(Character chr : stackList) {
			bw.write(chr);
		}
		bw.flush();
		bw.close();
		
	}
}
