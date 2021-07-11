package Beginner_Coder.도형만들기2;

import java.util.Scanner;

/**
 * 
 * boj_1707:달팽이사각형
 * 
 * @author mihyun
 *
 */
public class 달팽이사각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		 int n = sc.nextInt();
	        draw(n);
	    }
	    
	    public static void draw(int n) {
	        
	        int[][] array = new int[n][n];
	        
	        int count = 1;        // 배열의 좌표에 입력되는 숫자
	        int currentX = 0;    // 현재의 x 좌표
	        int currentY = 0;    // 현재의 y 좌표
	        int round = 0;        // 현재의 라운드
	        
	        // n*n 보다 count 가 커지면 종료
	        while( count <= n*n ) {
	            
	            // 시작점은 라운드 회수와 
	            currentX = round;
	            currentY = round;
	            
	            // 오른쪽
	            for(currentY = round; currentY < n-round; currentY++) {
	                array[currentX][currentY] = count++;
	            }
	            
	            currentY--;
	            currentX++;
	            
	            // 아래
	            for(; currentX < n-round; currentX++) {
	                array[currentX][currentY] = count++;
	            }
	            
	            currentX--;
	            currentY--;
	            
	            // 왼쪽
	            for(; currentY >= round; currentY--) {
	                array[currentX][currentY] = count++;
	            }
	            
	            currentX--;
	            currentY++;
	            
	            // 위쪽
	            for(; currentX >= round + 1; currentX--) {
	                array[currentX][currentY] = count++;
	            }
	            
	            round++;
	        }
	        
	        
	        for(int[] arr : array) {
	            for(int a : arr) {
	                System.out.printf("%d ", a);
	            }
	            System.out.println();
	        }
	            
	    }
	}