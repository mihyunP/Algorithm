package Beginner_Coder.도형만들기2;

import java.util.Scanner;

/**
 * 
 * jol_1329 : 별삼각형3
 * @author mihyun
 *
 */
public class 별삼각형3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 삼각형의 높이 N(N의 범위는 100 이하의 양의 홀수)
		if (N<0|| N>100 || N%2==0) {
			System.out.println("INPUT ERROR!");
			return;
		}
		
		for (int i = 0; i < N/2+1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < 2*i+1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		for (int i = N/2; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				System.out.print(' ');
			}
			for (int k = 2*i-1; k > 0; k--) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}

}
