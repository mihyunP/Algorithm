import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] answerA = {1,2,3,4,5}; // a.length == 5
        int[] answerB = {2,1,2,3,2,4,2,5}; // b.length == 8
        int[] answerC = {3,3,1,1,2,2,4,4,5,5}; // c.length == 10
        
        int a =0; // 1번 수포자의 점수
        int b =0; // 2번 수포자의 점수
        int c =0; // 3번 수포자의 점수
        
        for(int i=0; i<answers.length; i++){
            if(answers[i]==answerA[i%5]){
                a++;
            }
            if(answers[i]==answerB[i%8]){
                b++;
            }
            if(answers[i]==answerC[i%10]){
                c++;
            }
        }
        
        if(a>b && a>c) {
            int[] answer = new int[1];
            answer[0] = 1;
            return answer;
        }else if(b>a && b>c){
            int[] answer = new int[1];
            answer[0] = 2;
            return answer;
        }else if(c>a && c>b){
            int[] answer = new int[1];
            answer[0] = 3;
            return answer;
        }else if(a==b && a>c){
            int[] answer = new int[2];
            answer[0] = 1;
            answer[1] = 2;
            return answer;
        }else if(a==c && a>b){
            int[] answer = new int[2];
            answer[0] = 1;
            answer[1] = 3;
            return answer;
        }else if(b==c && c>a){
            int[] answer = new int[2];
            answer[0] = 2;
            answer[1] = 3;
            return answer;
        }else if(a==b && a==c){
            int[] answer = new int[]{1,2,3};
            // int[] answer = new int[3];
            // answer[0] = 1;
            // answer[1] = 2;
            // answer[2] = 3;
            return answer;
        }else{
            int[] answer ={};
            return answer;
        } // if~else if~else 논리상으로 모든 경우를 따졌더라도
          // else로 끝나야한다.
        
        
    }
}
