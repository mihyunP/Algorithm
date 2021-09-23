package JUNGOL.Beginner_Coder.재귀;

import java.util.Scanner;

public class 주사위던지기2_1175 {
	static int[] arr = {1, 2, 3, 4, 5, 6};
	static int N, M;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); // 주사위를 던진 횟수 N(2≤N≤7)
		M = sc.nextInt(); // 눈의 합 M(1≤M≤40)
		
		if (N > M) {
			return;
		}
		dice(0, new int[N], 0); // 중복 순열
		
		
	}

	private static void dice(int k, int[] sel, int sum) {
		StringBuilder sb = new StringBuilder();
		
		if (sum>M) {
			return;
		} // 가지치기 <- 안가봐도 안될게 뻔해서 더이상 재귀 안 돌릴려고 하는 것
				
		if (k == N) {
			
			if(sum == M) {
				for (int i = 0; i < sel.length; i++) {
					
					sb.append(sel[i]).append(" "); // 출력함수 호출하는데 시간 오래 걸리니까 StringBuilder로 한 세트씩 묶어서 출력(출력함수 호출 3회 -> 1회 줄이기) 
				}
				System.out.println(sb);
			}
			return;
		} // 종료 조건 <- 답을 얻기 위해서 하는 것
		
//		if((N-k)*6 < M-sum) {
//			return;
//		} // 가지치기 <- 안가봐도 안될게 뻔해서 더이상 재귀 안 돌릴려고 하는 것
		
		for (int i = 0; i < arr.length; i++) {
			sel[k] = arr[i];
			dice(k + 1, sel,sum + sel[k]);
		}		
	}

}
