package week1;

import java.util.Scanner;

public class 평균은넘겠지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int C = sc.nextInt(); // 테스트케이스 개수

		for (int i = 0; i < C; i++) {
			int N = sc.nextInt(); // 학생의 수N(1 ≤ N ≤ 1000, N은 정수)

			int[] score = new int[N]; // 학생들 점수 저장해 둘 배열
			double sum = 0.0;
			for (int j = 0; j < N; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
//			System.out.println(sum);

			double avg = sum / N;
			double cnt = 0.0; // 평균을 넘는 학생의 수
			for (int j = 0; j < N; j++) {
				if (score[j] > avg) {
					cnt++;
				}
			}

			System.out.printf("%.3f", Math.round(cnt / N * 100 * 1000) / 1000.0);
			System.out.println("%");
		}
	}

}
