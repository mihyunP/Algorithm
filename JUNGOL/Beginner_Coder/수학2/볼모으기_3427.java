package Beginner_Coder.수학2;

import java.util.Scanner;

/**
 * 
 * jol_3427 : 볼 모으기(balls)
 * @author mihyun
 * 
 */
public class 볼모으기_3427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 볼의 총 개수 N (1 ≤ N ≤ 500,000)
		int cnt =0;
		
		
		String balls = sc.next(); // 볼의 색깔을 나타내는 문자 R(빨간색 볼) 또는 B(파란색 볼)
		char[] cBalls = balls.toCharArray(); 
		
		
		for (int i = 0; i < N-1; i++) {
			if (cBalls[i]!=cBalls[i+1]) {
				break;
			}
			System.out.println(cnt);
			return;
		} // 문자열에는 R 또는 B 중 한 종류만 주어질 수도 있으며, 이 경우 답은 0이 된다.
		
		int left=0;
		int right=0;
		
		
		if (cBalls[0]=='R' && cBalls[N-1]=='R') {
			int b=0;
			int r=0;
			
			int i=0;
			int j=N;
			
			while (true) {
				left++;
				if (cBalls[i]=='B') {
					break;
				}
				i++;
			}
			while (true) {
				right++;
				if (cBalls[j]=='B') {
					break;
				}
				j--;
			}
			
			if (i>r) {
				
			}else {
				
			}
			
			// 가장자리 뭉텅이 제외한 B의 개수, R의 개수
			
			
			
			
		}else if (cBalls[0]=='B' && cBalls[N-1]=='B') {
		
			
		}else if (cBalls[0] != cBalls[N-1]) {
			
		}
	
		for (int i = 0; i < N; i++) {
			
		}
		
	
		
	}

}
