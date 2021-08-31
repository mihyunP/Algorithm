class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        int sum = 0;
        String strX = Integer.toString(x);
        for(int i=0; i<strX.length();i++){
            sum += strX.charAt(i)-'0';
        }
        
        if(x%sum ==0){
            answer = true;
        }
        
        return answer;
    }
}
// 숫자를 문자열로 만드는 함수 : Integer.toString(n);
