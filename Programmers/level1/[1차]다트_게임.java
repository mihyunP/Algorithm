import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int sum = 0;
        int previous = 0;
        int len = dartResult.length();
        for( int i=0 ; i< len ; i++ ){
            
            // 숫자일 때
            if(dartResult.charAt(i)-'0' >= 0 && dartResult.charAt(i)-'0' <=9){
                int now=0;
                // 1인지 10인지? (0부터 10까지의 수)
                if(dartResult.charAt(i)-'0' == 1 && dartResult.charAt(i+1)-'0'==0){
                        now = 10;
                        i++;
                }else{
                     now = dartResult.charAt(i)-'0';
                }
               
                System.out.println(now);
                // 보너스 (필수)
                if(dartResult.charAt(i+1)=='S'){
                   ;
                }else if(dartResult.charAt(i+1)=='D'){
                    now = (int) Math.pow(now,2);
                }else if(dartResult.charAt(i+1)=='T'){
                    now = (int) Math.pow(now,3);
                }
                
                // 옵션 (선택)
                if(i+2<len && dartResult.charAt(i+2)=='*'){
                    now = now*2;
                    sum += (previous+now); // previous는 자기 차례에서 이미 한 번 더해짐
                    previous = now;
                    // i=i+2;
                }else if(i+2<len && dartResult.charAt(i+2)=='#'){
                     sum -= now;
                    previous = now*(-1);

                }else{
                    sum+= now;
                    previous = now;

                }
                 
            }
           
            // System.out.println(sum);
        }
        
        int answer = sum;
        return answer;
    }
}
