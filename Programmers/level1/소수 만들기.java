import java.util.*;

class Solution {
    static int answer = 0; // 소수가 되는 경우의 개수 
    public int solution(int[] nums) {
        

        comb(nums,0,0,new int[3]);
                
        return answer;
    }
    
    // 1. 3개를 뽑는다.
    private void comb(int[] nums, int idx, int k, int[] sel){
        if(k==3){
            // 2. 더한다.
            int sum =0;
            for(int i=0; i<sel.length;i++){
                sum+=sel[i];
            }
            
            //3. 소수이면 answer++한다.
            if(isPrime(sum)){
                answer++;
            }
            return;
        }
        
        for (int i = idx; i < nums.length; i++) {
			sel[k] = nums[i];
			comb(nums,i + 1, k + 1, sel);
		}
    }
    
    private boolean isPrime(int sum){
        
        // 1과 자기 자신으로만 나누어 떨어지면 true를 리턴한다.
        int i=2;
        int cnt =0;
        while(i<= (int) Math.sqrt(sum)){
            if(sum%i==0){
             return false;
            }
            i++;
        }
        
        return true;
        
    }
}
