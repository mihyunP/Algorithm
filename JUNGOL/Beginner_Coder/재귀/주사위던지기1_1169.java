package JUNGOL.Beginner_Coder.재귀;

import java.util.Scanner;
public class 주사위던지기1_1169 {
	static int[] arr = {1,2,3,4,5,6};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 주사위를 던진 횟수
		int M = sc.nextInt(); // 출력 형식
		
		if (M==1) {
			// 주사위를 N번 던져서 나올 수 있는 모든 경우 == 중복 순열
			dice1(0,new int[N]);
		}else if (M==2) {
			// 주사위를 N번 던져서 중복이 되는 경우를 제외하고 나올 수 있는 모든 경우 == 중복 조합
			dice2(0, 0, new int[N]);
		}else if (M==3) {
			// 주사위를 N번 던져서 모두 다른 수가 나올 수 있는 모든 경우 == 순열
			dice3(0, new int[N], new boolean[6]);
		}

	}

	private static void dice3(int k, int[] sel, boolean[] v) {
		if (k == sel.length) {
			for (int i = 0; i < sel.length; i++) {
				System.out.print(sel[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (!v[i]) {				
				v[i] = true;
				sel[k] = arr[i];
//				k++;
				dice3(k+1, sel, v);
//				k--; // 백트레킹 
				v[i] = false; // 백트레킹 
			}
		}
		
		return;
	}

	private static void dice2(int idx, int k, int[] sel) {
		if (k == sel.length) {
			for (int i = 0; i < sel.length; i++) {
				System.out.print(sel[i] + " ");
			}
			System.out.println();
			
			return;
		}
		
		for (int i = idx; i < arr.length; i++) {
			sel[k] = arr[i];
			dice2(i, k + 1, sel);
		}
	}

	private static void dice1(int k, int[] sel) {
		if (k == sel.length) {
			for (int i = 0; i < sel.length; i++) {
				System.out.print(sel[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
				sel[k] = arr[i];
				dice1(k + 1, sel);
		}
	}
}