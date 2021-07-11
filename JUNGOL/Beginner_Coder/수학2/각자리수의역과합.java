package Beginner_Coder.수학2;

import java.util.Scanner;

/**
 * 
 * jol_1009 : 각 자리수의 역과 합(Number Reverse)
 * 
 * @author mihyun
 *
 */
public class 각자리수의역과합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[11];
		int i = -1;

		while (true) {
			arr[++i] = sc.nextInt();
			if (arr[i] == 0) {
				break;
			}
//			System.out.println(arr[i]);
		}
		
		
		for (int n = 0; n < i; n++) {
			
			reverse(arr[n]); // arr[n]에 저장된 수의 역을 구하는 함수
		}
	}

	private static void reverse(int a) {
		int[] num = new int[10];
		int k=0;
		int sum=0;
		long res=0;
		while (a>0) {
			num[k]=a%10;
			sum+=num[k]; // 역 각 자릿수의 합
			res+=num[k];
			res*=10;
			a/=10;
//			System.out.printf("num[%d] : %d\n",k,num[k]);
			k++;
		}
		System.out.printf("%d %d\n",res/10,sum);
	}
}

/* 1. 종료를 의미하는 0까지 넣어야 하므로 arr배열의 크기를 11로 해줘야한다.
   2. res가 int자료형의 범위(-21억~21억)를 넘어가므로 long으로 선언해주자.
*/