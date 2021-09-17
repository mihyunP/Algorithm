import java.util.Scanner;

public class Solution {
	static int[][] arr;
	static int N, n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
   int T = sc.nextInt(); // 테스트 케이스 갯수
        for(int tc = 1; tc<= T; tc++){
		      N = sc.nextInt(); // 달팽이의 크기
		      n = N;
		      arr = new int[N][N];

//		sol1. 반복문 사용
		int dir = 1;
		int r = 0, c = -1;
		int num = 1;

		while (true) {
			for (int i = 0; i < N; i++) {
				c += dir;
				arr[r][c] = num++;
			}
			N--;

			for (int i = 0; i < N; i++) {
				r += dir;
				arr[r][c] = num++;
			}

			
			dir *= -1;
			if (N == 0) {
				break;
			}

		}
		
        System.out.println("#"+tc);
		print();
	}
    }
    
	private static void print() {

		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}

}
