# **🎱 Stack**

: 먼저 들어온 데이터가 가장 밑에 쌓이고(입력), 자료를 가져올 때(출력)는 가장 위의 자료를 가져오는 자료구조
 FILO(First-In-Last-Out : 선입후출)구조, LIFO(Last-In-First-Out : 후입선출) 구조
 
![stack](https://user-images.githubusercontent.com/69749222/127881494-713949da-1a17-45bc-b4b6-b477f1220c86.png)

<br>
<br>

**주요 메서드 정리**

**Stack<Integer> stack = new Stack<>();**

1. `empty()` == `isEmpty()` : 스택이 비었는지 확인(리턴값) boolean
2. `size()` : 스택의 사이즈 반환(리턴값) int
3. `add(int)` == `push(int)` : 스택에 값 추가하기(리턴값) boolean
5. `peek()` :  스택에서 가장 위에 있는 값(맨 마지막에 추가된 값) 옃보기(리턴값) int
6. `pop()` :  스택에서 가장 위에 있는 값(맨 마지막에 추가된 값) 가져오기 (리턴값) int
