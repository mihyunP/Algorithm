package Beginner_Coder.도형만들기1;

import java.util.Scanner;

public class 문자삼각형2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();// 삼각형의 높이 (1이상 100 이하의 홀수)
		if (N%2==0||N<=0||N>100) {
			System.out.println("INPUT ERROR");
			return;
		}
		char[][] arr = new char[N][N];

		char alphabet = 'A';
		
		for (int i = N/2; i >= 0; i--) {
			for (int j = i; j < i+2*(N/2-i)+1; j++) {
				arr[j][i] = alphabet++; // 알파벳 증가
				if (alphabet>'Z') {
					alphabet = 'A'; // 범위 넘어가면 다시 'A'
				}
			}
		}
	
	// 출력
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
			if (arr[i][j]=='\0') {
				arr[i][j]=' ';
			}
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
		
	}

}

// 왜 공백처리???