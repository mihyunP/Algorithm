package Beginner_Coder.문자열;

import java.util.Scanner;

/**
 * 
 * jol_2604 : 그릇
 * @author mihyun
 *
 */
public class 그릇 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next(); // 문자열의 길이는 3이상 50 이하
		
		// 첫접시 높이는 무조건 +10
		int ans = 10;
		
		// 두번째 접시 높이부터 이전과 다른 방향 +10, 같은 방향 +5
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i-1)!=str.charAt(i)) {
				ans+=10;
			}else if (str.charAt(i-1)==str.charAt(i)) {
				ans+=5;
			}			
			}
		System.out.println(ans);
		}
		
	}