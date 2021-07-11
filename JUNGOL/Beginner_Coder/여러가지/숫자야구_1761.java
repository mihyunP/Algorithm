package Beginner_Coder.여러가지;

import java.util.Scanner;

public class 숫자야구_1761 {
	static int i;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 1 이상 100 이하의 자연수
		int[] num = new int[N];
		int[] strike = new int[N];
		int[] ball = new int[N];

		int total = 0;

		for (int n = 0; n < N; n++) {
			num[n] = sc.nextInt(); // 민혁이가 질문한 세 자리 수
			strike[n] = sc.nextInt(); // 영수가 답한 스트라이크 개수를 나타내는 정수
			ball[n] = sc.nextInt(); // 볼의 개수를 나타내는 정수
		}

		// 세자리 수 완전 탐색
		for (i = 111; i <= 999; i++) {
			
			String str_i = Integer.toString(i);

			if (str_i.charAt(0) == str_i.charAt(1) || str_i.charAt(0) == str_i.charAt(2)
					|| str_i.charAt(1) == str_i.charAt(2)) {
				continue;
			} // i 자리수 중 두자리 이상 같으면 N가지 조건 볼것도 없이 continue

//			if (str_i.charAt(0)=='0' || str_i.charAt(1)=='0' || str_i.charAt(2)=='0' ) {
//				continue;
//			}
			if (str_i.contains("0")) {
				continue;
			}
			
			
			boolean[] checkFilter = new boolean[N]; // 조건 N개 각각 만족하면 각 방 true/false
			// N가지 조건 모두 만족하는지 확인
			for (int n = 0; n < N; n++) {
				boolean[] isContain = new boolean[3]; // 각 자리수별 포함하는지 ball개수와 동일
				boolean[] isSameLocation = new boolean[3]; // 각 자릿수별 같은 위치인지 strike개수와 동일
				
				int first = num[n]/100; // 백의 자리수
				String sFirst = Integer.toString(first);
				int second = num[n]/10%10; // 십의 자리수123
				String sSecond = Integer.toString(second);
				int third = num[n]%10; // 일의 자리수
				String sThird = Integer.toString(third);
				int strikeCnt=0;
				int ballCnt=0;

//				System.out.printf("%d %d %d\n", first,second, third);
				
				if (str_i.contains(sFirst)) { 
					isContain[0]=true;
				}
				if (str_i.contains(sSecond)) {
					isContain[1]=true;
				}
				if (str_i.contains(sThird)) {
					isContain[2]=true;
				}
				
				if (str_i.charAt(0)-'0'==first) {
					isSameLocation[0]=true;
				}
				if (str_i.charAt(1)-'0'==second) {
					isSameLocation[1]=true;
				}
				if (str_i.charAt(2)-'0'==third) {
					isSameLocation[2]=true;
				}
				

				for (int z = 0; z < 3; z++) {
					if (isContain[z] && isSameLocation[z]) {
						strikeCnt++; // 민혁이가 말한 수 포함, 같은 위치일때 strike개수 증가
					}
					if (isContain[z] && !isSameLocation[z]) {
						ballCnt++; // 민혁이가 말한 수 포함, 다른 위치일때 ball개수 증가	
					}
				}
				
				if (strike[n]==strikeCnt && ball[n]==ballCnt) {
					checkFilter[n] = true;
				}
					
				} // EndFor
			boolean a = true;
			for (int k = 0; k < N; k++) {
				if (!checkFilter[k]) {
					a = false;
				}
			}
			if(a) {
				total++;
//				System.out.println(i);
			}
			
		}
		System.out.println(total);
	}

}

/*
 * int <-> String 형변환  
 * Integer.parseInt(str);
 * Integer.toString(i); == String.valueOf(i);
 */