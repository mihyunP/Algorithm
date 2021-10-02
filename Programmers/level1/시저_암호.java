class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int len = s.length();
        
        for(int i=0; i<len;i++){
            // 문자일때만
            if((s.charAt(i)>='A'&& s.charAt(i)<='Z')||(s.charAt(i)>='a'&& s.charAt(i)<='z')){
                // 대문자 일 때
                if(s.charAt(i)>='A'&& s.charAt(i)<='Z'){
                    if((char)(s.charAt(i)+n)>'Z'){
                        answer += (char)(s.charAt(i)+n-26);
                    }else{
                        answer += (char)(s.charAt(i)+n);
                    }
                    
                    
                }
                // 소문자 일 때
                else if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
                    if((char)(s.charAt(i)+n)>'z'){
                        answer += (char)(s.charAt(i)+n-26);
                    }else{
                        answer += (char)(s.charAt(i)+n);
                    }
                }

            }
            // 문자가 아닐 때
            else{
                answer += s.charAt(i);
            }
        }
        
        return answer;
    }
}

// 알파벳 총 26개
// 'Z' - 'A' = 25
// 'a' - 'A' = 32
