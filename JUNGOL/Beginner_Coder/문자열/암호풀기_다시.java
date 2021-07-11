package Beginner_Coder.문자열;

import java.util.Scanner;

/**
 * 
 * jol_1880 : 암호풀기(Message Decoding)
 * @author mihyun
 *
 */
public class 암호풀기_다시 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sKey = sc.next(); // 복호화 키
		String sKey2 = sKey.toUpperCase();
		
		char[] cKey = sKey.toCharArray();
		char[] cKey2 = sKey2.toCharArray();
		

		
		
		sc.nextLine(); // 개행문자(엔터) 제거하기 !!!
		String sentence = sc.nextLine(); // 암호화된 문자
		char[] ans = new char[sentence.length()];

		// 복호화
		for (int n = 0; n < sentence.length(); n++) {
			
			//공백일때
			if (sentence.charAt(n)==' ') {
				ans[n]=' ';
			}
			//대문자일때
			else if (sentence.charAt(n)>='A' && sentence.charAt(n)<='Z' ) {
				ans[n]=cKey2[sentence.charAt(n)-'A']; // cKey배열에서 sentence.charAt(n)-'A'번째 방에 저장되있는 문자
			}
			// 소문자일때
			else if (sentence.charAt(n)>='a' && sentence.charAt(n)<='z') {
				ans[n]=cKey[sentence.charAt(n)-'a']; 
			}
		}
	
		System.out.print(ans);
		
	}

} 
