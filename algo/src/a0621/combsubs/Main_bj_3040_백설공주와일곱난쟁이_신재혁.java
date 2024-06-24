package a0621.combsubs;

import java.util.*;

public class Main_bj_3040_백설공주와일곱난쟁이_신재혁 {
  
	static int[] arr;
	static int[] pick;
	static int N = 7;
	

    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);

    	arr = new int[9];
    	pick = new int[7];
    	
    	for(int i=0; i<9; i++) {
    		arr[i]=sc.nextInt();
    	}
    	
    	comb(0,0);
    }
static void comb(int cnt, int start) {
	if(cnt==N) {
		int sum=0;
		for(int i=0; i<N; i++) {
			sum += pick[i];
		}
		if(sum==100) {
			for(int r : pick) {
				System.out.println(r);
			}
		}
		return;
	}
	for(int i=start; i<9; i++) {
		pick[cnt] = arr[i];
		comb(cnt+1,i+1);
		}
	}
}