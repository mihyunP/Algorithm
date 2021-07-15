package Beginner_Coder.자료처리;

/**
 * 
 * JOL_1157 : 버블정렬
 */
import java.util.Scanner;

public class 버블정렬_1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 수열의 길이 N(4≤N≤100)
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < N-i; j++) {
				if (arr[j]>arr[j+1]) {
					
					//SWAP : arr[j] 아니라 tmp로 쓰기!!!
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			
			for (int j = 0; j < N; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}

}

/*
 * 거품 정렬(Bubble sort)이란? 두 인접한 원소를 검사하여 자리를 바꾸는 과정을 반복하며 정렬하는 방법이다.
 * 
 * 다음과 같은 과정으로 정렬을 한다. 
 * 1. 첫번째 값과 두번째 값을 비교하여 첫번째 값이 크면 자리를 바꾼다. 
 * 2. 두번째 값과 세번째 값을 비교하여 두번째 값이 크면 자리를 바꾼다. 
 * 3. 위와 같이 반복하여 N-1번째 값과 N번째 값을 비교하여 N-1번째 값이 크면 자리를 바꾼다. 이 단계가 끝나면 
 *    N번째에 가장 큰 수가 자리하게 된다. (한단계완료) 
 * 4. N번째를 제외하고 1~3을 반복하면 N-1번째에 두 번째로 큰수가 자리한다. (2단계 완료) 
 * 5. 위와같은 작업을 N-1번 반복하면 모든 데이터가 순서대로 정렬된다.
 * 
 */