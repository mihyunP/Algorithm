package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 사람 수
		int[]Pi = new int[N]; // 각 사람이 돈을 인출하는 데 걸리는 시간
		
		for (int i = 0; i < N; i++) {
			Pi[i] = sc.nextInt();
		}
		
		Arrays.sort(Pi);
		
		int res = 0;
		
		for (int i = 0; i < N; i++) {
			res+= Pi[i]*(N-i);
		}
		
		// 1 2 3 3 4
		// 1 
		// 1+2
		// 1+2+3
		// 1+2+3+3
		// 1+2+3+3+4
		
		System.out.println(res);

	}

}
