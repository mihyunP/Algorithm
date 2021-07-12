package Beginner_Coder.자료처리;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * jol_1102 : 스택 (stack)
 * 
 * @author mihyun
 *
 */
public class 스택_1102 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();

		int N = sc.nextInt(); // 주어지는 명령어의 수(1<=N<=100)
		char[] order = new char[N];
		int[] num = new int[N];

		for (int i = 0; i < N; i++) {
			order[i] = sc.next().charAt(0);

			if (order[i] == 'i') {
				num[i] = sc.nextInt();
				stack.push(num[i]);
			} else if (order[i] == 'o') {
				if (!stack.empty()) {
					System.out.println(stack.pop());
				} else {
					System.out.println("empty");
				}

			} else if (order[i] == 'c') {
				System.out.println(stack.size());
			}
		}

	}

}

/*
 * 스택(Stack)
 * : 자료가 가장 밑에 쌓이고(입력). 자료를 가져올 때(출력)는 가장 위(최근)의 자료를 가져오는 자료구조
 * 이러한 Stack의 특징 때문에 흔히 "FILO(First-In-Last-Out : 선입후출)" 혹은
 * "LIFO(Last-In-First-Out : 후입선출)"라고 한다.
 * 
 * =========주요 메서드========
 * 1. empty() :(리턴값) boolean 
 * 2. size() :(리턴값) int
 * 3. add(int) == 
 * 4. push(int) : (리턴값) boolean 
 * 5. peek() : (리턴값) int
 * 6. pop() : (리턴값) int
 */