import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 1. 문자열 -> 문자 배열 변환 후 정렬하기
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);
        
       
        // 2. 뒤집기
        char[] revArr = new char[arr.length];
        for(int i=0; i<arr.length;i++){
            revArr[i] = arr[arr.length-1-i];
        }
        answer = new String(revArr);
        return answer;
    }
}
