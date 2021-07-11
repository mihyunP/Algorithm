package Beginner_Coder.문자열;

import java.util.Arrays;
import java.util.Scanner;

public class 변장 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int TC = sc.nextInt(); // 테스트 케이스 TC( 1 <= TC <= 100)

		for (int tc = 1; tc <= TC; tc++) {
			int N = sc.nextInt(); // 정올이가 가진 의상의 수 N( 0 <= N <= 30)
			int[] num = new int[N];
			String[][] str = new String[N][2];
			for (int i = 0; i < N; i++) {
				str[i][0] = sc.next(); // 의상의 이름 공백 단위로 단어를 받아와야되서
				str[i][1] = sc.next(); // 의상의 종류
				// 각 문자열의 길이는 1 ~ 20 이다. 의상 이름은 유일하다.
			}
			
			
			for (int i = 0; i < N; i++) {
				System.out.println(str[i][1]);
			}
			
			
		for (int i = 0; i < N; i++) {
			num[i] = 1;
			if (i > 0) {
				if (str[i][1].equals(str[i - 1][1])) {
					num[i - 1]++;
				} else {
					num[i]++;
				}
			}
		}	
			int ans = 1; // 곱셈 초기값

			for (int i = 0; i < N; i++) {
				if (num[i] != 0) {
					ans *= (num[i] + 1);
				}
			}

//			System.out.println(ans - 1);
		}
	}
}

/* 
 * (각 종류별 옷개수 +1)*()*()*...*() -1 
 */
