package Beginner_Coder.여러가지;

import java.util.Scanner;

public class 참외밭_2259 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt(); // 1m^2의 넓이에 자라는 참외의 개수 K(1<=K=<20)
		
		int[][] arr = new int[6][2]; // 방향(1:동 2:서 3:남 4:북), 길이(1이상 500이하의 정수)
		
		int maxLength = 0;
		int idx = 0; // 가장 긴 변이 몇번째로 나왔는지 알아보기위한 변수
		int area = 0;
		
		for (int i = 0; i < 6; i++) {
			arr[i][0] = sc.nextInt(); // 방향
			arr[i][1] = sc.nextInt(); // 길이
			
			if (arr[i][1]>maxLength) {
				maxLength = arr[i][1];
				idx = i;
			}
		}
//		System.out.printf("idx : %d\n",idx);
		
		// 참외밭의 면적 구하기
		if(idx==0) {
			if(arr[(idx-1+6)%6][1] > arr[(idx+1)%6][1]) {
				area = (arr[(idx-1+6)%6][1]*arr[idx][1]) - (arr[(idx+2)%6][1]*arr[(idx+3)%6][1]);
			}
			else {
				area = (arr[(idx+1)%6][1]*arr[idx][1]) - (arr[(idx+3)%6][1]*arr[(idx+4)%6][1]);
			}
		}
		else if(idx>0) {
		if(arr[(idx-1)%6][1] > arr[(idx+1)%6][1]) {
			area = (arr[(idx-1)%6][1]*arr[idx][1]) - (arr[(idx+2)%6][1]*arr[(idx+3)%6][1]);
		}
		else {
			area = (arr[(idx+1)%6][1]*arr[idx][1]) - (arr[(idx+3)%6][1]*arr[(idx+4)%6][1]);
		}
		}	
//		System.out.printf("area : %d",area);
		System.out.println(K*area);

	}

}

/*  idx가 음수가 되는 경우 +6 해주기 
 */ 
