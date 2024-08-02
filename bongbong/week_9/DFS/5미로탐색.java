/*
https://www.acmicpc.net/submit/2178
미로 탐색 성공
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	192 MB	209232	96396	61093	44.508%
문제
N×M크기의 배열로 표현되는 미로가 있다.

1	0	1	1	1	1
1	0	1	0	1	0
1	0	1	0	1	1
1	1	1	0	1	1
미로에서 1은 이동할 수 있는 칸을 나타내고, 0은 이동할 수 없는 칸을 나타낸다. 이러한 미로가 주어졌을 때, (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소의 칸 수를 구하는 프로그램을 작성하시오. 한 칸에서 다른 칸으로 이동할 때, 서로 인접한 칸으로만 이동할 수 있다.

위의 예에서는 15칸을 지나야 (N, M)의 위치로 이동할 수 있다. 칸을 셀 때에는 시작 위치와 도착 위치도 포함한다.

입력
첫째 줄에 두 정수 N, M(2 ≤ N, M ≤ 100)이 주어진다. 다음 N개의 줄에는 M개의 정수로 미로가 주어진다. 각각의 수들은 붙어서 입력으로 주어진다.

출력
첫째 줄에 지나야 하는 최소의 칸 수를 출력한다. 항상 도착위치로 이동할 수 있는 경우만 입력으로 주어진다.

예제 입력 1
4 6
101111
101010
101011
111011
예제 출력 1
15
예제 입력 2
4 6
110110
110110
111111
111101
예제 출력 2
9
예제 입력 3
2 25
1011101110111011101110111
1110111011101110111011101
예제 출력 3
38
예제 입력 4
7 7
1011111
1110001
1000001
1000001
1000001
1000001
1111111
예제 출력 4
13
 */

package week_9.미로탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

    static private int[] dx = { 0, 1, 0, -1 };
    static private int[] dy = { 1, 0, -1, 0 };
    static private boolean[][] visited;
    static private int[][] A;
    static private int n;
    static private int m;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());


        // 방문 체크
        visited = new boolean[n][m];

        // 입력한 미로 배열에 넣기
        A = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(line.substring(j, j + 1));
            }

        }

        BFS(0, 0);
        System.out.println(A[n - 1][m - 1]);

    }

    private static void BFS(int i, int j) {
        // 큐를 만들고, 방문한 노드를 넣는다, 그리고 방문표시를 한다
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[] { i, j });
        visited[i][j] = true;

        // 탐색 시작
        // 큐가 비면 탐색 끝
        // 큐에서 하나 꺼내서 시작
        while(!queue.isEmpty()) {
            int now[] = queue.poll();
            for (int k =0 ;k<4;k++) {
                int x = now[0]+dx[k];
                int y = now[1]+dy[k];
                if (x<n && y<m && x>=0 && y>=0 && A[x][y] != 0 && !visited[x][y]) {
                    visited[x][y] = true;
                    A[x][y] = A[now[0]][now[1]]+1;
                    queue.add(new int[] {x,y});
                }
            }
        }


    }

}
