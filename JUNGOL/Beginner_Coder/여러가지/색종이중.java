package Beginner_Coder.여러가지;

import java.util.Scanner;

/**
 * 
 * jol_1671 : 색종이(중)
 * @author mihyun
 *
 */
public class 색종이중 {
	static int[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 색종이의 수
		map = new int[102][102]; // dummy 0, 101
		
		// 배열 각방 초기값 0세팅
		for (int r = 0; r < 102; r++) {
			for (int c = 0; c < 102; c++) {
				map[r][c]=0;
			}
		}
		
		
		
		for (int i = 0; i < N; i++) {
			int left = sc.nextInt(); // 왼쪽으로부터 거리
			int bottom = sc.nextInt(); // 아래쪽으로부터 거리
			
			// 색칠된 1X1 사각형 값을 1로 설정
			for (int r = bottom+1; r < bottom+11; r++) { // 0 : dummy라서
				for (int c = left+1; c < left+11; c++) {
					map[r][c]=1;
				}
			}
		}
		
		int ans =0;
		
		for (int r = 0; r < 102; r++) {
			for (int c = 0; c < 102; c++) {
				
					if (map[r][c]==1) {
						ans+=count(r,c);
					}

				
			}
		}
//		print();
		System.out.println(ans);
	}

	private static void print() {
		
		for (int r = 0; r < 102; r++) {
			for (int c = 0; c < 102; c++) {
				System.out.print(map[r][c]);
			}
			System.out.println();
		}
		
	}

	private static int count(int r, int c) {
		int cnt = 0;
		
		//변인지 체크
		if (map[r-1][c]==0) cnt++;
		if (map[r+1][c]==0) cnt++;
		if (map[r][c-1]==0) cnt++;
		if (map[r][c+1]==0) cnt++;
		
		return cnt;
	}
}

/* map[102][[102]로 설정 0, 101 : dummy 
 * r,c=1부터 r,c=101까지 상,하,좌,우 4방 탐색 결과가 0이면, cnt++
 */
