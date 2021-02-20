#Algorithm with Java
###자바로 알고리즘 실습 한 것을 기록하고자 합니다.
> 
>	> 
>	>	> 
#### 참고된 책
1. Do it! 자료구조와 함께 배우는 알고리즘 입문 (자바 편)
2. (미정)

####목차 
* 검색(Search)
  * 선형검색(Sequntial Serach)
    * SequentialSearch.java : 선형검색
    * SequentialSearchFor.java : 선형검색 (for문 개량)
    * SequentialSearchSentiel.java : 보초법을 활용한 선형검색
  * 이진검색(Binary Serach)
    * BinarySearch.java : 이진검색
    * BinarySearchTester.java : 메서드를 활용한 이진검색
    * StringBinarySearch.java : 문자열 정렬이 된 리스트에서 이진검색
* 스택과 큐
  * 스택(Stack)
    * IntStack.java : IntStackTester.java를 위한 스택 클래스
    * IntStackTester.java : 스택 돌리는 클래스
  * 큐(Queue)
    * IntQueue.java : IntQueueTester.java를 위한 큐 클래스
    * IntQueueTester.java : 큐 돌리는 클래스
* 재귀 알고리즘(RecursiveAlgorithm)
  * Factorial.java : 재귀적으로 사용한 팩토리얼
  * EuclidGCD.java : 유클리드 호제법을 이용한 최대 공약수 구하기
  * Recursive.java : 재귀법 사용 예시
  * RecursiveX1.java : 꼬리재귀 제거 (Recursive.java 개선판)
  * RecursiveX2.java : IntStack 활용한 재귀법 (Recursive.java 개선판)
  * QueenB.java : 퀸을 배치할 수 있는 모든 경우의 수
  * QueenBB.java : 퀸을 올바르게 배치하는 모든 경우의 수
* 정렬 (Sort)
  * 버블정렬(Bubble Sort)
    * 
    
####보충 설명
* 보초법
  * SequentialSearchSentiel.java 참고
* 복잡도
  * 시간복잡도(Time Complexity)
    * 컴퓨터의 입장에서는 O(n)이나 O(n/2)이나 의미가 크지 않음. 따라서 계수는 중요하지 않음. (계수 생략)
    * 시간복잡도가 더해지는 경우 가장 큰 지수의 값 만을 표기. O(f(n))+O(g(n)) = O(max(f(n),g(n)))
  * 공간복잡도(Space Complexity)
* 정렬알고리즘의 핵심 요소는 교환, 선택, 삽입이다.
* 내부정렬 : 정렬할 모든 데이터를 하나의 배열에 저장할 수 있는 경우에 사용하는 알고리즘
* 외부정렬 : 정렬할 데이턱 ㅏ너무 많아서 하나의 배열에 저장할 수 없는 경우에 사용하는 알고리즘

    
