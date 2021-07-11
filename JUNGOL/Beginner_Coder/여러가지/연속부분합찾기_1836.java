package Beginner_Coder.여러가지;

import java.util.Scanner;

public class 연속부분합찾기_1836 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 정수 N(1≤N≤10^5) <-2중 for문 쓰면 바로 시간 초과!
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt(); // 배열 세팅
		}
		/*
		int ans = Integer.MIN_VALUE;
		int sum=0;
		
		for (int start = 0; start < N; start++) {
				for (int i = start; i <N ; i++) {
					sum += arr[i];
					ans= (ans>sum)? ans: sum;
//					System.out.printf("%d %d %d\n",start,i,sum,ans);
				}
//				System.out.println();
				sum=0;
		}
		
		System.out.println(ans);
		*/
		int ans=0;
		int sum=0;
		int i;
		for (i = 0; i < N; i++) {
			if (sum+arr[i]<0) {
				sum=0;
			}
			else {
				sum+=arr[i];
			}
			ans=Math.max(ans, sum);
		}
		System.out.println(ans);
	}

}

/* 디버깅 해보기
 * ans 
 */