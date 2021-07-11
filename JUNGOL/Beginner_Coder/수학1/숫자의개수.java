package Beginner_Coder.수학1;

import java.util.Scanner;

/**
 * 
 * jol_1430 : 숫자의 개수
 * @author mihyun
 *
 */
public class 숫자의개수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int ans = num1 * num2 * num3;
//		System.out.println(ans); <-디버깅
		
		int[] arr = new int[10]; // 0~9개수 저장할 배열
		while(ans>0) {
			arr[ans%10]++;// 나머지들
			ans/=10;
//			System.out.println(ans); //<- 디버깅
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
		
	}

}