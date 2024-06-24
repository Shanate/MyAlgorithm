package a0619.recu;

import java.util.Scanner;

public class HanoiTest {
	static void hanoi(int n, int from, int mid, int to) {
		if(n==0) return;
		hanoi(n-1,				 from,	   to,		mid);
		System.out.println(n+": "+from+"->"+to);
		hanoi(n-1,				 mid,	   from,	to);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=4;
//		int N=sc.nextInt();
		hanoi(N,1,2,3); // 1 시발점, 2 중간점, 3 종착점
		sc.close();
	}

}
