package Beginner_Coder.도형만들기1;

import java.util.Scanner;

/**
 * 1291 : 구구단
 * @author mihyun
 *
 */
public class 구구단_1291 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int s = sc.nextInt(); // 시작값
		int e = sc.nextInt(); // 끝값
		
		if (s<2||s>9||e<2||e>9) {
			while(true) {
			System.out.println("INPUT ERROR!");
			s=sc.nextInt();
			e=sc.nextInt();
			if(s>=2&&s<=9&&e>=2&&e<=9) break;
			}
		}
		*/
		// s<2||s>9||e<2||e>9 <-> s>=2&&s<=9&&e>=2&&e<=9
		int s;
		int e;
		while (true) {
			s = sc.nextInt();
			e = sc.nextInt();
			if(s>=2&&s<=9&&e>=2&&e<=9) break;
			
			System.out.println("INPUT ERROR!");
		}
		// 유효한 s,e값 입력 받는다.
		
		
		
		// s가 e보다 클 수 있다. 			==> s*1 (s+1)*1또는(s-1)*1 ... e*1
		// s와 e는 2부터 9사이의 정수이다.
		for (int i = 1; i <10 ; i++) {
			if (s<=e) {
				
				for (int j = s; j <=e ; j++) {
//					System.out.print(j+" * "+i+" = ");
//					System.out.printf("%2d",j*i);
//					System.out.print("   ");
					System.out.printf("%d * %d = %2d   ",j,i,j*i);
				}
			}else {
				for (int j = s; j >=e ; j--) {
//					System.out.print(j+" * "+i+" = ");
//					System.out.printf("%2d",j*i);
//					System.out.print("   ");
					System.out.printf("%d * %d = %2d   ",j,i,j*i);
				}
			}
			System.out.println();
		}
		
	}

}

/*
 * 1. 정올 제출 양식
 * import java.util.*; 등 import하기
 * 클래스 명 Main으로 변경하기
 * 
 * 2. 자바 출력 형식 지정 방법
 * printf(String format, Object .. args)함수를 사용하여여러가지 형식으로 변화하여 출력한다.
 * ex) System.out.printf("%3d", i);
 * 여기서 String format은 출력 형식을 말합니다.
 * %3d 는 3자리보다 작으면 오른쪽에 맞춰서 출력하게 됩니다.
 */