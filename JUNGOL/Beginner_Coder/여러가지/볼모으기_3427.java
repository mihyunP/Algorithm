package Beginner_Coder.여러가지;

import java.util.Scanner;

public class 볼모으기_3427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 볼의 총 개수 N(1 ≤ N ≤ 500,000)

		String balls = sc.next(); // 볼의 색깔을 나타내는 문자 R(빨간색 볼) 또는 B(파란색 볼)
		char[] cBalls = balls.toCharArray();
		
	    // R R일때, -> R을 왼쪽으로 모으기, R을 오른쪽으로 모으기
	    // R B일때, R을 왼쪽으로 모으기==B를 오른쪽으로 모으기
	    // B R일때, B를 왼쪽으로 모으기==R을 오른쪽으로 모으기	
	    // B B일때, R을 왼쪽으로 모으기, R을 오른쪽으로 모으기

		int left = 0; // 왼쪽 볼 뭉덩이 개수
		int right = 0; // 오른쪽 볼 뭉텅이 개수
		int cntB = 0; // B의 개수
		int cntR = 0; // R의 개수
		
		//---------------------------------------------------------------------------------------------
		// CASE 0 ) 볼 색상이 모두 R, 모두B인 경우
		for (int i = 0; i < N-1; i++) {
			if(cBalls[i]!=cBalls[i+1]) break;
			
			if (i==N-2) {
				System.out.println(0);
				return;
			}
			
		}
		//----------------------------------------------------------------------------------------------
		// CASE 1 ) 양끝이 모두 R인 경우
		if (cBalls[0] == 'R' && cBalls[N - 1] == 'R') {
			for (int i = 0; i < N; i++) {
				if (cBalls[i] != 'R') {
					break;
				}
				left++;
			}
			for (int i = N - 1; i >= 0; i--) {
				if (cBalls[i] != 'R') {
					break;
				}
				right++;
			}
//			System.out.println(left);
//			System.out.println(right);


			// R을 오른쪽으로 모으기
			if (right > left) {
				for (int i = 0; i < N - right; i++) {
					if (cBalls[i] == 'R') {
						cntR++;
//						System.out.printf("rCnt : %d\n", rCnt);
					}
					if (cBalls[i] == 'B') {
						cntB++;
//						System.out.printf("bCnt : %d\n", bCnt);
					}
				}
//				System.out.printf("rCnt : %d, bCnt: %d\n", rCnt, bCnt);

				System.out.println(Math.min(cntR, cntB));				
				/*
				int resR=0; 
				// resR이라는 변수를 사용할 필요가 없음. resR(빨간볼R을 오른쪽으로 모을 때) ,resL(빨간볼L을 왼쪽으로 모을 때) 비교하려했는데 
				// 걍, right>left일땐 빨간볼R을 오른쪽으로 모을 때가 유리하고, 반대일 땐 빨간볼R을 왼쪽으로 모을 때가 유리하다.
				resR = Math.min(cntR, cntB);
				System.out.printf("resR : %d\n",resR); // resR왜 20??? \n안써서 2랑 0이 찍혀서 ===> 이제 고쳤다
				System.out.println(resR);
				*/
			}
			// R을 왼쪽으로 모으기
			else {
				cntB = 0;
				cntR = 0;
				for (int i = left; i < N; i++) {
					if (cBalls[i] == 'R') {
						cntR++;
//						System.out.printf("rCnt : %d\n", rCnt);
					}
					if (cBalls[i] == 'B') {
						cntB++;
//						System.out.printf("bCnt : %d\n", bCnt);
					}
				}
//				System.out.printf("rCnt : %d, bCnt: %d\n", cntR, cntB);
				
				System.out.println(Math.min(cntR, cntB));
			}
		}
		//--------------------------------------------------------------------------------------------
		// CASE 2 ) 왼쪽 끝은 R, 오른쪽 끝은 B인 경우
		else if (cBalls[0] == 'R' && cBalls[N - 1]=='B') {

			for (int i = 0; i < N; i++) {
				if (cBalls[i] != 'R') {
					break;
				}
				left++;
			}
			for (int i = N - 1; i >= 0; i--) {
				if (cBalls[i] != 'B') {
					break;
				}
				right++;
			}
//			System.out.println(left);
//			System.out.println(right);
			
			// 양 끝 볼 뭉덩이 제외한 나머지 볼들의 색깔별(R, B) 개수 세기
			for (int i = left; i < N-right; i++) {
				if (cBalls[i]=='R') {
					cntR++;
				}else {
					cntB++;
				}
			}
			System.out.println(Math.min(cntR, cntB));
			
		} 
		//----------------------------------------------------------------------------------
		// CASE 3 ) 왼쪽 끝은 B, 오른쪽 끝은 R인 경우 
		else if (cBalls[0] == 'B' && cBalls[N - 1]=='R') {
			
			for (int i = 0; i < N; i++) {
				if (cBalls[i] != 'B') {
					break;
				}
				left++;
			}
			for (int i = N - 1; i >= 0; i--) {
				if (cBalls[i] != 'R') {
					break;
				}
				right++;
			}
//			System.out.println(left);
//			System.out.println(right);
			
			for (int i = left; i < N-right; i++) {
				if (cBalls[i]=='R') {
					cntR++;
				}else {
					cntB++;
				}
			}
			System.out.println((cntR>cntB)?cntB:cntR);
			
		}
		//-----------------------------------------------------------------------------------------------
		// CASE 4 ) 양끝이 모두 B인 경우
		else if (cBalls[0] == 'B' && cBalls[N - 1] == 'B') {
			
			for (int i = 0; i < N; i++) {
				if (cBalls[i] != 'B') {
					break;
				}
				left++;
			}
			for (int i = N - 1; i >= 0; i--) {
				if (cBalls[i] != 'B') {
					break;
				}
				right++;
			}
			
			// B또는 R을 이동시켜서, B를 오른쪽으로 모으기
			if (right>left) {
				for (int i = 0; i < N-right; i++) {
					if (cBalls[i]=='B') {
						cntB++;
//						System.out.printf("cntB : %d\n", cntB);
					}else {
						cntR++;
//						System.out.printf("cntR : %d\n", cntR);
					}
				}
				System.out.println(Math.min(cntR, cntB));
			}
			// B또는 R을 이동시켜서, B를 왼쪽으로 모으기
			else {
				cntB=0;
				cntR=0;
				for (int i = left; i < N; i++) {
					if (cBalls[i]=='B') {
						cntB++;
//						System.out.printf("cntB : %d\n", cntB);
					}else {
						cntR++;
//						System.out.printf("cntR : %d\n", cntR);
					}
				}
				System.out.println(Math.min(cntR, cntB));
			}
		}
	}

}