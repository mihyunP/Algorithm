class Solution {
    public long solution(int price, int money, int count) { // 놀이기구 이용료, 현재 자신이 가지고 있는 금액, 놀이기구의 이용 횟수
//      (sol 1)
        long answer = -1;
        long total = 0;
        
        for(int i=1; i<=count;i++){
            total += price*i; 
            // 최대의 경우 price=2500, count=2500인데 ==> total의 값은 1*2500 + 2*2500 + 3*2500 + ... + 2500*2500 이므로,
            // =7,815,625,000는 int의  범위를(-21억~21억) 벗어난다.             
        }

        if(money-total<0){
            answer = total - money;
        }else{
            answer = 0;
        }
        return answer;
        
//      (sol 2)
        // long answer = -1;
        // answer = (long)price*count*(count+1)/2 - money; // 등차수열의 합
        // return answer<=0?0:answer;
    }
}
