package a0625.sortkmp;

import java.io.*;
import java.util.*;

public class Main_bj_1181_단어정렬_신재혁 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 단어의 개수
		String[] arr = new String[N]; // 기존 배열
		int[] len = new int[N]; // 길이 배열
		
		for(int i=0; i<N; i++) { // 배열에 단어 삽입
			arr[i] = br.readLine();
		}
		// 1. 비교 시 길이가 같으면 오름차순. 2. 길이가 다를 때에는 길이순
		
		Arrays.sort(arr, (o1,o2) -> {
			if (o1.length() == o2.length()) {
				return o1.compareTo(o2);
			} else return Integer.compare(o1.length(), o2.length()); }); 
		
//		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		for(int i=1; i<N; i++) {
			if(!arr[i].equals(arr[i-1])) {
				System.out.println(arr[i]);
			}
		}
	}
}
//		for(int i=0; i<N; i++) { // 단어 중복 문제로 사용 X
//			System.out.println(arr[i]);
//		}

// Hashset으로 중복 단어제거 고려