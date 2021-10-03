class Solution {
    public int[] solution(int n, int m) {
        
        int GCD = 1;
        for(int i=1;i<=Math.min(n,m);i++){
            if(n%i==0 && m%i==0){
                GCD = i;
            }  
        }
        
        int LCM = (n*m)/GCD;
        
        int[] answer = new int[2];
        answer[0] = GCD;
        answer[1] = LCM;
        
        return answer;
    }
}

// 최대 공약수 : 1 ~ Math.min(n,m)까지의 수 중 n,m 둘다 나누어 떨어지는 가장 큰 수
// 최소 공배수 : n*m/GCD
