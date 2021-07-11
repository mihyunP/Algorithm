	package Beginner_Coder.도형만들기2;
	
	import java.util.Scanner;
	
	/**
	 * 
	 * jol_1495 : 대각선 지그재그
	 * 
	 * @author mihyun
	 *
	 */
	public class 대각선지그재그 {
		static int[][] arr;
		static int n, r, c;
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	
			n = sc.nextInt(); // 정사각형의 크기 n(1부터 100사이의 정수)
	
			arr = new int[n][n];
	
			// 아래로 한칸 이동
			arr[0][0] = 1;
			arr[1][0] = 2;
	
			r = 0;
			c = 0;
			int num = 1;
			arr[0][0] = 1;
	
			while (true) {
	
				// 1) 아래로 한 번 이동 (불가능하면 오른쪽으로)
				if (r == n - 1) {
					arr[r][++c] = ++num;
//					System.out.printf("%d %d",r,c);
//					System.out.println();
				} else {
					arr[++r][c] = ++num;
//					System.out.printf("%d %d",r,c);
//					System.out.println();
				}
				// 2) 오른쪽 위로 가능한 만큼 이동 (가장 위나 가장 오른쪽에 도달하면 종료)
				while (r > 0 && c < n - 1) {
					arr[--r][++c] = ++num;
//					System.out.printf("%d %d",r,c);
//					System.out.println();
				}
	//			System.out.println("end"); // 바로 위 while문 종료 되서 나오는지 확인하기위해
				// 3) 오른쪽으로 한 번 이동 (불가능하면 아래로)
				if (c == n - 1) {
					arr[++r][c] = ++num;
//					System.out.printf("%d %d",r,c);
//					System.out.println();
				} else {
					arr[r][++c] = ++num;
//					System.out.printf("%d %d",r,c);
//					System.out.println();
				}
				if (r==n-1 && c== n-1) {
					break;
				}
				// 4) 왼쪽 아래로 가능한 만큼 이동 (가장 왼쪽이나 가장 아래쪽에 도달하면 종료)
				while (r < n - 1 && c > 0) {
					arr[++r][--c] = ++num;
//					System.out.printf("%d %d",r,c);
//					System.out.println();
				}
			}
	
	
			print();
		}
	
		private static void print() {
			for (int r = 0; r < n; r++) {
				for (int c = 0; c < n; c++) {
					System.out.print(arr[r][c]);
					System.out.print(' ');
				}
				System.out.println();
			}
	
		}
	
	}

/* 이부분 개선법?
	if (r==n-1 && c== n-1) {
	break;
}
*/