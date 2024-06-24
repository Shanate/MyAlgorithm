package a0619.recu;

import java.util.Scanner;

public class Factorial {
	static int fac(int N) {
		return (N>0) ? N*fac(N-1) : 1;
//		if (N>0) {
//			return N*fac(N-1);
//		} else return 1;
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int n = sc.nextInt();
		
		System.out.println(n + "의 팩토리얼은 " + fac(n) + "입니다.");
		
	}
}
