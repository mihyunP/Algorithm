package Beginner_Coder.여러가지;

import java.util.Scanner;

/**
 * 
 * jol_1997 : 떡 먹는 호랑이
 * 
 * @author mihyun
 *
 */
public class 떡먹는호랑이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt(); // D일째 (3≤D≤30)
		int K = sc.nextInt(); // D째 날 떡의 개수 (10≤K≤100,000)

		int A = 0; // 할머니가 호랑이를 처음 만난 날에 준 떡의 개수
		int B = 0; // 그 다음 날에 호랑이에게 준 떡의 개수

		int[] fibo = new int[D - 1]; // A, B 앞 계수
		fibo[0] = 1;
		fibo[1] = 1;

		for (int i = 2; i <= D - 2; i++) {
			fibo[i] = fibo[i - 2] + fibo[i - 1];
//			System.out.println(fibo[i]);
		}

//		변수가 2개(A, B)인 방정식
//		fibo[D-3]*A + fibo[D-2]*B = K;

		for (A = 0; A <= K; A++) {
			for (B = 0; B <= K; B++) {
				if (fibo[D-3]*A + fibo[D-2]*B == K) { // A,B에 값 넣어보면서 이 방정식 만족하면 그때의 A,B 출력하기
					System.out.println(A);
					System.out.println(B);
					return;
				}
			}
		}
	}
}
/*
 * 헤깔린 부분 : fibo[] 배열은 A, B값 그니까, 떡의 개수가 아니라 A, B 앞 계수이다.
 * 
 * A, B 앞 계수 규칙성 찾기
 */