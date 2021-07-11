package Beginner_Coder.도형만들기2;

import java.util.Scanner;

/**
 * 
 * jol_2071 : 파스칼 삼각형
 * @author mihyun
 *
 */
public class 파스칼삼각형 {
	static int n, m;
	static int[][] arr;
	static char[][] cArr;
	static String[][] sArr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt(); // 삼각형의 높이(1부터 30사이의 정수)
		m = sc.nextInt(); // 종류(1부터 3사이의 정수)

		arr = new int[n][n];
		cArr = new char[n][n];
		sArr = new String[n][n];

		for (int r = 0; r < n; r++) {
			for (int c = 0; c <= r; c++) {
				if (r == 0 || c == 0 || c == r) {
					arr[r][c] = 1;

				} else {
					arr[r][c] = arr[r - 1][c - 1] + arr[r - 1][c];
				}
			}
		}

		InttoChar();

		// m == 1
		if (m == 1) {
			print();

		// m == 2
		} else if (m == 2) {		
			for (int r = n-1; r >= 0; r--) {
				
				// 여백 세팅
				for (int c = 0; c < n-1-r; c++) {
					System.out.print(' ');
				}
				
				// 숫자 세팅
				for (int c = 0; c <= r; c++) {
					System.out.print(arr[r][c]);
					System.out.print(' ');
				}
				System.out.println();
			}
			
		// m == 3
		} else if (m == 3) {
			for (int c = n-1; c >=0 ; c--) {
				for (int r = n-1; r >=c; r--) {
					System.out.print(arr[r][c]);
					System.out.print(' ');
				}
				System.out.println();
			}
		}

	}

	private static void InttoChar() {
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c++) {
				if (arr[r][c] == 0) {
					cArr[r][c] = ' ';
				} else {
//					cArr[r][c]=(char)arr[r][c];
					sArr[r][c] = Integer.toString(arr[r][c]);
				}
			}
		}
	}

	private static void print() {
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c++) {
				if (arr[r][c]!=0) {
					System.out.print(arr[r][c]);
				}
				System.out.print(' ');
			}
			System.out.println();
		}

	}

}

/*
 * 배열 입력 팁 : if(조건식) { 조건이 참일 때 실행할 문장;} else { 조건이 거짓일 때 실행할 문장; } != if(조건식){
 * 조건이 참일 때 실행할 문장; } 항상 실행할 문장; ==> 따라서, else문에 넣지 않으면 조건에 상관없이 함상 실행한다.
 * 
 * 배열 출력 팁 : <생각하기>> 종류 1과 같이 배열에 저장을 한 후 m의 값에 따라 출력을 바꾸면 된다. 종류 2의 경우는 배열의
 * 아래쪽부터 출력을 하면 된다. 종류 3의 경우는 각 위치에 출력되는 배열의 번호를 적어놓고 생각해 보자.
 * 
 */

// 1. int -> char 전환 뭐가 잘못 됐는지? : char배열 초기화 안해서
// 2. int 자료형은 공백 출력 불가능? : 불가능 if(arr[r][c]!=0) 사용, 또는 for(int c=0; c<=r; c++) 사용
// 3. char 자료형 사칙연산(+, -, *, / ) 불가능? : '1'-0 + '1'- 0 이런식으로 int 자료형으로 형변환 해야함.