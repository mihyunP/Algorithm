package Beginner_Coder.수학2;

import java.util.Scanner;

/**
 * 
 * jol_1534 : 10진수를 2,8,16진수로
 * 
 * @author mihyun
 *
 */
public class 십진수를이팔십육진수로2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 10진수 N(1≤N≤100,000)
		int B = sc.nextInt(); // 바꿀 진수 B(2, 8, 16)

		change(N, B);

	}

	private static void change(int N, int B) {
		// 2진수로 바꾸기
		if (B == 2) {
			int[] arr = new int[18]; // 최대 18자리 2진수라서

			for (int i = 0; i < arr.length; i++) {
				arr[i] = -1;
			}
			int i = 0;
			while (true) {
				arr[i++] = N % 2;
				N /= 2;
				if (N <= 0) {
					break;
				}
			}

			for (int n = i - 1; n >= 0; n--) {
				System.out.print(arr[n]);
			}

		}
		// 8진수로 바꾸기
		else if (B == 8) {
			int[] arr = new int[18]; // 최대 18자리 2진수라서

			for (int i = 0; i < arr.length; i++) {
				arr[i] = -1;
			}
			int i = 0;
			while (true) {
				arr[i++] = N % 8;
				N /= 8;
				if (N <= 0) {
					break;
				}
			}

			for (int n = i - 1; n >= 0; n--) {

				System.out.print(arr[n]);
			}
		}
		// 16진수로 바꾸기
		else if (B == 16) {
			int[] arr = new int[18]; // 최대 18자리 2진수라서
			char[] cArr = new char[18];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = -1;
			}
			int i = 0;
			while (true) {
				arr[i++] = N % 16;
				N /= 16;
				if (N <= 0) {
					break;
				}
			}

			for (int n = i - 1; n >= 0; n--) {
				cArr[n] = Character.toUpperCase(Character.forDigit(arr[n],16));

				System.out.print(cArr[n]);
			}
		}

	}

}