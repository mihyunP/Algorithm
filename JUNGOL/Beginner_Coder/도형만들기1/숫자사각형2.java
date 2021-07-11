package Beginner_Coder.도형만들기1;

import java.util.Scanner;

public class 숫자사각형2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 높이
		int m = sc.nextInt(); // 너비
		
		for (int i = 0; i < n; i++) {
			// 증가
			int num = i*m + 1;
			if (i%2==0) {
				for (int j = 0; j < m; j++) {
					System.out.print(num+j +" ");
				}
			}
			// 감소
			else {
				for (int j = m-1; j >= 0; j--) {
					System.out.print(num+j +" ");
				}				
			}
			
			System.out.println();
		}
	}
}
/*
 * 지그재그로 출력할 경우
 * : i%2==0 짝수행
 *   i%2!=0 홀수행으로 나눠서 생각하기
 * : 각 행별 시작값은 m만큼 증가한다.
 */