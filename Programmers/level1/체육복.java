import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

		answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌 가져온 학생이 도난
        for(int i=0; i<lost.length;i++){
            for(int j=0; j<reserve.length;j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i]=-11;
                    reserve[j]=-11; // 나올 수 없는 수
                }
            }
        }
        
        // 도난학생 <- 여벌 학생
        int k=-1;
		for (int i = 0; i < lost.length; i++) {
			for (int j = k+1; j < reserve.length; j++) {
				System.out.println(i+" "+j);
				if (lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1) {
					answer++;
                    k = j;
					break;
				}

			}

		}
        
        return answer;
    }
}
// 틀린 이유 : 여벌 체육복을 가져온 학생이 도난 당하는 경우를 생각하지 않았다.w
