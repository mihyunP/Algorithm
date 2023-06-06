# **🎱 Queue**
: 먼저 들어온 데이터가 먼저 출력

  선입선출(FIFO - First In First Out) 구조

<img width="479" alt="queue" src="https://user-images.githubusercontent.com/69749222/127884443-2100d982-f9ff-4390-af5c-5ae0978e31b2.png">

**주요 메서드 정리**

**import java.util.Queue; **

**import java.util.LinkedList;**

**Queue<E> queue = new LinkedList<>();** 

// 자바에서 Queue는 인터페이스로 정의 되어있기 때문에 LinkedList라는 클래스로 구현한다. (ArrayList로도 가능함)



1. `isEmpty()` : 큐가 비었는지 확인 (리턴값) boolean
2. `size()` : 큐의 크기 반환 (리턴값)int
3. `add()`==`offer()` : 큐에 값 추가 (리턴값) boolean
4. `peek()` : 큐의 맨 앞에 있는 값 옃보기 (리턴값) int
5. `poll()` : 큐의 맨 앞에 있는 값 꺼내오기 (리턴값) int

