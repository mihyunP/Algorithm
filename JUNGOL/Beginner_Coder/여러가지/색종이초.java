package Beginner_Coder.여러가지;

import java.util.Scanner;

/**
 * 
 * jol_1438 : 색종이(초)
 * @author mihyun
 *
 */
public class 색종이초 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 색종이의 수
		int[][] map = new int[100][100];
		
		// 배열 각방 초기값 0세팅!
		for (int r = 0; r < 100; r++) {
			for (int c = 0; c < 100; c++) {
				map[r][c]=0;
			}
		}
		
		
		
		for (int i = 0; i < N; i++) {
			int left = sc.nextInt(); // 왼쪽으로부터 거리
			int bottom = sc.nextInt(); // 아래쪽으로부터 거리
			
			// 색칠된 1X1 사각형 값을 1로 설정
			for (int r = bottom; r < bottom+10; r++) {
				for (int c = left; c < left+10; c++) {
					map[r][c]=1;
				}
			}		
		}
		
		int ans =0;
		for (int r = 0; r < 100; r++) {
			for (int c = 0; c < 100; c++) {
				ans+=map[r][c];
			}
		}
		
		System.out.println(ans);
	}

}
