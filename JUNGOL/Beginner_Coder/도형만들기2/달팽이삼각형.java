package Beginner_Coder.도형만들기2;

import java.util.Scanner;

/**
 * 
 * jol_1337 : 달팽이삼각형
 * 
 * @author mihyun
 *
 */
public class 달팽이삼각형 {
	static char[][] arr;
	static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		arr = new char[N][N];

		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				arr[r][c] = ' ';
			}
		}

		char num = '0';
		int r=-1, c=-1; // 달팽이삼각형 전체의 r, c를 하나로 이어서 관리한다.
		for (int i = N, turn=0; i > 0; i--,turn++) {
			// 1. 대각선
			// if turn%3==0
			if (turn%3==0) {
				int k;
				for (r = r+1, c = c+1,k=0; k < i; r++, c++,k++) { // i회 반복
//					System.out.print("r1:"+r);
//					System.out.println(" c1:"+c);
					arr[r][c] = num++;
					
					if (num > '9') {
						num = '0';
					}
				}
				r--; c--;
			}

			// 2. 우 -> 좌
			//elseif turn%3==1;
			else if (turn%3==1) {
				int k;
				for (c=c-1,k=0 ;k<i ; c--,k++) { // i회 반복
//					System.out.print("r2:"+r);
//					System.out.println(" c2:"+c);
					arr[r][c] = (char) num++;
					
					if (num > '9') {
						num = '0';
					}
				}	
				c++;
			}
			// 3. 하 -> 상
			//elseif turn%3==2;
			
			else if (turn%3==2) {
				
				int k=0;
				for (r=r-1, k=0;k<i ; r--,k++) { // i회 반복
//					System.out.print("r3:"+r);
//					System.out.println(" c3:"+c);
					arr[r][c] = (char) num++;
					if (num > '9') {
						num = '0';
					}
				}
				r++;
			}
			
			}
			
		print();
		}

	

	private static void print() {
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				System.out.print(arr[r][c]);
				System.out.print(' ');
			}
			System.out.println();
		}
	}

}

/*
좌표값 디버깅 찍어보기
*/