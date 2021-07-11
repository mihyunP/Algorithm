package Beginner_Coder.도형만들기2;

import java.util.Scanner;

/**
 * 
 * jol_2074 : 홀수 마방진
 * @author mihyun
 *
 */
public class 홀수마방진 {
	static int n;
	static int[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); // 정사각형의 크기 n(2부터 100사이의 홀수)
		arr = new int[n][n];
		
		fill();
		print();

	}


	static void fill() {
	    int r = 0; // 행 - 처음에는 0
	    int c = n / 2; // 열 - 초기값 중앙
	    int i; // 배열에 순서대로 채울 값 (for 문에 사용할 변수)
	    int end = n * n; // 배열에 채울 마지막 값
	 
	    for (i = 1; i <= end; i++)   // 배열에 채울 값 1부터 end까지
	    {
	        arr[r][c] = i; // i를 배열의 현재 위치에 넣는다.
	        if (i % n == 0) r++;  // 만약 현재의 수가 n의 배수이면 아래로 이동
	        else
	        {
	            r--; c--; // 왼쪽 위로 이동
	            if (r < 0) r = n-1; // x가 0이면 n으로
	            if (c < 0) c = n-1; // y가 0이면 n으로
	        }
	    }
	}
	
	private static void print() {
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c++) {
				System.out.print(arr[r][c]);
				System.out.print(' ');
			}
			System.out.println();
		}
		
	}

}
/* 마방진 : 1부터 N*N까지의 숫자를 한 번씩만 써서 정사각형에 배치하여 가로와 세로, 그리고 대각선의 합이 같도록 하는 것
 */
