class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        String[] yoil = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int total =0; // 총 일수
        
        // 1. 1월 1일 부터 총 몇일 지났는지 일수 구하기
        // 월단위
        for(int i=0;i<a-1;i++){
            total+= month[i];
        }
        // 일단위
        total+=b-1; // -1하는 이유 : total이 1일일때 0번방에 저장된 값(yoil[0])이어야해서
        
        // 2. 무슨요일인지 구하기                 
        answer = yoil[(total%7)];
      
        return answer;
    }
}
// 윤년 : 역법을 실제 태양년에 맞추기 위해 여분의 하루 또는 월을 끼우는 해, 2월 29일까지 있는 해
