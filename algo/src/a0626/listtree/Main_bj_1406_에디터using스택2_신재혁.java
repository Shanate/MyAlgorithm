package a0626.listtree;

import java.io.*;
import java.util.*;

public class Main_bj_1406_에디터using스택2_신재혁 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder  sb = new StringBuilder();
		
		String str = br.readLine(); // 주어진 문자열
		int    M   = Integer.parseInt(br.readLine()); //  명령어 횟수
		
		Stack<Character> lefttStack = new Stack<Character>(); // 커서 기준 좌측 스택
		Stack<Character> rightStack = new Stack<Character>(); // 커서 기준 우측 스택
		
		for(int i=0; i<str.length(); i++) {
			lefttStack.push(str.charAt(i)); // 문자열 끝에 커서 위치 => 좌측을 전부 Push
		}
//		int	   N   = Integer.parseInt(br.readLine());

		for(int i=0; i<M; i++) {
		
		String command = br.readLine(); // L, D, B, P
		char c = command.charAt(0);
		switch (c) {
		
		case 'L' :
				if(lefttStack.isEmpty()) break;
				rightStack.push(lefttStack.pop());
				break;
		case 'D' :
				if(rightStack.isEmpty()) break;
				lefttStack.push(rightStack.pop());
				break;
		case 'B' :
				if(lefttStack.isEmpty()) break;
				lefttStack.pop();
				break;
		case 'P' :
				char s = command.charAt(2);
				lefttStack.push(s);
				break;
		default : 
				break;
		}
	}
		while(!lefttStack.isEmpty()) {
			rightStack.push(lefttStack.pop());
		}
		while(!rightStack.isEmpty()) {
			sb.append(rightStack.pop());
		}
		System.out.print(sb.toString());
	}
}
