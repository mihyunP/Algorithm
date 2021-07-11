package Beginner_Coder.수학2;

import java.util.Scanner;

/**
 * 
 * jol_2813 : 소수의 개수
 * 
 * @author mihyun
 *
 */
public class 소수의개수 {

	static int cnt;
	static int[] prime =new int[2000005];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt(); // M이상
		int N = sc.nextInt(); // N이하

		cnt = 0;
		
		for (int i = M; i < N + 1; i++) {
//			cnt+=prime(i); // i가 소수이면 cnt++해주는 함수
			
		}
		
		
	    eratos(N); // 1이상 N이하 자연수 중 소수만 0으로 남겨두는 함수
	    
	    for (int i=M; i <= N; i++)
	    {
	        if(prime[i]==0) {
	            cnt++;
	        }
//	        System.out.printf("prime[%d] : %d\n",i,cnt);
	    }
	    
		System.out.println(cnt);
		}
	

	private static void eratos(int n)
	{
	    int i; int j;
	    prime[0]=1;
	    prime[1]=1;
//	    prime[0]=​prime[1]=1; // 왜??? X나옴 ???
	    for (i=2; i*i <= n; i++)
	    {
	        if (prime[i]==0)
	        {
	            for (j=i*i; j<=n; j+=i) // i의 제곱부터 n까지 i씩 증가
	            {
	                prime[j] = 1; // i의 배수 제거하기
	            }
	        }
	    }
	}

	private static int prime(int i) {
		if (i == 1) {
			return 0;
		} // 예외처리
//		else {
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (i % j == 0) {
				return 0;
			}
		}
//		cnt++;
		return 1;
//			System.out.printf("cnt%d : %d\n",i,cnt);
//		}

	}

}

/*
 * 소수(prime number)란 1보다 큰 자연수 중 1과 자기 자신 두 개만을 약수로 갖는 수 알아두기
 * 
 * 에라토스테네스의 체(Eratosthenes' sieve) : 에라토스테네스가 일정 범위까지의 소수를 간단하게 구하기 위해 고안한 방법으로
 * 자연수를 ‘체’로 쳐서 걸러내고 ‘소수’만 골라내는 방법이라고 해서 에라토스테네스의 체라고 한다.
 */
