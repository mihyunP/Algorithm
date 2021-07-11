package Beginner_Coder.문자열;

import java.util.Scanner;
/**
 * 
 * jol_2857 : 세로읽기
 * @author mihyun
 *
 */
public class 세로읽기 {
	static char[][]arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arr = new char[5][15];
		
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 15; c++) {
				arr[r][c]='*';
			}
		}
		
		for (int i = 0; i < 5; i++) {
			String res = sc.next();
			
			for (int j = 0; j < res.length(); j++) {
				arr[i][j] = res.charAt(j);				
			}
		}
		
		verPrint();
//		print();
	}

	private static void verPrint() {
		for (int c = 0; c < 15; c++) {
			for (int r = 0; r < 5; r++) {
				if (arr[r][c]!='*') {
					System.out.print(arr[r][c]);
				}
			}
		}
		
	}
//
	private static void print() {
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 15; c++) {
				if (arr[r][c]!='*') {
					System.out.print(arr[r][c]);
				}
			}
			System.out.println();
		}
		
	}
}

/* char[][] 배열의 각 방 요소가 자동으로null로 초기화됨? 
 * char[r][c] == null 왜에러???
 */
