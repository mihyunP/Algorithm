package BOJ;

import java.util.Scanner;

public class 롤케이크 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Scanner sc = new Scanner(System.in);	
	int L = sc.nextInt(); // 롤케이크 길이
	int N = sc.nextInt(); // 방청객 수 
	int max1 = 0; // 예상 최대 조각 
	int max2 = 0; //실제 최대 조각 
	
	boolean[] cake = new boolean[L+1]; // 초기값 : false
	int [][]ans = new int[2][N+1];
	
    
  for(int i=1; i<=N;i++) {
	
		int p = sc.nextInt();
		int k = sc.nextInt();
		
		ans[0][i] = k-p+1; // 예상 조각
		
		max1 = Math.max(max1, ans[0][i]);
		
		int cnt = 0;
		for(int j=p; j<=k;j++) {
			if(!cake[j]) {
				cnt++;
			}
			cake[j] = true;
		}
		ans[1][i] = cnt; // 실제 조각
		
		max2 = Math.max(max2, ans[1][i]);
	}
	

	// ans[0][1] ~ ans[0][N]의 값 중 가장 큰 값일때의 N값
	// 1. 가장 큰 값 찾기, 2.i = 1부터 N까지 돌리면서 ans[0][i] == max1 만족하는 가장 작은 N값 찾기 
	for(int i = 1; i<N+1;i++) {
		if(ans[0][i] == max1) {
			System.out.println(i);
			break;
		}
	}
	
	for(int i = 1; i<N+1;i++) {
		if(ans[1][i] == max2) {
			System.out.println(i);
			break;
		}
	}
	

	}


}
