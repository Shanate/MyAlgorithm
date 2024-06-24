package a0619.recu;

import java.io.*;
import java.util.*;

public class Main_bj_1244_스위치켜고끄기_신재혁 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_bj_1244.txt"));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
//		int T=Integer.parseInt(br.readLine());
//		for(int tc=1; tc<=T; tc++) {
			int N=Integer.parseInt(br.readLine());// 스위치 개수 입력
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] switches = new int[N+1]; // 스위치는 1번부터 시작
			for(int i = 1; i <= N; i++) {
				switches[i] = Integer.parseInt(st.nextToken());
			}
			
			//학생 수
			int students = Integer.parseInt(br.readLine());
			//학생 정보
			for (int i = 0; i < students; i++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				int gender = Integer.parseInt(st2.nextToken());
				int num = Integer.parseInt(st2.nextToken());
				
				if (gender==1) { // 남자일 경우
					for (int j = num; j<=N; j += num) { // 뽑은 수가 스위치 개수 때까지 1씩 증가하며 생각함. 따라서 j에 뽑은 수 num만큼 증가하면 배수 표현이 된다.
						switches[j] = 1 - switches[j]; // 스위치 변환 0->1, 1->0
					}
				} else { // 여자일 경우, 본인 스위치 포함 좌우 대칭일 경우 스위치 변환.
					int left = num  - 1;
					int right = num + 1;
					
					while(left >= 1 && right <= N && switches[left] == switches[right]) {
						switches[left] = 1 - switches[left];
						switches[right] = 1 - switches[right];
						left--;
						right++;
					}
					switches[num] = 1 - switches[num];
				}
			}
			
			for (int i = 1; i <= N; i++) {
				 sb.append(switches[i]).append(" ");
				 if (i%20==0) {
					 sb.append("\n");
				 }
			}
			
		
//			sb.append("#").append(tc).append(" ").append("ans").append("\n");
//		}
			System.out.print(sb.toString());
			br.close();
	}
}

//첫째 줄에는 100 개 이하의 스위치 개수
//둘째 줄에는 각 스위치의 상태
//셋째 줄에는 100 명 이하의 학생 수
//넷째 줄부터 마지막 줄은 성별, 받은 수[남학생은 1, 여학생은 2]
//남학생은 받은 수의 배수에 따른 스위치 상태를 바꾼다.
//여학생은 받은 수의 좌우대칭이 될 때 스위치를 바꿔나간다.