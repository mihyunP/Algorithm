import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String strN = String.valueOf(n);
        int len = strN.length();
        
        for(int i=0; i<len; i++){
            answer += strN.charAt(i)-'0'; // char - char <= 각각 int로 형변환 후 사칙연산됨
        }

        return answer;
    }
}
