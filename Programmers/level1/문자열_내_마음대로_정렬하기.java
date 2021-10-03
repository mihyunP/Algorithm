import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
    Arrays.sort(strings); // 인덱스 n의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자     열이 앞쪽에 위치
        
    // n번째 인덱스의 문자로 sorting (오름차순)
    Arrays.sort(strings, new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            return s1.charAt(n) - s2.charAt(n);
        }
    });
        
        for(int i=0; i< strings.length;i++){
            answer[i] = strings[i];
        }
        return answer;
    }
}

// Arrays.sort() vs Collections.sort() 차이점 <- 배열 정렬할 때,ArrayList등 정렬할 때 씀
// sort(정렬 대상, 정렬 기준) <- 정렬 기준은 default가 오름차순 (생략가능)
// implements 안해도 Comparator 쓸 수 있는지?
// --------------------------------------
// Comparator 따로 쓰는 경우 : 
// Comparator<String> comp = new Comparator<String>() {
//         @Override
//         public int compare(String s1, String s2) {
//             return s1.charAt(n) - s2.charAt(n);
//         }
//     };
        
//     // n번째 인덱스의 문자로 sorting (오름차순)
//     Arrays.sort(strings, comp);
