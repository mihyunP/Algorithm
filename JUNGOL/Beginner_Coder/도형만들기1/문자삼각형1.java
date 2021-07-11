package Beginner_Coder.도형만들기1;

import java.util.Scanner;

/**
 * jol_1338 : 문자삼각형1
 * @author mihyun
 */
public class 문자삼각형1 {
	public static void main(String[] args) {
/*
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		char [][]arr = new char[N][N];
		char alphabet ='A';
		
		
		for (int i = 0; i < N; i++) {
		    for (int j = i, k = N-1; j < N; j++, k--) {
		        arr[j][k] = alphabet++;
		        if(alphabet > 'Z')
		            alphabet = 'A';
		    }
		}

		// 출력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
*/
Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		char[][] res = new char[N][N];
		
		// char 2차원 배열의 기본값은 없으므로, 공백을 셋팅해주기
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				res[i][j] = ' ';
			}
		}
		
		// char에서 A(65) ~ Z(90)
		int text = 65;
		int temp = 0;
		
		for (int row = 0; row < N; row++) {
			for (int i = 0; row+i < N; i++) {
				res[row+i][N-1-i] = (char) (text+temp%26);		// 알파벳 개수 만큼 반복되도록
				temp++;
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}		
	}
}