package a0619.recu;

import java.util.Scanner;

public class EuclidGCD {
	
	static int GCD(int X, int Y) {
		if (Y == 0) {
			return X;
		} else return GCD(Y, X%Y);
		 
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수의 최대공약수를 구합니다.");
		
		System.out.print("정수를 입력하세요.");
		int A = sc.nextInt();
		System.out.print("정수를 입력하세요.");
		int B = sc.nextInt();
		
		System.out.println("최대공약수는 " + GCD(A,B) + "입니다.");
				
	}
}
