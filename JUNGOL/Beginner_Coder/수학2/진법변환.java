package Beginner_Coder.수학2;

import java.util.Scanner;

/**
 * 
 * jol_3106 : 진법 변환
 * 
 * @author mihyun
 *
 */
public class 진법변환 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// A진수 -> 10진수 -> B진수
		
		// A진수 -> 10진수
		while (true) {
			int A = sc.nextInt(); // A진법(2 ≤ A, B ≤​ 36)
			if (A == 0) {
				return;
			} // 0 입력시 종료하기
			String N = sc.next(); // A진법의 수( 0≤​ N≤​ 263-1 ) , N에 사용되는 값은 0 ~ 9, A ~ Z
			int B = sc.nextInt(); // B진법
			
			if (A==B) {
				System.out.println(N);
				continue;
			}

			long ans =0; 
			for (int i = 0; i < N.length(); i++) {
				// 숫자일 때
				if (N.charAt(i)>='0' && N.charAt(i)<='9') {
					ans+=N.charAt(i)-'0';
				// 문자일 때	
				}else if (N.charAt(i)>='A' && N.charAt(i)<='Z') {
					ans+=N.charAt(i)-55; // 'A'(65이므로) == 10
				}
//				System.out.println(ans);
				if (i==N.length()-1) {break;
				}
				ans*=A;
			}
			
//			System.out.printf("10진수 : %d\n",ans);
			
			
			// 10진수 -> B진수
			int[] arr = new int[100]; // 최대 18자리 2진수라서
			char[] cArr = new char[100];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = -1;
			}
			int i = 0;
			while (true) {
				arr[i++] = (int) (ans % B);
				ans /= B;
				if (ans <= 0) {
					break;
				}
			}

			for (int n = i - 1; n >= 0; n--) {
				cArr[n] = Character.toUpperCase(Character.forDigit(arr[n],B));

				System.out.print(cArr[n]);
			}			
			System.out.println();
			
		}

	}
}

/* 1. Hint!
 * [ Horner's Method ]
 * 
 * 2진수 1101을 자리수별 가중치를 주어 10진수로 나타내면 아래와 같다.
 * 
 * 1101 = 0 * 24 + 1 * 23 + 1 * 22 + 0 * 21 + 1 이므로
 * 
 * = (((0*2 + 1) * 2 + 1) * 2 + 0) * 2 + 1 과 같다.
 * 
 * 2. int ans 대신에 long ans 사용하기
 * 3. A진수에서 10진수로 변환시 N.charAt(i)가 숫자인 경우, 문자인 경우 char->int로 바꿀때 차이가 있으므로 경우 나눠서 생각하기
 */