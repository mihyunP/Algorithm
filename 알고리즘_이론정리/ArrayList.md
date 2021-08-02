# **🎱 ArrayList**

: List 인터페이스를 상속받은 클래스로 크기가 가변적으로 변하는 선형리스트
배열과 유사, but 배열은 크기 고정되지만 ArrayList 추가되는 데이터 개수에 따라 크기 가변적


![arraylist](https://user-images.githubusercontent.com/69749222/127885003-a186b9ad-b4da-4113-a0dd-a37db990d489.png)

**주요 메서드 정리**
**ArrayList < E> list = new ArrayList <>();** // E에다가 Integer등의 WapperClass 뿐만 아니라, 사용자 정의 자료형으로서 클래스를 넣을 수 있다.

1.  `list.add(3)` : list 맨 끝에 값3 추가
2. `list.add(1,10)` : index 1에 10 삽입

3. `list.remove(1)` : index 1 제거
4. `list.clear()` : 모든 값 제거

5. `list.size()` :  list 크기 구하기

6. `list.get(0)` : index 0의 값 가져오기

7. `list.contains(1)` : list에 1이 있는지 검색 후 있으면 true 

8. `list.indexOf(1)` : 1이 있는 index반환, 없으면 -1
