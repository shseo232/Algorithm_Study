/*
https://school.programmers.co.kr/learn/courses/30/lessons/86971?language=java
문제 설명
n개의 송전탑이 전선을 통해 하나의 트리 형태로 연결되어 있습니다. 당신은 이 전선들 중 하나를 끊어서 현재의 전력망 네트워크를 2개로 분할하려고 합니다. 이때, 두 전력망이 갖게 되는 송전탑의 개수를 최대한 비슷하게 맞추고자 합니다.

송전탑의 개수 n, 그리고 전선 정보 wires가 매개변수로 주어집니다. 전선들 중 하나를 끊어서 송전탑 개수가 가능한 비슷하도록 두 전력망으로 나누었을 때, 두 전력망이 가지고 있는 송전탑 개수의 차이(절대값)를 return 하도록 solution 함수를 완성해주세요.

제한사항
n은 2 이상 100 이하인 자연수입니다.
wires는 길이가 n-1인 정수형 2차원 배열입니다.
wires의 각 원소는 [v1, v2] 2개의 자연수로 이루어져 있으며, 이는 전력망의 v1번 송전탑과 v2번 송전탑이 전선으로 연결되어 있다는 것을 의미합니다.
1 ≤ v1 < v2 ≤ n 입니다.
전력망 네트워크가 하나의 트리 형태가 아닌 경우는 입력으로 주어지지 않습니다.
입출력 예
n	wires	result
9	[[1,3],[2,3],[3,4],[4,5],[4,6],[4,7],[7,8],[7,9]]	3
4	[[1,2],[2,3],[3,4]]	0
7	[[1,2],[2,7],[3,7],[3,4],[4,5],[6,7]]	1
입출력 예 설명
입출력 예 #1

다음 그림은 주어진 입력을 해결하는 방법 중 하나를 나타낸 것입니다.
ex1.png
4번과 7번을 연결하는 전선을 끊으면 두 전력망은 각 6개와 3개의 송전탑을 가지며, 이보다 더 비슷한 개수로 전력망을 나눌 수 없습니다.
또 다른 방법으로는 3번과 4번을 연결하는 전선을 끊어도 최선의 정답을 도출할 수 있습니다.
입출력 예 #2

다음 그림은 주어진 입력을 해결하는 방법을 나타낸 것입니다.
ex2.png
2번과 3번을 연결하는 전선을 끊으면 두 전력망이 모두 2개의 송전탑을 가지게 되며, 이 방법이 최선입니다.
입출력 예 #3

다음 그림은 주어진 입력을 해결하는 방법을 나타낸 것입니다.
ex3.png
3번과 7번을 연결하는 전선을 끊으면 두 전력망이 각각 4개와 3개의 송전탑을 가지게 되며, 이 방법이 최선입니다.
 */


package week_9.전력망을둘로나누기;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {

    static ArrayList<Integer>[] A;
    static boolean[] visited;

    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        visited = new boolean[n + 1];

        // 인접리스트 선언
        A = new ArrayList[n + 1];
        for (int i = 1; i < n + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        //인접 리스트에 값 추가
        for (int i = 0; i <wires.length; i++) {
            int s = wires[i][0];
            int e = wires[i][1];
            A[s].add(e);
            A[e].add(s);
        }

        // 모든 연결을 하나씩 끊어서 확인
        for (int[] wire : wires) {
            int s = wire[0];
            int e = wire[1];

            // 연결을 끊음
            A[s].remove((Integer) e);
            A[e].remove((Integer) s);

            // BFS 실행
            visited = new boolean[n + 1];
            int cnt1 = BFS(1);

            // 다른 쪽 송전탑 수는 전체에서 cnt1를 뺀 값
            int cnt2 = n - cnt1;

            // 최소 차이를 찾음
            answer = Math.min(answer, Math.abs(cnt1 - cnt2));

            // 연결 복구
            A[s].add(e);
            A[e].add(s);
        }

        return answer;
    }

    private static int BFS(int b) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(b);
        int cnt =1;

        visited[b] = true;
        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int j : A[now]) {

                if (!visited[j]) {
                    visited[j] = true;
                    queue.add(j);
                    cnt++;
                }

            }

        }
        return cnt;
    }

}
