import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0; // 가장 많은 종류 선택시 폰캣몬 종류 번호의 개수
        
        int len = nums.length;
        
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        Arrays.sort(nums);
        
        list.add(nums[0]);
        for(int i=1; i<len;i++){
            if(list.size()<len/2){
                if(nums[i]!=nums[i-1]){
                    list.add(nums[i]);
                }    
            }
        }
        
        answer = list.size();
        return answer;
    }
}
// answer = nums.length()/2 VS sel.size() 중에서 더 작은 값
