import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int total = 0;
        int i = 0;
        
        // 1. 부서별 신청 금액을 오름차순으로 정렬한다.
        Arrays.sort(d);
        
        // 2. total, budget 비교하며
        while(true){
            total+=d[i++];
            
            if(total<=budget && i> d.length-1){ // 종료 조건 1 : budget내에서 모든 부서에 지원한 경우
                answer = i;
                break;
            }else if(total>budget){ // 종료 조건 2 : budget 초과하는 경우
                // total-=d[i-1];
                System.out.println(total);
                answer = i-1;
                break;
            }
        }
        return answer;
    }
    
}
