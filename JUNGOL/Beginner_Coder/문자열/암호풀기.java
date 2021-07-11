package Beginner_Coder.문자열;

import java.util.Scanner;

/**
 * 
 * jol_1880 : 암호풀기(Message Decoding)
 * @author mihyun
 *
 */
public class 암호풀기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sKey = sc.next(); // 복호화 키
		String sKey2 = sKey.toUpperCase();
		
		char[] cKey = sKey.toCharArray();
		char[] cKey2 = sKey2.toCharArray();
		
//		for (int i = 0; i < cKey.length; i++) {
//			System.out.print(cKey[i]);
//		}
//		for (int i = 0; i < cKey.length; i++) {
//		System.out.print(cKey2[i]);
//		}
		
		
		sc.nextLine(); // 엔터 제거하기 !!!
		String sentence = sc.nextLine(); // 암호화된 문자
		char[] ans = new char[sentence.length()];

		// 복호화
		for (int n = 0; n < sentence.length(); n++) {
			if (sentence.charAt(n)==' ') {
			ans[n]=' ';
			}
			else if (sentence.charAt(n)=='A') {
				ans[n]=cKey2[0];
			}else if (sentence.charAt(n)=='a') {
				ans[n]=cKey[0];
			}
			else if (sentence.charAt(n)=='B') {
				ans[n]=cKey2[1];
			}else if (sentence.charAt(n)=='b') {
				ans[n]=cKey[1];
			}
			else if (sentence.charAt(n)=='C') {
				ans[n]=cKey2[2];
			}else if (sentence.charAt(n)=='c') {
				ans[n]=cKey[2];
			}
			else if (sentence.charAt(n)=='D') {
				ans[n]=cKey2[3];
			}else if (sentence.charAt(n)=='d') {
				ans[n]=cKey[3];
			}
			else if (sentence.charAt(n)=='E') {
				ans[n]=cKey2[4];
			}else if (sentence.charAt(n)=='e') {
				ans[n]=cKey[4];
			}
			else if (sentence.charAt(n)=='F') {
				ans[n]=cKey2[5];
			}else if (sentence.charAt(n)=='f') {
				ans[n]=cKey[5];
			}
			else if (sentence.charAt(n)=='G') {
				ans[n]=cKey2[6];
			}else if (sentence.charAt(n)=='g') {
				ans[n]=cKey[6];
			}
			else if (sentence.charAt(n)=='H') {
				ans[n]=cKey2[7];
			}else if (sentence.charAt(n)=='h') {
				ans[n]=cKey[7];
			}
			else if (sentence.charAt(n)=='I') {
				ans[n]=cKey2[8];
			}else if (sentence.charAt(n)=='i') {
				ans[n]=cKey[8];
			}
			else if (sentence.charAt(n)=='J') {
				ans[n]=cKey2[9];
			}else if (sentence.charAt(n)=='j') {
				ans[n]=cKey[9];
			}
			else if (sentence.charAt(n)=='K') {
				ans[n]=cKey2[10];
			}else if (sentence.charAt(n)=='k') {
				ans[n]=cKey[10];
			}
			else if (sentence.charAt(n)=='L') {
				ans[n]=cKey2[11];
			}else if (sentence.charAt(n)=='l') {
				ans[n]=cKey[11];
			}
			else if (sentence.charAt(n)=='M') {
				ans[n]=cKey2[12];
			}else if (sentence.charAt(n)=='m') {
				ans[n]=cKey[12];
			}
			else if (sentence.charAt(n)=='N') {
				ans[n]=cKey2[13];
			}else if (sentence.charAt(n)=='n') {
				ans[n]=cKey[13];
			}
			else if (sentence.charAt(n)=='O') {
				ans[n]=cKey2[14];
			}else if (sentence.charAt(n)=='o') {
				ans[n]=cKey[14];
			}
			else if (sentence.charAt(n)=='P') {
				ans[n]=cKey2[15];
			}else if (sentence.charAt(n)=='p') {
				ans[n]=cKey[15];
			}
			else if (sentence.charAt(n)=='Q') {
				ans[n]=cKey2[16];
			}else if (sentence.charAt(n)=='q') {
				ans[n]=cKey[16];
			}
			else if (sentence.charAt(n)=='R') {
				ans[n]=cKey2[17];
			}else if (sentence.charAt(n)=='r') {
				ans[n]=cKey[17];
			}
			else if (sentence.charAt(n)=='S') {
				ans[n]=cKey2[18];
			}else if (sentence.charAt(n)=='s') {
				ans[n]=cKey[18];
			}
			else if (sentence.charAt(n)=='T') {
				ans[n]=cKey2[19];
			}else if (sentence.charAt(n)=='t') {
				ans[n]=cKey[19];
			}
			else if (sentence.charAt(n)=='U') {
				ans[n]=cKey2[20];
			}else if (sentence.charAt(n)=='u') {
				ans[n]=cKey[20];
			}
			else if (sentence.charAt(n)=='V') {
				ans[n]=cKey2[21];
			}else if (sentence.charAt(n)=='v') {
				ans[n]=cKey[21];
			}
			else if (sentence.charAt(n)=='W') {
				ans[n]=cKey2[22];
			}else if (sentence.charAt(n)=='w') {
				ans[n]=cKey[22];
			}
			else if (sentence.charAt(n)=='X') {
				ans[n]=cKey2[23];
			}else if (sentence.charAt(n)=='x') {
				ans[n]=cKey[23];
			}
			else if (sentence.charAt(n)=='Y') {
				ans[n]=cKey2[24];
			}else if (sentence.charAt(n)=='y') {
				ans[n]=cKey[24];
			}
			else if (sentence.charAt(n)=='Z') {
				ans[n]=cKey2[25];
			}else if (sentence.charAt(n)=='z') {
				ans[n]=cKey[25];
			}
			
			
			
			
		}
		
//		System.out.println(sentence);
//		System.out.println("출력");
	
		System.out.print(ans);
		
	}

}

/*
 *String ans; 
 *ans.charAt(n)=' '; 왜안됨?
 */
