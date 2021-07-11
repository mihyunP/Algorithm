package Beginner_Coder.도형만들기1;

import java.util.Scanner;

/**
 * 
 * jol_1314. 문자사각형2 
 * @author mihyun
 *
 */
public class 문자사각형2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = 65;
		char[][] arr = new char[n][n];
		
		for (int i = 0; i < n; i++) {
			// i가 짝수열일때
		if (i%2==0) {
			for (int j = 0; j < n; j++) {
				arr[j][i] = (char)num;
				num++;
				if (num>90) {
					num = 65;
				}
			}
		}
		else {
			for (int j = n-1; j >=0 ; j--) {
				arr[j][i] = (char)num;
				num++;
				if (num>90) {
					num = 65;
				}
			}	
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
