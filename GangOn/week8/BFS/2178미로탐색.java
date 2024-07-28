import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    //미로 2차원 배열
    private static int[][] map;
    // 방문 여부를 저장하는 2차원 배열
    private static boolean[][] visited;
    // 미로의 행과 열 크기
    private static int n;
    private static int m;
    // 상, 하, 좌, 우 방향 배열
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // map과 visited 배열 초기화
        map = new int[n][m];
        visited = new boolean[n][m];

        //map 배열 만들기
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        // 시작점 (0, 0) 방문 표시
        visited[0][0] = true;
        // BFS 탐색 시작
        bfs(0, 0);
        // 도착점까지의 최단 거리 출력
        System.out.println(map[n - 1][m - 1]);

    }

    // BFS 탐색 메서드
    private static void bfs(int x, int y) {

        ArrayDeque<int[]> queue = new ArrayDeque<>();
        //시작점(0, 0) 큐에 추가
        queue.add(new int[] {x, y});

        // 큐가 비어있지 않은 동안 반복
        while (!queue.isEmpty()) {

            int now[] = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            // 현재 위치에서 네 방향으로 이동 가능한지 확인
            for (int i =0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                // 이동할 위치가 미로 범위를 벗어나면 이동 x
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) {
                    continue;
                }
                // 이미 방문했거나 이동할 수 없는 칸이면 이동 x
                if (visited[nextX][nextY] || map[nextX][nextY] == 0) {
                    continue;
                }
                // 이동 위치 큐에 추가
                queue.add(new int[] {nextX, nextY});
                //이동 거리 +1
                map[nextX][nextY] = map[nowX][nowY] + 1;
                //방문 표시
                visited[nextX][nextY] = true;
            }
        }
    }
}
