import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        // board[행][열<==moves]
        
        for(int i =0; i< moves.length;i++) {
            for(int j=0;j<board[0].length;j++){
                System.out.println(j+" "+(moves[i]-1));
                if(board[j][moves[i]-1]!=0){
                   
                    if(stack.size()!=0 && stack.peek() == board[j][moves[i]-1]){
//                        stack.pop();
                        answer+=2;
                        System.out.println("pop"+stack.pop()+" "+answer);
                    }else{
                         stack.push(board[j][moves[i]-1]);
                         System.out.println("push"+board[j][moves[i]-1]);
                    }
                    board[j][moves[i]-1]=0; // !!!
                    break;
                }
            }
            
        }
         
        return answer;
    }
}
