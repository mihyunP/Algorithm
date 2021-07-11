package Beginner_Coder.도형만들기2;

import java.util.Scanner;

/**
 * 
 *jol_1523 : 별삼각형1 
 * @author mihyun
 *
 */
public class 별삼각형1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 삼각형의 크기(n의 범위는 100 이하의 자연수)
		int m = sc.nextInt(); // 종류(m은 1부터 3사이의 자연수)
		
		if (n<1 || n> 100 || m<1 || m>3) {
			System.out.println("INPUT ERROR!");
			return;
		}
		// 종류 1
		if (m==1) {
			
			for (int i = 1; i <= n; i++) {
				for (int j = i; j >0; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		// 종류 2	
		}else if (m==2) {
			
			for (int i = n; i > 0; i--) {
				for (int j = i; j >0; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		// 종류 3	
		}else if (m==3) {
			for (int k = n, j = 1; k > 0; k--, j+=2) {
				for (int i = k-1; i >0 ; i--) {
					System.out.print(" ");
				}
				for (int i = 1; i <=j;i++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
	}

}
