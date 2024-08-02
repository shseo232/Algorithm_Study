/*
https://www.acmicpc.net/problem/13023
ABCDE
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	512 MB	55155	17486	11627	28.828%
문제
BOJ 알고리즘 캠프에는 총 N명이 참가하고 있다. 사람들은 0번부터 N-1번으로 번호가 매겨져 있고, 일부 사람들은 친구이다.

오늘은 다음과 같은 친구 관계를 가진 사람 A, B, C, D, E가 존재하는지 구해보려고 한다.

A는 B와 친구다.
B는 C와 친구다.
C는 D와 친구다.
D는 E와 친구다.
위와 같은 친구 관계가 존재하는지 안하는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 사람의 수 N (5 ≤ N ≤ 2000)과 친구 관계의 수 M (1 ≤ M ≤ 2000)이 주어진다.

둘째 줄부터 M개의 줄에는 정수 a와 b가 주어지며, a와 b가 친구라는 뜻이다. (0 ≤ a, b ≤ N-1, a ≠ b)
같은 친구 관계가 두 번 이상 주어지는 경우는 없다.

출력
문제의 조건에 맞는 A, B, C, D, E가 존재하면 1을 없으면 0을 출력한다.

예제 입력 1
5 4
0 1
1 2
2 3
3 4
예제 출력 1
1
예제 입력 2
5 5
0 1
1 2
2 3
3 0
1 4
예제 출력 2
1
예제 입력 3
6 5
0 1
0 2
0 3
0 4
0 5
예제 출력 3
0
예제 입력 4
8 8
1 7
3 7
4 7
3 4
4 6
3 5
0 4
2 7
예제 출력 4
1
 */

package week_9.ABDCE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    // 인접 리스트
    public static ArrayList<Integer>[] A;
    // 방문 여부 체크
    public static boolean[] visited;

    public static int answer = 0;

    public static void main(String[] args) throws IOException {
        // 입력 구현
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 인접 리스트에 노드별 공간 마련
        A = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            A[i] = new ArrayList<>();
        }

        // 인접 리스트 생성, 엣지 수 만큼 반복
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e);
            A[e].add(s);
        }

        // 인접 리스트와 visited를 확인하면서 DFS
        for (int i = 0; i < n; i++) {
            if (answer == 0) {
                DFS(i, 1);
            }
        }

        // 결과 출력
        System.out.println(answer);
    }

    private static void DFS(int start, int depth) {
        if (depth == 5) {
            answer = 1;
            return;
        }

        visited[start] = true;
        for (int i : A[start]) {
            if (!visited[i]) {
                DFS(i, depth + 1);
                if (answer == 1) {
                    return; // 이미 친구 관계를 찾았으면 더 이상 탐색하지 않음
                }
            }
        }
        visited[start] = false;
    }
}

