package Beginner_Coder.도형만들기2;

import java.util.Scanner;

/**
 * 
 * jol_1719 : 별삼각형2
 * 
 * @author mihyun
 *
 */
public class 별삼각형2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 삼각형의 높이
		int m = sc.nextInt(); // 종류

		if (n % 2 == 0 || n > 100 || m < 1 || m > 4) {
			System.out.println("INPUT ERROR!");
			return;
		}

		// 1
		if (m == 1) {
			for (int i = 0; i < n; i++) {
				if (i <= n / 2) {
					for (int j = 1; j <= i + 1; j++) {
						System.out.print("*");
					}
					System.out.println();
				} else {
					for (int j = 1; j <= n - i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}

		// 2
		else if (m == 2) {
			for (int i = 0; i < n; i++) {
				// 앞 여백
				for (int j = 0; j < Math.abs(n / 2 - i); j++) {
					System.out.print(" ");
				}

				if (i <= n / 2) {
					for (int j = 1; j <= i + 1; j++) {
						System.out.print("*");
					}
					System.out.println();
				} else {
					for (int j = 1; j <= n - i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
		// 3
		else if (m == 3) {
			for (int i = 0; i < n; i++) {
				
				if (i <= n / 2) {
					// 앞 여백
					for (int k = 0; k <i; k++) {
						System.out.print(' ');
					}
					for (int j = 0; j < n - 2*i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				else {
					// 앞 여백
					for (int k = (n/2)*2 -i ; k >0; k--) {
						System.out.print(' ');
					}
					for (int j = 0; j < -n + 2*(i+1); j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
		// 4
		else if (m == 4) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <i; j++) {
					if (j>=n/2) { break; }
					System.out.print(' ');
				}
				// 
				if (n/2-i>0) {
					for (int k = n/2+1-i; k > 0 ; k--) {
						System.out.print('*');
					}
				}
				else {
					for (int k = i-n/2+1; k >0 ; k--) {
						System.out.print('*');
					}
				}
				System.out.println();
			}
		}

	}

}

/*
 * for문 일일히 나열해보고 숫자 사이의 규칙 찾기 <- 수열처럼
 */