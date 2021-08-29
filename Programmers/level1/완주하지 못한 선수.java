import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) { 
    // 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion       
        String answer = "";       
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0; i<completion.length;i++){
            
                if(!participant[i].equals(completion[i])){
                    answer = participant[i];
                   return answer;
                }
        }
         return participant[participant.length-1];
    }
}


// 2중 for문 쓰면 시간초과 뜸!!!
// participant, completion 각각 정렬해서 같은 인덱스 비교하기
