class Solution {
    public long solution(long n) {
        long answer = 0;
        
        long tmp = (long) Math.sqrt(n);
        if(Math.pow(tmp,2) == n){
            
            answer = (long) Math.pow((Math.sqrt(n)+1),2); 
        }else{
            answer = -1;
        }
        return answer;
    }
}

// n의 제곱근 : Math.sqrt(n);
// n의 2제곱 : Math.pow(n,2);
// Math.sqrt(n) * Math.sqrt(n) == n (X)
// long tmp = (long) Math.sqrt(n);선안 후, 
// tmp*tmp == n (O)
