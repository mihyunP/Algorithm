class Solution {
    public int solution(String s) {
        int answer = 0;
// (sol 1) 
//         int len = s.length();
        
//         // 음수일 때
//         if(s.charAt(0)=='-'){
//             for(int i=1; i<len;i++){
//                answer -= (s.charAt(i)-'0')*Math.pow(10,len-1-i);

//             }
//         } else if(s.charAt(0)=='+') { // 부호 있는 양수일 때
//             for(int i=1; i<len;i++){
//                answer += (s.charAt(i)-'0')*Math.pow(10,len-1-i);
//             }
   
//         } else{ // 부호 없는 양수일 때
//               for(int i=0; i<len;i++){
//                answer += (s.charAt(i)-'0')*Math.pow(10,len-1-i); 
//             }
//         }

// (sol 2)     
        answer = Integer.parseInt(s);
        return answer;
    }
}
// Integer.parseInt() : 문자열 형식의 숫자를 int형 숫자로 바꿔주는 함수.
// '-'로 시작하는 문자열 형식의 숫자일때는 int형 음수로 바꿔줌
