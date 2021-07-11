package Beginner_Coder.수학1;

import java.util.Scanner;
/**
 * 
 * jol_1071 : 약수와 배수
 * @author mihyun
 *
 */
public class 약수와배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 정수의 개수n (1<= n <=40)
		int[] num = new int[n]; // 입력받은 정수 n개 저장할 배열
		for (int i = 0; i < n; i++) {
			num[i]=sc.nextInt();
		}
		
		int m = sc.nextInt(); // 약수와 배수를 구할 정수 m(1<=m<=100)
		
		int divisor=0; // 약수합
		int multiple=0; // 배수합
		
		for (int i = 0; i < n; i++) {
			if (m%num[i]==0) {
				divisor+=num[i]; // 약수다. == 나누어 떨어진다. <= divisor에 더함
			}
			if (num[i]%m==0) {
				multiple+=num[i]; // 배수다. == m의 1배, 2배, ...n배 한 수이다. <== multiple애 더함
			}
		}
		
		System.out.println(divisor);
		System.out.println(multiple);
	}

}

/*
1. 약수란? 어떤 수를 나누어 떨어지게 하는 수를 어떤 수의 약수라 한다. 
즉, a * b = c일 경우 a와 b는 c의 약수가 된다. 
1은 모든 수의 약수이며 자기 자신 또한 약수가 된다. 

2. 배수란? 어떤 수의 1배, 2배, 3배, 4배... 한 수를 어떤 수의 배수라 한다. 
즉, a * b = c 일 경우 c는 a와 b의 배수가 된다. 
자기 자신도 배수이며 배수의 개수는 무한하다. 



==> 프로그램에서 약수와 배수를 확인하기 위해서는 나머지 연산을 이용하면 된다. 
a % b 가 0이면 a는 b의 배수이고, b는 a의 약수가 된다. 
*/