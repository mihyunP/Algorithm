package Beginner_Coder.수학1;

import java.util.Scanner;

/**
 * 
 * JOL_1692 : 곱셈
 * @author mihyun
 *
 */
public class 곱셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int ans1 = num1 * (num2%10); // num2 일의 자리
		System.out.println(ans1);
		int ans2 = num1 * ((num2/10)%10); // num2 십의 자리
		System.out.println(ans2);
		int ans3 = num1*(num2/100); // num2 백의자리
		System.out.println(ans3);
		
		
		int ans4 = ans1 + ans2*10 + ans3*100;
		
		// 출력
//		System.out.println(ans1);
//		System.out.println(ans2);
//		System.out.println(ans3);
		System.out.println(ans4);
	}

}
