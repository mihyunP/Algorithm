class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer= new int[N]; 
        double[] result = new double[N+1]; // 실패율은 실수이므로 double로 선언
        
        // 1. 각 스테이지 별 실패율 구하기
        for(int i=1; i<N+1;i++){
            int cnt1 = 0; // 총 도전자
            double cnt2 = 0.0; // 실패자
            for(int j=0;j<stages.length;j++){
                
                if(stages[j]>=i){
                    cnt1++;
                }
                if(stages[j]==i){
                    cnt2++;
                }
            }
            result[i] = cnt2/cnt1;
            if(cnt1==0){
                result[i] = 0;
            }
            // System.out.println(cnt2+"/"+cnt1);
            // System.out.println(result[i]);
        }
        
        // 2. 실패율 내림차순 정렬하기
        for(int i=0; i<answer.length;i++){
            double max = -1.0; // Double.MIN_VALUE==2^-1074 > 0 라서 안된다.
            int num = 0;
            
            for(int j=1; j<result.length;j++){
                if(result[j] > max){
                    max = result[j];
                    num = j;
                    // System.out.print(max+" ");
                    // System.out.print(num+" ");
                }
            }
           // System.out.println();
            answer[i] = num;
            result[num] = -1.0;
           
        }
        
        return answer;       
    }
}
