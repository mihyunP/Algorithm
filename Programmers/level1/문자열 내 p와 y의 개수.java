class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCnt = 0;
        int yCnt = 0;
        
        // 1. p의 개수, y의 개수를 구한다.
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='p'||s.charAt(i)=='P'){ // 문자열 s 내 p 또는P(대소문자구분x)의 개수
                pCnt++;
            }
            else if(s.charAt(i)=='y'||s.charAt(i)=='Y'){ // 문자열 s 내 y 또는Y(대소문자구분x)의 개수
                yCnt++;
            }    
        }
        
        // 2. 갯수를 비교한다.
        if(pCnt!=yCnt){
            answer = false;
        }
        

        return answer;
    }
}
