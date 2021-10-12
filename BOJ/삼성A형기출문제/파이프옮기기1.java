package BOJ.삼성A형기출문제;
import java.util.Scanner;

/**
 * 
 * BOJ17070. 파이프 옮기기1
 * @author multicampus
 *
 */
public class 파이프옮기기1 {
	static int N;
	static int[][] arr;
	static int cnt;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); // 집의 크기 N(3 ≤ N ≤ 16)
		arr = new int[N+1][N+1]; // 집의 상태(0 : 빈칸, 1: 벽)
		
		for (int r = 1; r < N+1; r++) {
			for (int c = 1; c < N+1; c++) {
				arr[r][c] = sc.nextInt(); 
			}
		}
		
//		print();
		
//		(1, 1), (1, 2)에 파이프 위치
//		오른쪽 : dir = 1
//		오른아래쪽 : dir = 2
//		아래쪽 : dir = 3
		recursive(1, 1, 2);
		
		System.out.println(cnt);
		
	}

	
	private static void recursive(int dir, int r, int c) {
		// 종료 조건
		if(r==N && c==N) {
			cnt++;
			return;
		}
		

			// 밀려고 하는 파이프의 방향
			if(dir == 1) { // 파이프가 가로로 놓여져 있을 때
				if (c+1<N+1 && arr[r][c+1]==0) { // 오른쪽으로 밀기
//					System.out.println("오-오");
					recursive(1, r, c+1);					
				}
				if(r+1<N+1&&c+1<N+1 &&arr[r][c+1]==0 && arr[r+1][c+1]==0 && arr[r+1][c]==0){ // 오른 아래쪽으로 밀기
//					System.out.println("오-오아");
					recursive(2, r+1, c+1);
				}
			}else if (dir == 2) { // 파이프가 대각선으로 놓여져 있을 때
				if (c+1<N+1 && arr[r][c+1]==0) { // 오른쪽으로 밀기
//					System.out.println("오아-오");
					recursive(1, r, c+1);	
				}
				if (r+1<N+1&&c+1<N+1 &&arr[r][c+1]==0 && arr[r+1][c+1]==0 && arr[r+1][c]==0) { // 오른 아래쪽으로 밀기
//					System.out.println("오아-오아");
					recursive(2, r+1, c+1);
				}
				if(r+1<N+1 && arr[r+1][c]==0){ // 아래쪽으로 밀기
//					System.out.println("오아-아");
					recursive(3, r+1, c);
				}
			}else if (dir == 3) { // 파이프가 세로로 놓여져있을 때
				if (r+1<N+1 && arr[r+1][c]==0) { // 아래쪽으로 밀기
//					System.out.println("아-아");
					recursive(3, r+1, c);					
				}
				if(r+1<N+1&&c+1<N+1 &&arr[r][c+1]==0 && arr[r+1][c+1]==0 && arr[r+1][c]==0){ // 오른 아래쪽으로 밀기
//					System.out.println("아-오아");
					recursive(2, r+1, c+1);
				}
			}		
	}

	private static void print() {
		
		for (int r = 1; r < N+1; r++) {
			for (int c = 1; c < N+1; c++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
	}

}
