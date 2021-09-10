class Solution {
    public int[] solution(long n) {
        int[] answer;
        
        String strN = String.valueOf(n);
        int len = strN.length();
        answer = new int[len];
        
        for(int i=0; i<len;i++){
            answer[i] = strN.charAt(len-1-i)-'0'; // char - char <= 각각 int로 형변환 후 사칙연산됨
        }

        return answer;
    }
}
