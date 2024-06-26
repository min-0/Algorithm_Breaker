## 피보나치함수

DFS를 쉽게 이해하고자 기초적인 피보나치 함수를 구현하는 문제를 풀어보았다. 재귀를 이용하여 피보나치 함수의 값을 구하는 것인데, 배열의 0번째와 1번째는 정의 해주고 계산할 배열 데이터의 -1번째 자리와 -2번째 자리 배열의 값을 계산하기 위해 반복문을 작성한다. 그 후 재귀 호출해주면 된다.

## DFS와BFS

그래프를 각각의 방법으로 탐색한 결과를 출력하는 문제이다. DFS는 첫 시작 정점으로 방문한 곳에는 isVisit으로 체크해주면서 정점의 번호가 총 정점의 개수를 넘지 않을 동안, 방문하지 않은 정점을 차례대로 반복, 탐색하며 재귀 호출 된다. BFS에는 만든 Queue를 만들어 DFS와 마찬가지로 방문한 곳을 체크하고 Queue가 비어있지 않는 동안 방문하지 않은 정점을 탐색하며 Queue를 하나씩 빼내며 결과를 출력하도록 한다.

## 미로탐색

해당 문제는 최소의 칸 수를 구해야 함으로 BFS가 적합하다 생각하여 Queue로 풀었다. 출발 지점인 (0,0) 지점부터 차례로 탐색하며 지나갈 수 있는 곳인지 상하좌우 조건문으로 확인 후, 좌표를 갱신하며 최소의 칸수를 출력한다. (x,y) 좌표를 편리하게 쓰기 위해 Point 클래스를 사용했다.

## 연결요소의개수

이 문제는 DFS, BFS 어떤 것으로 풀어도 상관이 없어 DFS로 먼저 풀어보고 BFS로도 풀어보았다. main에서 개수를 구하기 위해, 연결되었다가 끊기는 부분을 +1로 치기 때문에 방문하지 않았던 곳을 방문하게 될 때 cnt++ 되어 결과가 나오도록 하였다.