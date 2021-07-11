package Beginner_Coder.수학1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * jol_2809 : 약수
 * @author mihyun
 *
 */
public class 약수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 정수
//		int[] arr = new int[N]; // 약수를 저장할 배열 
//		int cnt =0;
//		for (int i = 1; i < Math.sqrt(N); i++) {
//			if (N%i==0) {
//				arr[cnt++]=i;
//				
//				if (i!=N/i) {
//					arr[cnt++] = N/i;
//				}
//			}
//		}

		
		int sq; // N의 제곱근을 저장하기 위해
		int[] arr= new int[10000];
		int cnt=0; // N의 약수를 저장하기 위해

		sq = (int)Math.sqrt(N); // N의 제곱근을 구하여 sq에 저장한다.
		for (int i = 1; i <= sq; i++)
		{
		    if (N % i == 0)
		    {
		        arr[cnt++] = i; // 작은수 저장
		        if (N / i != i)
		            arr[cnt++] = N / i; // 큰수 저장 (작은수와 같지 않을 경우)
		    }
		}
		
		int[] arr2 = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			arr2[i]=arr[i];
		}
		
		Arrays.sort(arr2);
		
		// 출력
		for (int i = 0; i < cnt; i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}

// 그러므로 두 수의 곱이 N일 경우 그 두 수는 N의 약수이며 두 수중 작은 수의 범위는 1~(루트N) 이하가 된다. 
/*
1. a*b = c일때, a랑 b는 c의 약수다.
2. a또는 b 둘중 하나는 반드시 제곱근c 이하이다.
3. 따라서, c의 약수를 구하려면 1이상 제곱근c 이하 범위만 살펴보면 된다. i, c/i(i!=c/i일때만)
*/
