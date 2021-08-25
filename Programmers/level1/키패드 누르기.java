class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int left = 41;
        int right = 43;
        int tmpL = 0;
        int tmpR = 0;
        for(int i=0; i< numbers.length;i++){
            
            // 왼
            if(numbers[i]==1){
                answer+="L";
                left = 11;
            }else if(numbers[i]==4){
                answer+="L";
                left = 21;
            }else if(numbers[i]==7){
                answer+="L";
                left = 31;
            }
            
            // 오른
            if(numbers[i]==3){
                answer+="R";
                right = 13;
            }else if(numbers[i]==6){
                answer+="R";
                right = 23;
            }else if(numbers[i]==9){
                answer+="R";
                right = 33;
            }
            
            // 가운데
            if(numbers[i]==2){

                 // left/10 : 10의 자리
                 // left%10 : 1의 자리
                 // 2의 위치값 12
                 tmpL = Math.abs(left/10-1)+Math.abs(left%10-2);
                 tmpR = Math.abs(right/10-1)+Math.abs(right%10-2);  
                 if(tmpL < tmpR){
                     answer+="L";
                     left = 12;                
                 }else if(tmpL > tmpR){
                     answer+="R";
                     right = 12;  
                 }else if(tmpL == tmpR){
                     if(hand.equals("right")){
                        answer+="R";
                        right = 12;  
                     }else{
                        answer+="L";
                        left = 12;   
                     }
                 }
                 
           }else if(numbers[i]==5){
                 // 5의 위치값 22
                 tmpL = Math.abs(left/10-2)+Math.abs(left%10-2);
                 tmpR = Math.abs(right/10-2)+Math.abs(right%10-2);    
                 if(tmpL < tmpR){
                     answer+="L";
                     left = 22;                
                 }else if(tmpL > tmpR){
                     answer+="R";
                     right = 22;  
                 }else if(tmpL == tmpR){
                     if(hand.equals("right")){
                        answer+="R";
                        right = 22;  
                     }else{
                        answer+="L";
                        left = 22;   
                     }
                 }  
            }else if(numbers[i]==8){
                 // 8의 위치값 32
               tmpL = Math.abs(left/10-3)+Math.abs(left%10-2);
               tmpR = Math.abs(right/10-3)+Math.abs(right%10-2);   
                 if(tmpL < tmpR){
                     answer+="L";
                     left = 32;                
                 }else if(tmpL > tmpR){
                     answer+="R";
                     right = 32;  
                 }else if(tmpL == tmpR){
                     if(hand.equals("right")){
                        answer+="R";
                        right = 32;  
                     }else{
                        answer+="L";
                        left = 32;   
                     }
                 }
            }else if(numbers[i]==0){
                 // 0의 위치값 42
                 tmpL = Math.abs(left/10-4)+Math.abs(left%10-2);
                 tmpR = Math.abs(right/10-4)+Math.abs(right%10-2);
                 if(tmpL < tmpR){
                     answer+="L";
                     left = 42;                
                 }else if(tmpL > tmpR){
                     answer+="R";
                     right = 42;  
                 }else if(tmpL == tmpR){
                     if(hand.equals("right")){
                        answer+="R";
                        right = 42;  
                     }else{
                        answer+="L";

                        left = 42;   
                     }
                 }
             }
                // System.out.print(left+" ");
                // System.out.println(right);
                // System.out.print(tmpL+" ");
                // System.out.println(tmpR);
            
                
        }
        
        return answer;
    }
}
