/*
https://www.acmicpc.net/problem/1260
DFS와 BFS 성공
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	295333	116000	68881	37.938%
문제
그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.

입력
첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.

출력
첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.

예제 입력 1
4 5 1
1 2
1 3
1 4
2 4
3 4
예제 출력 1
1 2 4 3
1 2 3 4
예제 입력 2
5 5 3
5 4
5 2
1 2
3 4
3 1
예제 출력 2
3 1 2 5 4
3 1 4 2 5
예제 입력 3
1000 1 1000
999 1000
예제 출력 3
1000 999
1000 999
 */

package week_9.DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int V;
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static boolean[] visited2;

    static String Dfs = "";
    static String Bfs = "";

    public static void main(String[] args) throws IOException {

        // N,M,V 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        // 인접 리스트
        A = new ArrayList[N + 1];
        // DFS 방문 리스트
        visited = new boolean[N + 1];

        // DFS 인접 리스트 공간 생성
        for (int i = 1; i < N + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        // DFS 인접 리스트에 값 추가
        for (int i = 0; i < M; i++) {

            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e);
            A[e].add(s);

        }

        // 오름차순으로 정렬
        for (int i = 1; i < N + 1; i++) {
            A[i].sort(Comparator.naturalOrder());
        }

        // DFS 실행
        if (!visited[V]) {
            DFS(V);
        }
        // DFS 출력
        System.out.println(Dfs.substring(0, Dfs.length() - 1));

        // DFS 방문 리스트
        visited2 = new boolean[N + 1];

        // BFS 실행
        if (!visited2[V]) {
            BFS(V);
        }
        // BFS 출력
        System.out.println(Bfs.substring(0, Bfs.length() - 1));

    }

    // DFS 구현
    private static void DFS(int d) {

        if (visited[d]) {
            return;
        }
        visited[d] = true;
        // 방문한 노드 기록
        Dfs += (d + " ");

        for (int k : A[d]) {
            if (!visited[k]) {

                DFS(k);
            }
        }
    }

    private static void BFS(int b) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(b);

        visited2[b] = true;
        while (!queue.isEmpty()) {
//			for (int i : queue) {
//				System.out.print(i);
//			}
//			System.out.println();

            int now = queue.poll();
//			System.out.println(now);

            Bfs += (now + " ");
            for (int j : A[now]) {

                if (!visited2[j]) {
                    visited2[j] = true;
                    queue.add(j);
                }

            }

        }

    }

}
