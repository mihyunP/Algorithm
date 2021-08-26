class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        int[][]map = new int[n][n];
        int[][]map1 = new int[n][n];
        int[][]map2 = new int[n][n];
        
        // 지도 1 : arr1 => map1
        for(int i=0; i<n; i++){
            int tmp = arr1[i];
            for(int j=0; j<n;j++){
                map1[i][n-1-j]=tmp%2; // 마지막 방의 인덱스 == n-1 헤깔리지 말것!
                tmp/=2;
            }
        }
        
        // 지도 2 : arr2 => map2
        for(int i=0; i<n; i++){
            int tmp = arr2[i];
            for(int j=0; j<n;j++){
                map2[i][n-1-j]=tmp%2; // 마지막 방의 인덱스 == n-1
                tmp/=2;
            }
        }
        
        // 지도 1 + 지도 2 합치기
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){                
                if( map1[i][j]==1 || map2[i][j]==1 ){
                    map[i][j]=1;
                }
                
            }
        }
        
        // map => answer : 1은 "#", 0은 " "  +연산자 써서 문자열 만들자!
        for(int i=0;i<n;i++){
            answer[i]="";
            for(int j=0; j<n;j++){
                if(map[i][j]==1){
                    answer[i]+="#";
                }else{
                    answer[i]+=" ";
                }   
            }
            System.out.println(answer[i]);
        }
        
        // print(map);
        
        return answer;
    }
    
    public void print(int[][]map1){
        for(int i=0; i<map1.length;i++){
            for(int j=0;j<map1[0].length;j++){
                System.out.print(map1[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// |(OR연산자) 사용할 것!!!
