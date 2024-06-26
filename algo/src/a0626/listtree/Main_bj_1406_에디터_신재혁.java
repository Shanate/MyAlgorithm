package a0626.listtree;

import java.util.*;
import java.io.*;

public class Main_bj_1406_에디터_신재혁 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine(); // 입력된 문자열
		int    M	 = Integer.parseInt(br.readLine()); // 명령어의 개수
		
		LinkedList<Character> list = new LinkedList<Character>();
		
		for(int i=0; i<str.length(); i++) {
			list.add(str.charAt(i));
		}
		int N = list.size(); // 문자열 맨 마지막에 커서 위치 // length가 배열의 길이를 반환한다면, size는 컬렉션 타입의 길이를 반환한다.
		
		for(int i=0; i<M; i++) { // M번의 명령어
			
			String command = br.readLine(); // L, D, B, P _
			char c = command.charAt(0);
			switch (c) {
			case 'L' :
					if(N !=0) {
						N=N-1;
					} break;
			case 'D' :
					if(N !=str.length()) {
						N=N+1;
					} break;
			case 'B' :
					if(N !=0) {
						list.remove(N-1); // 커서의 앞 문자열 삭제
					} break;
			case 'P' :
					char s = command.charAt(2);
					list.add(N, s);
					N++;
					break;
			default :
					break;
			}
		} // M번 명령어 for 문에 대한 닫힘
		for(Character chr : list) {
				bw.write(chr);
		}
		bw.flush();
		bw.close();
	}
}