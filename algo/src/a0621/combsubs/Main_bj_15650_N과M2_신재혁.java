package a0621.combsubs;

import java.util.*;

public class Main_bj_15650_N과M2_신재혁 {
    static int N, M;
    static int[] arr;
    static int[] result;
    static boolean[] v;

    static void comb(int cnt, int start) {
    	if (cnt == M) { // 조합의 길이 M에 도달하면 결과 출력
    		for (int i = 0; i < M; i++) {
    			System.out.print(result[i] + " ");
    		}
    		System.out.println();
    		return;
    	}
    	for (int i = start; i < N; i++) { //재귀 본문
    		if (!v[i]) {
    			v[i] = true;
    			result[cnt] = arr[i];
    			comb(cnt + 1, i + 1);
    			v[i] = false;
    		}
    	}
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();  M = sc.nextInt();
        arr = new int[N];
        result = new int[M];
        v = new boolean[N];

        for (int i = 0; i < N; i++) {// 1부터 N까지의 배열 생성
            arr[i] = i + 1;
        }
        comb(0, 0);
    }
}
