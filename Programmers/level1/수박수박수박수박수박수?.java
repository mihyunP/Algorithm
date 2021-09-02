class Solution {
    public String solution(int n) {
        String answer = "";
        
        for(int i=0; i<n;i++){
            if(i%2==0){
                // answer+="수";
                answer = answer.concat("수");
            }else{
                // answer+="박";
                answer = answer.concat("박");
            }
        }
        
        return answer;
    }
}

// '수박수박수...'문자열 만들기 : +로 한 글자씩 더해서 만들수 있음, concat()함수 사용해서 한글자씩 더해서 만들 수 있음
