package Beginner_Coder.도형만들기1;

import java.util.Scanner;

/**
 * 
 * jol_1303 : 숫자사각형1
 * @author mihyun
 *
 */
public class 숫자사각형1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 높이
		int m = sc.nextInt(); // 너비
		
		int num =1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
		
	}

}
