package a0624.stackqueue;

import java.io.*;
import java.util.*;

public class Main_bj_10773_제로_신재혁 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Integer> stack = new Stack<Integer>();
		int K = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i=0; i<K; i++) {
			int number = Integer.parseInt(br.readLine()); // 정수를 저장 입력
			
			if(number==0) { // 이전 top을 지운다.
				stack.pop();
			} else { // 0이 아닐 시, 스택에 정수 데이터 추가
				stack.push(number);
			}
		}
		for(int o : stack) {
			sum += o;
		}
		System.out.println(sum);
	}
}
