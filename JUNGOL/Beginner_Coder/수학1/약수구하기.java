package Beginner_Coder.수학1;

import java.util.Scanner;

/**
 * 
 * jol_1402 : 약수 구하기
 * @author mihyun
 *
 */
public class 약수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 약수를 구할 자연수 N
		int K = sc.nextInt(); // K번째로 작은 수
		int[] arr = new int[N];
		int cnt =1;
		
		for (int i = 1; i <= N; i++) {
			if (N%i==0) {
//				System.out.println(cnt);
				arr[cnt++] = i;
//				System.out.println(i);
			}
		}
		System.out.println(arr[K]);
	}

}

/*
 * 1. 어떤 자연수 p와 q가 있을 때, 만일 p를 q로 나누었을 때 나머지가 0이면 q는 p의 약수이다.
 * 2. int형 배열 arr의 크기를 N,K중 큰수로 지정한 이유 : arrayOutofBounds에러 안뜨게 하기 위해서
 * 무조건 N으로하면 안되는 이유가 N의 약수의 총 개수보다 K가 큰수 일수도 있고 이때는 0을 출력해야하기 때문이다. 
 * <-(수정) N은 1 이상 10,000 이하이다. K는 1 이상 N 이하이다.라는 조건이 있으므로 그냥 배열의 크기는 N으로 해도된다.
 * 3. 3항 연산자 : (조건식)? 참일때 값 : 거짓일 때 값;
 * 
 * 
 */