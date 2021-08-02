package JUNGOL.Beginner_Coder.재귀;

import java.util.Scanner;

public class 로또_2817 {

	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt(); // k개의 수
		arr = new int[k]; 
		
		for (int i = 0; i < k; i++) {
			arr[i] = sc.nextInt();
		}
		
		lotto(0, 0, new int[6]); // k개의 숫자 중 로또 번호 6개 뽑는 조합
	}
	private static void lotto(int idx, int k, int[] sel) {
		if (k == 6) {
			for (int i = 0; i < sel.length; i++) {
				System.out.print(sel[i] + " ");
			}
			System.out.println();
			
			return;
		} // 재귀 종료 조건
		
		for (int i = idx; i < arr.length; i++) {
			sel[k] = arr[i];
			lotto(i + 1, k + 1, sel);
		}
		
	}

}
