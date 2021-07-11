package Beginner_Coder.수학2;

import java.util.Scanner;
/**
 * 
 * jol_2811 : 소수와 합성수
 * @author mihyun
 *
 */
public class 소수와합성수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt(); // 
			
			// 예외처리 소수인지 아닌지 확인해 볼 필요도 없음
			if (arr[i]<2) {
				System.out.println("number one");
			}else if (isPrime(arr[i])) { // 파라미터가 소수인지 아닌지 판단해주는 함수
				System.out.println("prime number");
			}else {
				System.out.println("composite number");
			}
		}
		
	}

	private static boolean isPrime(int a) {
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a%i==0) {
				return false; // 소수 탈락
			}
		}
		return true;
	}
}

/* 소수 : 1과 자기 자신만으로 나누어 떨어지는 수
 * 나눠봐야 할 수의 변화 : for(int i=2; i<n; i++) i<n(시간초과) -> i<=num/i -> i<=math.sqrt(n)
 */
