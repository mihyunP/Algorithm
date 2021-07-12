package Beginner_Coder.자료처리;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * jol_1697 : 큐(queue)
 * 
 * @author mihyun
 *
 */
public class 큐_1697 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();

		int N = sc.nextInt(); // 주어지는 명령어의 수(1<=N<=100)
		char[] order = new char[N];
		int[] num = new int[N];

		for (int i = 0; i < N; i++) {
			order[i] = sc.next().charAt(0);

			if (order[i] == 'i') { // 입력
				num[i] = sc.nextInt();
				queue.add(num[i]);
			} else if (order[i] == 'o') { // 출력
				if (!queue.isEmpty()) {
					System.out.println(queue.poll());
				} else {
					System.out.println("empty");
				}

			} else if (order[i] == 'c') { // 개수
				System.out.println(queue.size());
			}
		}
	}

}

/*
 * 큐는 먼저 들어온 데이터가 먼저 출력된다. 
 * 이러한 구조를 선입선출(FIFO - First In First Out)이라고 한다.
 * 
 * ==========주요 메서드========
 * 1. isEmpty() : (리턴값) boolean 
 * 2. size() : (리턴값)int
 * 3. add(int) : (리턴값) boolean 
 * 4. peek() : (리턴값) int
 * 5. poll() : (리턴값) int
 */