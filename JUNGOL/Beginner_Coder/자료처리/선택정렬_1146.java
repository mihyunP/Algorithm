package Beginner_Coder.자료처리;
import java.util.Scanner;
public class 선택정렬_1146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 수열의 길이 N(4≤N≤100)
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt(); // N개의수
		}

		for (int i = 0; i < N - 1; i++) {
			int minVal = Integer.MAX_VALUE;
			int minIdx = i;
			for (int idx = i; idx < N; idx++) {
				if (arr[idx] < minVal) {
					minVal = arr[idx];
					minIdx = idx;
				} // arr[i]부터 arr[N]중에서 최솟값을 알아내서

			}

			// arr[i]와 SWAP한다.
			int tmp = arr[i];
			arr[i] = arr[minIdx]; // == minVal
			arr[minIdx] = tmp;

			for (int j = 0; j < N; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}

}

/*
 * 선택 정렬(selection sort) : 
 * 1. 주어진 수열 중에 최소값(같은 값이 여러 개 있는 경우 처음 값)을 찾는다.
 * 2. 찾은 최소값을 맨 앞의 값과 자리를 바꾼다.
 * 3. 맨 앞의 값을 뺀 나머지 수열을 같은 방법으로 전체 개수-1번 반복 실행한다.
 */