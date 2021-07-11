package Beginner_Coder.수학2;

import java.util.Scanner;

/**
 * 
 * jol_1901 : 소수 구하기
 * 
 * @author mihyun
 *
 */
public class 소수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 처리해야 할 수의 개수(N은 100이하의 정수)
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();

			if (isPrime(arr[i])) {
				System.out.println();
				continue;
			} else {
				for (int k = 1; k < arr[i] - 1; k++) {
					if (isPrime(arr[i] - k) | isPrime(arr[i] + k)) {
						System.out.println();
						break;
					}

				}
			}

		}

	}

	private static boolean isPrime(int a) {
		if (a == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		System.out.print(a);
		System.out.print(' ');
		return true;
	}
}

/*
 * 소수(prime number)란 2이상의 수로써 1과 자기 자신 외에는 약수를 갖지 않는 수 M에 가장 가까운 소수이므로 M도 포함된다.
 * 따라서 k값은 0시작함
 */
