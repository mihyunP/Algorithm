package Beginner_Coder.도형만들기2;

import java.util.Scanner;

/**
 * 
 * jol_1641 : 숫자삼각형
 * @author mihyun
 *
 */
public class 숫자삼각형 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 삼각형의 크기 n(n의 범위는 100 이하의 홀수)
		int m = sc.nextInt(); // 종류 m(m은 1부터 3사이의 정수)
		
		if (n>100 || n%2==0 || m<1 || m>3) {
			System.out.println("INPUT ERROR!");
			return; // 리턴꼭해주기!
		}
		
		// 1
		if (m==1) {
			int num =1;
			for (int i = 0; i < n; i++) {
				// 짝수행일때 : 순방향
				if (i%2==0) {
					for (int j = 0; j <= i; j++) {
						System.out.print(num++);
						System.out.print(' ');
					}
				// 홀수행일때 : 역방향	
				}else {
					int tmp= num+i;
					num+=i;
					for (int j = 0; j <= i; j++) {
						System.out.print(num--);
						System.out.print(' ');
					}
					num=tmp+1;
				}
				System.out.println();
			}
		}
		
		// 2
		else if (m == 2) {
			int num = 0;
			for (int i = n; i > 0; i--) {
				for (int j = 0; j < n-i ; j++) {
					System.out.print("  ");
				}
				// 9 -> 7 -> 5 -> 3 -> 1 
				for (int j = 2*i-1; j>0 ; j--) {
					System.out.print(num);
					System.out.print(' ');
//					System.out.print(num+' ');	<- 이러면 문자열로 인식함.
				}
				System.out.println();
				num++;
			}
		}
		
		// 3
		else if (m == 3) {
		
		for (int i = 0; i < n; i++) {
			if (i< n/2+1) {
				
				int num =1;	
				for (int j = 0; j <= i; j++) {
					System.out.print(num++);
					System.out.print(' ');
				}
			}else {
				int num =1;
				for (int j = 0; j <n-i; j++) {
					System.out.print(num++);
					System.out.print(' ');
					
				}
			}
			
			System.out.println();
		}
		}
		
	}

}
