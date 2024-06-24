package a0624.stackqueue;

import java.io.*;
import java.util.*;

public class Main_bj_2164_카드2_신재혁 {
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			queue.offer(i); // 오름차순으로 큐 정렬.
		}
		
		while(queue.size() > 1) { // 원소가 한 개가 남을 때 까지
			queue.poll(); // 삭제
			queue.offer(queue.poll()); // 위 코드에서 삭제한 숫자를 아래로 삽입
		}
			System.out.println(queue.poll());
		
	}
}
