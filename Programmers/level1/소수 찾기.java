class Solution {
    public int solution(int n) {
        int answer = 0; // 소수의 개수
        
        for(int i=2; i<=n;i++){ // 1은 소수가 아니므로 2부터 시작
            if(isPrime(i)){
                answer++;
            }
        }
        
        return answer;
    }
    
    public boolean isPrime(int i){
        for(int j=2; j<=Math.sqrt(i);j++){
            if(i%j==0){
                return false; // 소수가 아니다
            }
        }
        return true;
    }
    
}
