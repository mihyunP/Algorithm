package Beginner_Coder.도형만들기1;

import java.util.Scanner;

/**
 * 
 * jol_1304 : 숫자사각형3
 * @author mihyun
 *
 */
public class 숫자사각형3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		int num =1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[j][i]=num++;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

/* 열 우선 출력
 * : arr[i][j]가 아니라 arr[j][i]에다가  num++값을 넣는다.
 */