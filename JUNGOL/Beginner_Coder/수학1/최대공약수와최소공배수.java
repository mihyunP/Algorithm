package Beginner_Coder.수학1;

import java.util.Scanner;

/**
 * 
 * jol_1658 : 최대공약수와최소공배수
 * @author mihyun
 *
 */
public class 최대공약수와최소공배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int gcd = gcd_get(a,b);
		int lcm = a*b / gcd;
		System.out.println(gcd);
		System.out.println(lcm);
	}

	// 최대공약수 구하기
	static int gcd_get(int x, int y)
	{
	    int i, ans = 0;
	    for (i = 1; i <= x; i++)
	    {
	        if (x % i == 0 && y % i == 0)
	        {
	            ans = i;
	        }
	    }
	    return ans;
	}

}
/*
 * a와 b의 최소공배수, 최대공약수
 * 최대공약수(gcd) : a % i == 0 && b % i == 0
 * 최소공배수(lcm) : a * b / gcd 
 */
