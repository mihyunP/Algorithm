package Beginner_Coder.도형만들기1;

import java.util.Scanner;

/**
 * 
 * 1341 : 구구단2
 * 
 * @author mihyun
 *
 */
public class 구구단2_1341 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int s;
		int e;
		while (true) {
			s = sc.nextInt();
			e = sc.nextInt();
			if (s >= 2 && s <= 9 && e >= 2 && e <= 9)
				break;

			System.out.println("INPUT ERROR!");
		}
		// 유효한 s,e값 입력 받는다.

		if (s <= e) {

			for (int j = s; j <= e; j++) {
				for (int i = 1; i < 10; i++) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
					if (i % 3 == 0) {
						System.out.println();
					}
				}
				System.out.println();
			}
			
		} else {
			for (int j = s; j >= e; j--) {
				for (int i = 1; i < 10; i++) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
					if (i % 3 == 0) {
						System.out.println();
					}
				}
				System.out.println();
			}
		}

	}

}
