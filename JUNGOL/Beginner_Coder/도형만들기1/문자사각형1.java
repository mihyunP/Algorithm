package Beginner_Coder.도형만들기1;

import java.util.Scanner;

/**
 * 
 * jol_1307 : 문자사각형1
 * @author mihyun
 *
 */
public class 문자사각형1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 정사각형 한 변의 길이 n
		char[][] arr = new char[n][n];
		int num  =65;
		for (int i = n-1; i >= 0; i--) {
			for (int j = n-1; j >= 0; j--) {
				arr[j][i] = (char) (num%65+65);
				num++;
				if (num>90) {
					num=65; 
				} // 'Z' 다음에는 다시 'A'부터 반복 시키기 위해서
			}
		} //배열에 알파벳 채우기
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
