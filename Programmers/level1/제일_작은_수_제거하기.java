import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(len==1){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[len-1];
        
        int[] tmp = arr.clone();   
        
            Arrays.sort(tmp);
            

            for(int i=0;i<len;i++){
                if(arr[i]==tmp[0]){
                    continue;
                }
                list.add(arr[i]);
            }
            
            System.out.println(list.size());
            for(int i=0; i<len-1;i++){
                answer[i] = list.get(i);
            }
  
        return answer;
    }
}
// 배열 복사하기
// 1. 배열 생성 후, for문 돌리기!
// 2. int[] tmp = arr.clone(); 이렇게 해야지 새로운 배열 생성! // cf) int[] tmp = arr; 이렇게 하면 주소값만 복사됨  
