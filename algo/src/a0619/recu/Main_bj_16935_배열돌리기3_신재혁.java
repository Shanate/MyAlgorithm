package a0619.recu;

import java.io.*;
import java.util.*;

public class Main_bj_16935_배열돌리기3_신재혁 {
	static int N, M;
	static int[][] arr;
		public static void main(String[] args) throws Exception {
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());

				 N = Integer.parseInt(st.nextToken());
				 M = Integer.parseInt(st.nextToken());
				int R = Integer.parseInt(st.nextToken());
				
				arr = new int[N][M];
				
				for (int i=0;i<N;i++) {
					st = new StringTokenizer(br.readLine());
					for(int j=0;j<M;j++) {
						arr[i][j] = Integer.parseInt(st.nextToken());
					}
				}
				
				st = new StringTokenizer(br.readLine());
				
				while (R-- >0) {
					int operation = Integer.parseInt(st.nextToken());
					
					switch (operation) {
					case 1:
						operation1(); // 상하반전
						break;
					
					case 2:
						operation2(); // 좌우반전
						break;
						
					case 3:
						operation3(); // 시계 방향 90도 회전
						break;
						
					case 4:
						operation4(); // 반시계 방향 90도 회전
						break;
						
					case 5:
						operation5(); // 시계방향 4분면 회전
						break;
						
					case 6:
						operation6(); // 반시계방향 4분면 회전
						break;
						
					}
				}
				
				
				StringBuilder sb=new StringBuilder();
				for(int i=0; i<N; i++) {
					for (int j=0; j<M; j++) {
						sb.append(arr[i][j]).append(" ");
					}
					sb.append("\n");
				}
				System.out.println(sb.toString());
			}
		
		static void operation1() {
			int[][] newArr = new int[N][M];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					newArr[i][j] = arr[N - 1 - i][j];
				}
			}
			arr = newArr;
		}
		static void operation2() {
			int[][] newArr = new int[N][M];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					newArr[i][j] = arr[i][M - 1 - j];
				}
			}
			arr = newArr;
		}
		static void operation3() {
			int[][] newArr = new int[M][N];
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					newArr[i][j] = arr[N - 1 - j][i];
				}
			}
			arr = newArr;
			int temp = N;
			N = M;
			M = temp;
		}
		static void operation4() {
			int[][] newArr = new int[M][N];
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					newArr[i][j] = arr[j][M - 1 - i];
				}
			}
			arr = newArr;
			int temp = N;
			N = M;
			M = temp;
		}
		static void operation5() {
			int[][] newArr = new int[N][M];
	        
	        // 그룹 1: 좌상
	        for (int i = 0; i < N/2; i++) {
	            for (int j = 0; j < M/2; j++) {
	                newArr[i][j] = arr[N/2 + i][j];
	            }
	        }
	        
	        // 그룹 2: 우상
	        for (int i = 0; i < N/2; i++) {
	            for (int j = M/2; j < M; j++) {
	                newArr[i][j] = arr[i][j - M/2 + M/2];
	            }
	        }
	        
	        // 그룹 3: 우하
	        for (int i = N/2; i < N; i++) {
	            for (int j = M/2; j < M; j++) {
	                newArr[i][j] = arr[i - N/2 + N/2][j];
	            }
	        }
	        
	        // 그룹 4: 좌하
	        for (int i = N/2; i < N; i++) {
	            for (int j = 0; j < M/2; j++) {
	                newArr[i][j] = arr[i][j + M/2];
	            }
	        }
	        
	        arr = newArr;
	    }
		 static void operation6() {
		        int[][] newArr = new int[N][M];
		        
		        // 그룹 1: 좌상
		        for (int i = 0; i < N/2; i++) {
		            for (int j = 0; j < M/2; j++) {
		                newArr[i][j] = arr[i][j + M/2];
		            }
		        }
		        
		        // 그룹 2: 우상
		        for (int i = 0; i < N/2; i++) {
		            for (int j = M/2; j < M; j++) {
		                newArr[i][j] = arr[i + N/2][j];
		            }
		        }
		        
		        // 그룹 3: 우하
		        for (int i = N/2; i < N; i++) {
		            for (int j = M/2; j < M; j++) {
		                newArr[i][j] = arr[i][j - M/2];
		            }
		        }
		        
		        // 그룹 4: 좌하
		        for (int i = N/2; i < N; i++) {
		            for (int j = 0; j < M/2; j++) {
		                newArr[i][j] = arr[i - N/2][j];
		            }
		        }
		        
		        arr = newArr;
		 }
}
		
