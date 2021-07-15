package Beginner_Coder.자료처리;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * jol_1158 : 삽입정렬
 * 
 * @author mihyun
 *
 */
public class 삽입정렬_1158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 수열의 길이 N(4≤N≤100)
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
//			int num = sc.nextInt();
//			arr.add(num);

			arr.add(sc.nextInt());

		}

		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++) {

				if (arr.get(i) < arr.get(j)) {
					arr.add(j, arr.get(i));
					arr.remove(i + 1);
				}

			}
			for (int j = 0; j < N; j++) {
				System.out.print(arr.get(j) + " ");
			}
			System.out.println();
		}
	}
}

/*
 * 삽입정렬(Insertion sort)은 
 * : 자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아
 * 삽입하는 방법이다.
 * 
 * STL > ArrayList 정리 : ArrayList는 List 인터페이스를 상속받은 클래스로 크기가 가변적으로 변하는 선형리스트입니다.
 * 일반적인 배열과 같은 순차리스트이며 인덱스로 내부의 객체를 관리한다는점등이 유사하지만 한번 생성되면 크기가 변하지 않는 배열과는 달리
 * ArrayList는 객체들이 추가되어 저장 용량을 초과한다면 자동으로 부족한 크기만큼 저장 용량이 늘어난다는 특징을 가지고 있습니다.
 * 
 * ArrayList 선언) 
 * ArrayList list = new ArrayList();//타입 미설정 Object로 선언된다.
 * ArrayList<Integer> members = new ArrayList<Integer>();//타입설정 Integer객체만 사용가능
 * ArrayList<Integer> members = new ArrayList<>();
 * 
 * ArrayList 값 추가) 
 * list.add(3); //값 추가 
 * list.add(1,10); //index 1에 10 삽입
 * 
 * ArrayList 값 삭제) 
 * list.remove(1); //index 1 제거
 * list.clear(); //모든 값 제거
 * 
 * ArrayList 크기 구하기) 
 * list.size()
 * 
 * ArrayList 값 출력) 
 * list.get(0)
 * 
 * ArrayList 값 검색) 
 * list.contains(1); // list에 1이 있는지 검색 후 있으면 true 
 * list.indexOf(1); // 1이 있는 index반환 없으면 -1
 */