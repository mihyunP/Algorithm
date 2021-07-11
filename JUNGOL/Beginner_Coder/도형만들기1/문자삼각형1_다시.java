package Beginner_Coder.도형만들기1;

import java.util.Scanner;

/**
 * 
 * jol_1338 : 문자삼각형1
 * @author mihyun
 *
 */
public class 문자삼각형1_다시 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt(); // 삼각형의 높이 N(N의 범위는 100 이하의 양의 정수)
		char[][] arr =new char[N][N];
		
		// 21~25line 이거 안쓰면 왜 안되는지???
		// int형 배열일 때 0처럼 자동 초기화X???
//		for (int r = 0; r < N; r++) {
//			for (int c = 0; c < N; c++) {
//				arr[r][c] = ' ';
//			}
//		}
		
		char alphabet = 'A';
		

		
		for (int i = 0; i < N; i++) {
			for (int r = i, c=N-1; r < N; r++, c--) {
				arr[r][c] = alphabet++;
				if (alphabet>'Z') { // 알파벳 대문자 범위를 벗어날 때 A로 초기화 해줘야 함.
					alphabet = 'A';
				}
			}
		}
		
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {				
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
	}

}