package Beginner_Coder.여러가지;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * jol_1311 : 카드게임
 * @author mihyun
 *
 */
public class 카드게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score =0;
		
		char[] color = new char[5];
		int[] num = new int[5];
		
		for (int i = 0; i < 5; i++) {
			color[i]= sc.next().charAt(0);
			num[i]=sc.nextInt(); //cards[i].charAt(4)의 데이터 타입 String 아니라 Char
		}
		
		Arrays.sort(num);
		// 점수 계산
		// 5장 같은 색, 숫자 연속적 : 가장 높은 숫자 + 900
		if ((color[0]==color[1]&&color[1]==color[2]&&color[2]==color[3]&&color[3]==color[4])
				&&(num[4]-num[3]==1&&num[3]-num[2]==1&&num[2]-num[1]==1&&num[1]-num[0]==1) ) {
//			if (num[4]-num[3]==1&&num[3]-num[2]==1&&num[2]-num[1]==1&&num[1]-num[0]==1) {
				score = num[4] + 900;
//				System.out.println("900");
//			}
		}
		
		
		
		// 5장 중 4장 같은 숫자 : 같은 숫자 + 800
		else if ((num[3]-num[2]==0&&num[2]-num[1]==0&&num[1]-num[0]==0)||
				(num[4]-num[3]==0&&num[3]-num[2]==0&&num[2]-num[1]==0)) {
			score = num[2] + 800;
//			System.out.println("800");
		}
		
		
		
		// 5장 중 3장, 2장 같은 숫자 : 3장 숫자x10 + 2장 숫자 + 700
		else if ((num[4]==num[3]&&num[3]==num[2]&&num[1]==num[0])||
		(num[4]==num[3]&&num[2]==num[1]&&num[1]==num[0])) {
			if (num[3]==num[2]) {// 4==3==2, 1==0
				score = num[3]*10+num[0] + 700;
			}else { // 4==3, 2==1==0
				score = num[2]*10+num[3] + 700;
			}
//			System.out.println("700");
		}
		
		
		
		// 5장 같은 색 : 가장 높은 숫자 + 600
		else if (color[0]==color[1]&&color[1]==color[2]&&color[2]==color[3]&&color[3]==color[4]) {
//			System.out.println("same color");
			score = num[4] + 600;
//			System.out.println("600");
		}
		
		
		
		// 5장 숫자 연속적 : 가장 높은 숫자 + 500
		else if (num[4]-num[3]==1&&num[3]-num[2]==1&&num[2]-num[1]==1&&num[1]-num[0]==1) {
			score = num[4] + 500;
//			System.out.println("500");
		}
		
		
		
		// 5장 중 3장 같은 숫자 : 같은 숫자 + 400
		else if ((num[4]==num[3]&&num[3]==num[2])|| // 4==3==2
				(num[2]==num[1]&&num[1]==num[0])|| // 2==1==0
				(num[1]==num[2]&&num[2]==num[3])) { // 1==2==3 
			score = num[2] + 400;
//			System.out.println("400");
		}
		
		
		
		// 5장 중 2장, 2장 같은 숫자 : 큰숫자x10 + 작은 숫자 + 300
		else if ((num[0]==num[1]&&num[2]==num[3]) ||
				 (num[0]==num[1]&&num[3]==num[4]) ||
				 (num[1]==num[2]&&num[3]==num[4])
				) {
			score = num[3]*10 + num[1] + 300;
//			System.out.println("300");
		}
		
		
		
		// 5장 중 2장 같은 숫자 : 같은 숫자 + 200
		else if ((num[0]==num[1])||
				 (num[1]==num[2])||
				 (num[2]==num[3])||
				 (num[3]==num[4])) {
			if (num[0]==num[1]) {
				score = num[0] + 200;
			}else if (num[1]==num[2]) {
				score = num[1] + 200;
			}else if (num[2]==num[3]) {
				score = num[2] + 200;
			}else if (num[3]==num[4]) {
				score = num[3] + 200;
			}
//			System.out.println("200");
		}
		
		
		
		// 그외의 모든 경우 : 가장 큰 숫자 + 100
		else {
			score = num[4] + 100;
//			System.out.println("+100");
		}
		
		
		
		System.out.println(score);
	}
}

/* 첫번째 if문이 if 중첩인데 바깥쪽 if문 만족 & 안쪽 if문 불만족 시, 밑에 else if에 안걸림  
 * 왜냐면 바깥쪽 if문은 만족했기때문,
 * =>바깥쪽 if문에 조건 2개 쓰는 방식으로 해결함
 */ 
