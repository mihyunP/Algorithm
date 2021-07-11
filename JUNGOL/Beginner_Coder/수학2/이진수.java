package Beginner_Coder.수학2;

import java.util.Scanner;

/**
 * 
 * jol_2814 : 이진수
 * @author mihyun
 *
 */
public class 이진수 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String binary = sc.next(); // 공백 없는 한줄 전체
//		int[] input = new int[30]; // 30자리 이하의 이진수 저장할 배열
		int[] input = new int[binary.length()];
		int ans = 0; // 십진수
		
		for (int i = 0; i < input.length; i++) {
			input[i]=binary.charAt(i)-'0';
		}
		
//		for (int i = 0; i < input.length; i++) {
//			System.out.print(input[i]);
//		}
		
		int multi = 1;
		for (int i = input.length-1,k=0; i >=0 ; i--,k++) {
				multi=(int)Math.pow(2, k);
			
			
			ans += input[i] *multi;
//			System.out.printf("k:%d input:%d * multi:%d = ans:%d\n", k,input[i],multi,ans);
		}
		
		System.out.println(ans);
//		System.out.println(binary); // 디버깅
	}

}
