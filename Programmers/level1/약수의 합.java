class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // (SOL1)
        // for(int i=1; i<= n;i++){
        //     if(n%i==0){
        //         answer+=i;
        //     }
        // }
        
        // (SOL2)
        for(int i=1; i<= Math.sqrt(n) ; i++){ // (int) 안써도 됨
            if(n%i==0){
                answer+=i; // 약수 중 작은 수 i          ex. 3
                
                if(i!=n/i){ // 제곱근일 경우 한번만 더해주기위해
                answer+=n/i; // 약수 중 큰 수 n/i          ex. 4
                }   
            }
        }
        return answer;
    }
}

// 1. 모든 수는 두 약수의 곱으로 나타낼 수 있다.
// 2. java.lang패키지는 java에서 자동으로 포함시켜주기때문애 import하지 않아도 쓸 수 있다.
//    ==> import java.lang.Math; (X)
