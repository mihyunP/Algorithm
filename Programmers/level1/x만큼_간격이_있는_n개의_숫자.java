import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer;
        
        ArrayList<Long> list = new ArrayList<Long>();
        for(long i=0; i<n;i++){
            list.add( x*(i+1));
        }
   
        
        int len = list.size();
        answer = new long[n];
        
        // for(int i=0; i<n;i++){
        //     answer[i] = list.get(i);
        // }
        
        // for~each문
        int i = 0;
        for( long num : list ){ // 각 요소 값 : 배열이나 컨테이너 값
            answer[i++] = num;
        }
        
        
        
        return answer;
    }
}
