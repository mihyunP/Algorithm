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
            answer += num[i]*Math.pow(10.0,i);
        }
        
        return answer;
    }
}

// 숫자를 문자열로 바꾸는 함수 ==> Long.toString(n)
// 제곱 구하는 함수 ==> Math.pow(10.0, 1.0) 리턴값 double타입의 10.0^1.0
// (int)Math.pow(10.0,i)라고 했을때, num 배열을 int형으로 만들면 안되는 이유? 18번째 줄에서 `int타입 * int타입 = int타입`으로 나오는데 곱셈 연산의 결과가 21억을 넘어가는 경우가 있다. 예를 들어, n=7999999999라면 num[9]*10^9 == 9000000000은 int형으로 표현 할 수 없다. 좌항의 answer가 long타입이므로 우항의 연산 결과가 long타입으로 자동 형변환되어 대입되지만, 자동 형변환되기 전에 곱셈 연산의 결과가 int타입의 표현 범위를 넘어가버림. 
// 해결 방법 : 1. long[]num 만들기, 2. 18번째 줄에서 (long)num[i], 3. 18번째 줄에서 Math.pow(10.0,i) 냅두기
// 3의 경우, double을 long에 못넣지않나?
// ***자료형 별 표현 범위***
// char의 표현범위 : -128 ~ 127, float의 표현범위 : -3.4x10^38 ~ 3.4x10^38, double의 표현범위 : -1.7x10^308 ~ 1.7x10^308
