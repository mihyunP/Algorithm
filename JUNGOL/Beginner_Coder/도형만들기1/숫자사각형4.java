package Beginner_Coder.도형만들기1;

import java.util.Scanner;

public class 숫자사각형4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt(); // 한 변의 길이
		int m = sc.nextInt(); // 종류
		
		int[][] arr = new int[n][n]; 
		
		//종류 1 
		if (m==1) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = i+1;
			}
		}
			
		}
		//종류 2
		else if (m==2) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i%2==0) {
						arr[i][j] = j+1;
								
					}else {
						arr[i][j] = n-j;
					}
				}
			}
		}
		
		//종류 3
		else if (m==3) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = (i+1)*(j+1);
				}
			}
		}
		
		
		// 출력(공통 부분)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

/* 팁 : 숫자사각형을 배열로 만들어서 출력 
 */