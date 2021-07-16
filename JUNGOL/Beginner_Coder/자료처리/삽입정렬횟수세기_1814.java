package Beginner_Coder.자료처리;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * JOL_1814 : 삽입정렬 횟수 세기
 * @author multicampus
 *
 */
public class 삽입정렬횟수세기_1814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 수의 개수 N(1≤N≤50)
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			list.add(i, sc.nextInt());
		}
		
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
//				System.out.println(j);
				if (list.get(i)<list.get(j)) {
					cnt+=i-j;
//					System.out.printf("i j cnt : %d %d %d\n",i,j, cnt);
					list.add(j,list.get(i));
					list.remove(i+1); // 앞으로 땡기고 원래 있던거는 지워주는 과정 
					break;
				}
				
			}
//			for (int j = 0; j < N; j++) {
//				System.out.print(list.get(j)+" ");
//			}
//			System.out.println();
		}
		System.out.println(cnt);
	}

}