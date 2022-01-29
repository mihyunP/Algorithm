package BOJ;

import java.util.Scanner;

public class 체스판다시칠하기 {

	static int N; // N행
	static int M; // M열
	static char[][] arr; // 체스판

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int res = Integer.MAX_VALUE; // 다시 칠해야 하는 정사각형의 최소 개수

		N = sc.nextInt();
		M = sc.nextInt();

		arr = new char[N][M];

//		System.out.println(N);
//		System.out.println(M);

		for (int r = 0; r < N; r++) {

			String str = sc.next();
			for (int c = 0; c < M; c++) {
				arr[r][c] = str.charAt(c); // java 문자 입력
			}

		} // 2차원 배열 세팅 완료

//		print();

		for (int r = 0; r <= N - 8; r++) {
			for (int c = 0; c <= M - 8; c++) {
				// (r,c) : 맨왼쪽위 좌표(8X8 체스판 시작 좌표)
				// r,c부터 r+8,c+8까지 탐색하며 다시 칠해야 하는 정사각형 갯수 구하기
				// i) (r,c)가 'B'인 경우, ii) (r,c)가 'W'인 경우

//				System.out.println("r:"+ r+",c:"+ c);

//				i) arr[r][c]가 'B'인 경우
				char color = 'W';
				int cntB = 0; // 각 체스판 별로 다시 칠해야 하는 정사각형 갯수

				for (int i = r; i < r + 8; i++) {
					color = (color == 'W') ? 'B' : 'W';// 삼항 연산자, W<-B 이전 줄 마지막 칸과 색깔이 같아야해서
					for (int j = c; j < c + 8; j++) {
						if (arr[i][j] == color) { // arr[i][j]를 arr[r][c]라고 써서 계속 틀림 :(,,, 변수명 조심하자!!!
							; // 다시 칠할 필요가 없는 경우
						} else {
							cntB++; // 다시 칠해야하는 경우 
						}

						color = (color == 'W') ? 'B' : 'W';// 삼항 연산자, W<->B 다음칸은 현재칸과 색깔이 달라해

					}
				}

//				ii) arr[0][0]가 'W'인 경우
				color = 'B';
				int cntW = 0; // 각 체스판 별로 다시 칠해야 하는 정사각형 갯수
				for (int i = r; i < r + 8; i++) {
					color = (color == 'W') ? 'B' : 'W';
					for (int j = c; j < c + 8; j++) {
						if (arr[i][j] == color) {
							;
						} else {
							cntW++;
						}

						color = (color == 'W') ? 'B' : 'W';

					}
				}

				int cntRes = Math.min(cntW, cntB);

				res = Math.min(cntRes, res);

			}

		}

		System.out.println(res);

	}

	private static void print() {
		// TODO Auto-generated method stub
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				System.out.print(arr[r][c]);
			}
			System.out.println();
		}
	}

}
