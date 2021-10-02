class Solution {
    public int solution(int num1) {
        long num = num1;
        int answer = 0;
        
        while(true){
            // 반복 종료 조건
            if(num==1){
                break;
            }else if(answer==500){
                answer = -1;
                break;
            }
            
            
            
            if(num%2==0){
                num /= 2;
                answer++;
            }else{
                num = (num*3) + 1;
                answer++;
            }
            
        }
        
        return answer;
    }
}

// num은 1이상 8000000 미만의 정수입니다.
// 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 이 조건에 의해서
// num이 int의 범위를 벗어나는 경우가 있다?
// 8000000이상의 수가 들어오는 듯!
