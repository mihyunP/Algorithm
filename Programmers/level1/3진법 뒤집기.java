import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String revTernary="";
        // 1. n을 10진수 -> 3진수
        while(true){
            // revTernary += n%3; // Sting + int에서 int는(정수 1) String으로(문자열 "1") 자동형변환 후 들어감 
            // revTernary += String.valueOf(n%3);
            revTernary += (char)(n%3+'0'); // (char) 대신에 n%3+'0'하면 안되는 이유? 
            // 둘다 해줘야함 : n%3+'0'을 통해 출력할 문자의 아스키 코드값 세팅, (char) 강제 형변환을 통해 int -> char
            // <= 이때 아스키 코드 값의 범위를 넘어가면 어떻게 되는지?

            System.out.println(revTernary);
            
   
            n /= 3;
            if(n==0){
                break;
            }
        }
        System.out.println(revTernary);
        
        // 2. 뒤집기
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<revTernary.length();i++){
            stack.push(revTernary.charAt(i));
        }
        String ternary = "";
        while(!stack.isEmpty()){
            ternary+=stack.pop();
        }
        // System.out.println(ternary);
        
        // 3. 3진수 -> 10진수
        for(int i=0; i<ternary.length();i++){
            answer += (ternary.charAt(i)-'0') * Math.pow(3,i); // char -> int형 자동 형변환, 아스키 코드 값 가져옴
        }
        // answer =  Integer.parseInt(ternary, 3); // 문자열형으로 표현된 3진수를 정수형 10진수로 변환해주는 
        
        return answer;
    }
}

// 0. 5행에서 while문 돌리면 어차피 String revTernary에 3진법 변환 후 뒤집은 값이 들어가므로, 굳이 또 뒤집을 필요가 없음. 
// 1. 변수명을 모르는 단어로 정하지 말자! 삼진법 ternary라고 지으니까 개헤깔림 => three로 짓자!
// 2. 문자열 -> 문자 배열 char[]arr = str.toCharArray(); str.length만큼 방의 개수를 가진 char형 배열 arr이 생성됨
// 3. 문자배열 -> 문자열 String str = new String(arr); , String str = String.valueOf(arr);
// 4. 문자열 형식의 숫자 -> int형 숫자로 바꾸기 int num = Integer.parseInt(str);
// 5. int형 숫자 -> 문자형 숫자 
// 6. char -> int형변환 시 int에 해당 문자의 아스키코드값 들어옴
// 7. 문자열 + 숫자 ==> String "A" + int 3 == String "A" + String "3" == "A3" : int가 String으로 자동 형변환됨
// 8. 문자 + 숫자 ==> char 'A' + int 3 == 68 : char가(char형 변수 String 형 변수와 다르게 글자 하나밖에 저장할수 없는 구조) int로 자동  형변환됨 
// 9. 문자 + 문자 ==> char 'A' + char 'A' == 130                    cf. char a = 'A'일때 a+a == 130

// 10. *** char의 특징 ***
// 1) 글자 한개밖에 저장할 수 없는 구조 2) '글자 한개'를 담는 변수인 동시에 '정수'를 받는 것도 가능
// 형변환 공부하고 정리
