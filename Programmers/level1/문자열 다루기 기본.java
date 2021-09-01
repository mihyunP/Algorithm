class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        // 문자열 s의 길이가 4 혹은 6이고
        if(s.length()==4||s.length()==6){
             answer = true;
            // 숫자로만 구성돼있는지 확인
            for(int i=0; i<s.length();i++){
                if(s.charAt(i)<'0' || s.charAt(i)>'9') { //48('0')이상 57('9')이하
                    answer = false;
                    break;
                }
            }    
        }

        return answer;
    }
}
