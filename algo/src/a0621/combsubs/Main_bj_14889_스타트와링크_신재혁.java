package a0621.combsubs;

import java.io.*;
import java.util.*;

public class Main_bj_14889_스타트와링크_신재혁 {

	static int N;
	static int[][] map;
	static boolean[] visit;
	static int Min = Integer.MAX_VALUE;
	
	private static void comb(int idx, int count) { //인덱스와 조합 카운팅(=재귀 깊이)
		if(count == N/2) { //종료 조건
			
			diff();
			return;
		}
		
		for(int i=idx;i<N;i++) {
			if(!visit[i]) {
				visit[i] = true;
				comb(i+1,count+1);
				visit[i]=false;
			}
		}
	}
	
	//능력 차이 계산
	static void diff() {
		int team_start = 0;
		int team_link = 0;
		
		for (int i=0; i<N-1;i++) {
			for(int j=i+1; j<N; j++) {
				// i,j 사람이 true라면 team_start로
				if( visit[i]==true && visit[j]==true ) {
					team_start += map[i][j];
					team_start += map[j][i];
				}
				// i,j 사람이 false라면 team_link로
				else if ( visit[i]==false && visit[j]==false ) {
					team_link += map[i][j];
					team_link += map[j][i];
				}
			}
		}
		// 두 팀의 점수 차이(절댓값)
		int val = Math.abs(team_start - team_link);
		
		if(val==0) {
			System.out.println(val);
			System.exit(0);
		}

		Min=Math.min(val, Min);
		
	}
	
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		visit = new boolean[N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		comb(0, 0);
		System.out.println(Min);
	}
}
