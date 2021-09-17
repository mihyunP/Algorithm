import java.util.Scanner;

public class Solution {
	static int[][] arr;
	static int N, n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); // 테스트 케이스 수
		for(int tc=1; tc<=T;tc++){
       	N = sc.nextInt(); // 달팽이의 크기
        n = N;
		    arr = new int[N][N];    
		    int dir = -1;
		    int r = 0, c = -1;
		    int num = 1;
            
    // 재귀 함수
		recursive(dir, r, c, num, 2 * N);
		
        System.out.println("#"+tc);    
		print();
        }
	}

	private static void recursive(int dir, int r, int c, int num, int k) {

		// 종료 조건
		if (k / 2 == 0) {
			return;
		}

		if (k % 2 == 0) {
			dir *= -1;
		} // k가 짝수일 때 한번만 해줘야하기 때문에 for문 밖에서 해준다.
		
		for (int i = 0; i < k / 2; i++) {
			if (k % 2 == 0) {
				c += dir;
			} else {
				r += dir;
			}
			arr[r][c] = num++;
		}
		recursive(dir, r, c, num, k - 1);

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
