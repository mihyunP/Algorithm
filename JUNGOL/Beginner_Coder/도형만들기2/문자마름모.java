package Beginner_Coder.도형만들기2;

import java.util.Scanner;

/**
 * 
 * jol_1331 : 문자마름모
 * 
 * @author mihyun
 *
 */
public class 문자마름모 {
	static int N;
	static char[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // 마름모의 한 변의 길이
		arr = new char[2 * N - 1][2 * N - 1];

		init();
		
		int r = 0;
		int c = N-1;
		char alphabet = 'A';

//		arr[r][c] = alphabet;

		for (int i = N - 1; i > 0; i--) {
			// 좌하
			for (int j = 0; j < i; j++) {
				System.out.printf("1:(%d,%d) == %c\n",r,c,alphabet);
				arr[r++][c--] = alphabet++;
				if (alphabet>'Z') {
					alphabet='A';
				}
			}
//			if (r==N+1 && c== N+1) {
//				break;
//			}
			// 우하
			for (int j = 0; j < i; j++) {
				System.out.printf("2:(%d,%d) == %c\n",r,c,alphabet);
				arr[++r][++c] = alphabet++;
				if (alphabet>'Z') {
					alphabet='A';
				}
			}
			
			// 우상
			for (int j = 0; j < i; j++) {
				System.out.printf("3:(%d,%d) == %c\n",r,c,alphabet);
				arr[--r][++c] = alphabet++;
				if (alphabet>'Z') {
					alphabet='A';
				}
			}
			// 좌상
			for (int j = 0; j < i; j++) {
				System.out.printf("4:(%d,%d) == %c\n",r,c,alphabet);
				arr[--r][--c] = alphabet++;
				if (alphabet>'Z') {
					alphabet='A';
				}
			}
			++r;
//			++c;
//			--c;

			System.out.printf("(%d,%d)\n",r,c);
		}

		print();
	}

	private static void init() {
		for (int r = 0; r < 2*N-1; r++) {
			for (int c = 0; c < 2*N-1; c++) {
				arr[r][c]=' ';
			}
		}
	}

	private static void print() {
		for (int r = 0; r < 2*N-1; r++) {
			for (int c = 0; c < 2*N-1; c++) {
					System.out.printf("(%d,%d):%c",r,c,arr[r][c]);
					System.out.print(' ');
			}
			System.out.println();
		}

	}

}

// r=0이상 2*N-1미만