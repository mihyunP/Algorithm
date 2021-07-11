package Beginner_Coder.문자열;

import java.util.Scanner;

/**
 * 
 * jol_2514 : 문자열 찾기
 * @author mihyun
 *
 */
public class 문자열찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next(); // 문자열 입력, 10,000자 이하의 알파벳 대문자
		int ans1 = 0; // IOI의 개수
		int ans2 = 0; // KOI의 개수
		
		for (int i = 0; i < str.length()-2; i++) {
//			for (int j = i; j < i+3; j++) {
				if (str.charAt(i)=='K' && str.charAt(i+1)=='O'&&str.charAt(i+2)=='I') {
					ans1++;
				}else if (str.charAt(i)=='I' && str.charAt(i+1)=='O'&&str.charAt(i+2)=='I') {
					ans2++;
				}
//			}
		}
		System.out.println(ans1);
		System.out.println(ans2);
		

	}

}
