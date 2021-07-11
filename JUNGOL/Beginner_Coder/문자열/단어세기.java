package Beginner_Coder.문자열;

import java.util.Arrays;
import java.util.Scanner;

/**
 * jol_1516 : 단어 세기
 * 
 * @author mihyun
 *
 */
public class 단어세기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.nextLine(); // 공백까지 입력받음

			if (str.equals("END")) {
				break;
			}

			String[] word = str.split(" "); // 공백을 기준으로 나누니까, 공백 기준으로 끊어서 각각의 String 배열로 만든다. 
			
//			for (int i = 0; i < word.length; i++) {
//				System.out.println(word[i]);
//			}

			// 문자열 알파벳 순으로 정렬 후 갯수 세기
			Arrays.sort(word);
			
//			// 디버깅(정렬 후 출력) 알파벳 순으로 
//			for (int i = 0; i < word.length; i++) {
//				System.out.println(word[i]);
//			}
			
			int idx=0; int cnt =1;
			for (int i = 1; i < word.length; i++) {
				if (!word[idx].equals(word[i])) {
					System.out.println(word[idx]+" "+":"+" "+cnt);
					idx=i;
					cnt=1; // 횟수 초기화
					continue;
				}
				cnt++;
			}
			
			System.out.println(word[idx]+" "+":"+" "+cnt);
		}

	}

}
