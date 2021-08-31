import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
       
        String strN = Long.toString(n);
        // long[] num = new long[strN.length()];
        int[] num = new int[strN.length()]; 
        for(int i=0; i<strN.length();i++){
            num[i] = strN.charAt(i)-'0';    
        }
        Arrays.sort(num);
                
        for(int i=0 ;i<num.length;i++){
            // System.out.print(num[i]);
            answer += (long)num[i]*(int)Math.pow(10.0,i);
        }
        
        return answer;
    }
}


// 숫자를 문자열로 바꾸는 함수 ==> Long.toString(n)
// 제곱 구하는 함수 ==> Math.pow(10.0, 1.0)
// num 배열을 int형으로 만들면 안되는 이유? int형으로 선언한 num배열의 값을 long형의 answer에 넣는다. 이때 오류 발생?
