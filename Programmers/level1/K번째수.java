import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            int len = commands[i][1]-commands[i][0]+1;
            int[] tmp = new int[len];
            
            // 1. 자른다.
            for(int n =0; n<len;n++){
                tmp[n] = array[commands[i][0]+n-1];
            }
            // 2. 정렬한다.
            Arrays.sort(tmp);
            
            // 3. k번째 수
            answer[i] = tmp[commands[i][2]-1];
            System.out.println(answer[i]);
        }
        return answer;
    }
}
