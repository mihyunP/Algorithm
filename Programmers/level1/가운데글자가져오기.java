import java.util.*;

class Solution {
    public String solution(String s) {
        char[] cArr;
       
        if(s.length()%2!=0){
            cArr = new char[1];
            cArr[0] = s.charAt(s.length()/2);
            String answer =new String(cArr);
            return answer;
            
        }else {
            cArr = new char[2];
            cArr[0] = s.charAt(s.length()/2-1);
            cArr[1] = s.charAt(s.length()/2);
            // String answer = new String(cArr);
            String answer = String.valueOf(cArr);
            return answer;
        }       
        
    }
}

// *****subString(시작 방번호,끝 방번호+1)를 활용하자!*****
// s의 길이가 1일때 또는 2일때sms 

// 문자배열(char배열) => 문자열(String)
// char[] cArr = new char[3];
// 1. String str = new String(cArr);
// 2. String str = String.valueOf(cArr);

// 문자열(String) => 문자배열(char배열)
// String str = "How are you?";
// 1. charAt(i) & 반복문 활용
// 2. toCharArray() 활용 char[] arr = str.toCharArray();
