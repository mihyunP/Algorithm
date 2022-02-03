package BOJ;

import java.util.Scanner;

public class 사탕게임 {
	
	static int N; // 보드의 크기 (3 ≤ N ≤ 50)
	static char[][] arr; // 보드
	static int ans = Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); 
		arr = new char[N][N];
		
		for (int r = 0; r < N; r++) {
			String str = sc.next();
			for (int c = 0; c < N; c++) {
				arr[r][c] = str.charAt(c);
			}
		} // 보드 세팅 완료
		// 빨간색은 C, 파란색은 P, 초록색은 Z, 노란색은 Y
		// 단축키 : ctrl + cmd + space
		
//		print();
		
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				
//			바꿀 좌표 : r,c
			//r+1 N미만인지 확인 후 오른쪽과 바꾸기(swap)
			if (r+1 < N) {
				// 1. 경계선 체크 후, 바꾸기 
				char temp = arr[r][c];
				arr[r][c] = arr[r+1][c];
				arr[r+1][c] = temp;
				
				// 2. 해당 좌표에서 최대 개수 탐색 (바뀐 좌표만 탐색해서 시간 줄이기 )
				check(r,c);
				check(r+1,c);
				
				// 3. 원복  
				arr[r+1][c] = arr[r][c];
				arr[r][c] = temp;
				
			}
				
			//c+1 N미만인지 확인 후 아래쪽과 바꾸기(swap)
			if(c+1 < N) {
				// 1. 경계선 체크 후, 바꾸기 
				char temp = arr[r][c];
				arr[r][c] = arr[r][c+1];
				arr[r][c+1] = temp;
				
				// 2. 해당 좌표애서 최대 개수 탐색(바뀐 좌표만 탐색해서 시간 줄이기) 
				check(r,c);
				check(r,c+1);
				
				// 3. 원복  
				arr[r][c+1] = arr[r][c];
				arr[r][c] = temp;
				
			}
				

			
			}
		}
				
		
		
		System.out.println(ans);
	}
	
	private static void check(int r, int c) {
		// TODO Auto-generated method stub
		
		// 행 탐색 
			int cntR = 1;
			int nr = r-1;
//			arr[r][c] 위로 탐색
			while (nr>=0) {
				if(arr[nr][c] == arr[r][c]) {
					cntR++;
					nr--;
				}else {
					break;
				}	
			}
			
//			arr[r][c] 아래로 탐색 
			nr = r+1;
			while(nr<arr.length) {
				if(arr[nr][c] == arr[r][c]) {
					cntR++;
					nr++;
				}else {
					break;
				}	
			}
		
		
		// 열 탐색 
			int cntC = 1;
			int nc = c-1;
//			arr[r][c] 왼쪽으로 탐색
			while (nc>=0) {
				if(arr[r][nc] == arr[r][c]) {
					cntC++;
					nc--;
				}else {
					break;
				}	
			}
			
//			arr[r][c] 오른쪽으로 탐색 
			nc =c+1;
			while(nc<arr.length) {
				if(arr[r][nc] == arr[r][c]) {
					cntC++;
					nc++;
				}else {
					break;
				}	
			}
			
			ans = Math.max(ans, Math.max(cntR, cntC));
		
	}
	private static void print() {
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N; c++) {
				System.out.print(arr[r][c]);
			}
			System.out.println();
		}
	}

}
