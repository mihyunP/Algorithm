package Beginner_Coder.도형만들기1;

import java.util.Scanner;

/**
 * 
 * jol_1339 : 문자삼각형2
 * 
 * @author mihyun
 *
 */
public class 문자삼각형2_다시 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 삼각형의 높이
		if (N%2==0 || N<1 || N>100) {
			System.out.println("INPUT ERROR");
			return;
		}
		char[][] arr = new char[N][N];
		// char 2차원 배열의 기본값은 없으므로, 공백을 셋팅해주기
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				arr[r][c] = ' ';
			}
		}

		char alphabet = 'A';

		for (int c = N / 2, i = 0; c >= 0; c--, i++) {
			for (int r = N / 2 - i; r <= N / 2 + i; r++) {
				arr[r][c] = alphabet++;
				if (alphabet > 'Z') {
					alphabet = 'A';
				}
			}
		}

		// 출력
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}

	}

}

/*
1. 열 우선으로 작성하면 된다. 열 번호에 따른 행의 범위는 다음과 같다.
열 번호를 i라 하면 시작위치는 i와 같고 끝위치는 (n / 2) * 2 - i 와 같다.
2. 열번호를 만드는 바깥쪽 for문에다 int i라는 변수를 추가해서 각 열별 시작행과 끝행을 지정한다.
*/