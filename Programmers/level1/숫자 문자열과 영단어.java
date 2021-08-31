import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // String tmpS =s; // tmpS 쓸필요 없음
       
        // 1. (String) 영단어 -> (String) 숫자 바꾸기
        // while(true){ // while문 돌릴필요 없음!!! .replace()함수는 한번에 다 바꿔줌
        s = s.replace("zero","0")
            .replace("one","1")
            .replace("two","2")
            .replace("three","3")
            .replace("four","4")
            .replace("five","5")
            .replace("six","6")
            .replace("seven","7")
            .replace("eight","8")
            .replace("nine","9");
        
        // s = tmpS;
        // if(s.equals(tmpS)){
            // System.out.println(s);
            // break;
        // }           
        // }
        
        // 2. (String) 숫자 -> (int) 숫자
        answer = Integer.parseInt(s);
        
        // for(int i=0; i<s.length();i++){
        //     int tmpAns = (s.charAt(i)-'0'); // 문자형으로 선언된 숫자를 int형으로 바꾸기
        //     // System.out.println(tmpAns);
        //     for(int j=s.length()-1-i; j>0;j--){
        //         tmpAns*=10;
        //     }
        //      answer += tmpAns;
        // }
             
        return answer;
    }
}



/*
import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // 1. (String) 영단어 -> (String) 숫자 바꾸기
        s = s.replace("zero","0").replace("one","1").replace("two","2").replace("three","3").replace("four","4")
        .replace("five","5").replace("six","6").replace("seven","7").replace("eight","8").replace("nine","9");
 
        // 2. (String) 숫자 -> (int) 숫자
        answer = Integer.parseInt(s);
        
        return answer;
    }
}
*/
