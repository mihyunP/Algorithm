package Beginner_Coder.수학2;

import java.util.Scanner;

/**
 * 
 * jol_1740 : 소수
 * 
 * @author mihyun
 *
 */
public class 소수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt(); // M이상
		int N = sc.nextInt(); // N이하

		int[] arr = new int[N - M + 1];
		int n = 0;

		int sum = 0;
		for (int i = M; i <= N; i++) {
			arr[n] = isPrime(i);
			sum += arr[n];
			n++;
		}
		if (sum == 0) {
			System.out.println("-1");
			return;
		}

		System.out.println(sum);

		for (int j = 0; j < arr.length; j++) {

			if (arr[j] != 0) {
				System.out.println(arr[j]);
				break;
			}
		}
	}

	private static int isPrime(int i) {
		if (i == 1) {
			return 0;
		}

		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (i % j == 0) {
				return 0;
			}
		}
		return i;
	}

}

/*
 * 1. 소수 없을 땐 -1 출력
 * 2. 1은 소수 아니다.
 */