import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        
        
        String answer = "";
        for(int x=0; x<seoul.length;x++){ // 배열의 길이는 .length
            if(seoul[x].equals("Kim")){
                
                answer = "김서방은 "+x+"에 있다";
                break;
            }
        }
        
        return answer;
    }
}

// 문자열 붙이기 : concat(), +, append()로 하기!
// StringBuilder <-> String 변환 가능한지 ==> 안된다
