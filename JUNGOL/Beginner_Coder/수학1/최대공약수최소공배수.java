package Beginner_Coder.수학1;

import java.util.Scanner;

public class 최대공약수최소공배수 {
	static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 정수의 개수 (2≤N≤10)
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i]= sc.nextInt(); // N개의 정수
		}

		int gcd, lcm;

		gcd = lcm = arr[0];
		for (int i = 1; i < N; i++) {
			gcd = gcd_get(gcd, arr[i]);
			lcm = lcm / gcd_get(lcm, arr[i]) * arr[i];
		}
		
		
		System.out.print(gcd+" "+lcm);
	}

	private static int gcd_get(int gcd, int num) {
		int ans = 1;
		for (int i = 1; i <= Math.min(gcd, num); i++) {
			if (gcd % i == 0 && num % i == 0) {
				ans = i;
				System.out.println(ans);
			}
		}
		return ans;
	}
}
/*
두 개의 수 A와 B의 최대공약수를 D라 하면, 세 개의 수 A, B, C의 최대공약수는 D와 C의 최대공약수와 같다.
-> 두 수의 최대공약수를 구해주는 함수 하나로 입력받은 여러 수의 최대공약수 구하기 가능.
*/
