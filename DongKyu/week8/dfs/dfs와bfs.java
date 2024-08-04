import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[] visit;
    static int n;
    static int m;
    static int start;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        arr = new int[1001][1001];
        visit = new boolean[1001];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = arr[y][x] = 1;
        }

        dfs(start);
        visit = new boolean[1001];
        System.out.println();
        bfs();
    }

    public static void dfs(int i) {
        visit[i] = true;
        System.out.print(i + " ");
        for (int j = 1; j <= n; j++) {
            if (arr[i][j] == 1 && !visit[j]) {
                dfs(j);
            }
        }
    }

    public static void bfs() { // 먼저 이어진 정점을 모두 탐색후 해당 정점과 이어진 다른 정점을 탐색하기 위해 큐사용
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visit[start] = true;
        System.out.print(start + " ");
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            for (int j = 1; j <= n; j++) {
                if (arr[temp][j] == 1 && !visit[j]) {
                    queue.offer(j);
                    visit[j] = true;
                    System.out.print(j + " ");
                }
            }
        }
    }
}
