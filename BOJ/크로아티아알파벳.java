package BOJ;

import java.util.Scanner;

public class 크로아티아알파벳 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
			
		String str = sc.next(); // 입력받은 문자열
		
		str = str.replaceAll("c=","1");
		str = str.replaceAll("c-","2");
		str = str.replaceAll("dz=","3");
		str = str.replaceAll("d-","4");
		str = str.replaceAll("lj","5");
		str = str.replaceAll("nj","6");
		str = str.replaceAll("s=","7");
		str = str.replaceAll("z=","8");
		
		
 //		System.out.println(str.toString());
		System.out.println(str.length());
	}

}
// 주의할 점)
// replaceAll()함수로 크로아티아 알파벳을 특정 문자로(ex. 1, 2, 3,...) 바꿔준 뒤 str에 넣어주기!!
