import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        
       for(int i=0;i<arr.length;i++){
           if(arr[i]>=0){
                ans.add(arr[i]);
            }

            int j = i;
           
           while(true){       
               if(j==arr.length-1|| arr[++j]!=arr[i]){ // 배열의 마지막 방까지 갔으면 ||뒤에꺼 안보고 바로 break
                   break;
               } 
               arr[j]=-1;
           }
           //print(arr);
       }
           

        
        
        answer = new int[ans.size()];
        for(int n=0;n<ans.size();n++){
            answer[n]= ans.get(n);
        }

        return answer;
    }
    
    public void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

// 논리 연산자 short circuit
// true || true	true	only first operand evaluated
// true | true	true	both operands evaluated
