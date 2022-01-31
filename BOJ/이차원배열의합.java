package week1;

import java.util.Scanner;

public class 이차원배열의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // N행
		int M = sc.nextInt(); // M열
		
		int[][]arr = new int[N][M];
		
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				arr[r][c] = sc.nextInt(); 
			}
		} // arr 이차원 배열 세팅 끝
		
		int K = sc.nextInt(); // 합을 구할 부분의 개수 K(1 ≤ K ≤ 10,000)
		
		for (int n = 0; n < K; n++) {
			int sum = 0;
		//  네 개의 정수로 i, j, x, y(i ≤ x, j ≤ y)
			int i = sc.nextInt();
			int j = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int r = i-1; r < x; r++) {
				for (int c = j-1; c < y; c++) {
					sum+=arr[r][c];
				}
			}
			System.out.println(sum);
		}

	}

}
