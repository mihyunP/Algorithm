import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        // Arrays.sort(arr); // arr을 정렬하고 시작하기(비효율적)
         
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();
        
        // 1. divisor로 나누어 떨어지는 값 ArrayList에 저장
        for(int i=0; i<arr.length; i++){
            if(arr[i] %divisor==0){
                list.add(arr[i]);
            } 
        }
        
        // 2. ArrayList -> 배열 오름차순으로 정렬 
        int size = list.size();
        // 예외
        if(size == 0){
          answer = new int[1];
          answer[0] = -1;  
        }else{
            answer = new int[size];
            for(int n=0; n<size ; n++){
                answer[n] = list.get(n);
            }
            Arrays.sort(answer); // answer을 정렬하기
        }
        
        return answer;
    }
}
