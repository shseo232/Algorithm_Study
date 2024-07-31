import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int[] dx = { 1, 0, -1, 0 };
    static int[] dy = { 0, 1, 0, -1 };
    static boolean[][] visited;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n+1][m+1];
        visited = new boolean[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            String[] split = s.split("");
            for(int j=0; j<split.length; j++){
                arr[i][j+1] = Integer.parseInt(split[j]);
            }
        }
        bfs(1,1);
        System.out.println(arr[n][m]);
    }
    static void bfs(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        visited[i][j] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int k = 0; k < 4; k++) {
                int x = cur[0] + dx[k];
                int y = cur[1] + dy[k];
                if(x>=1 && y>=1&& x<=n && y<=m){
                    if(arr[x][y]==1 && !visited[x][y]){
                        visited[x][y] = true;
                        arr[x][y]= arr[cur[0]][cur[1]]+1;
                        q.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}
