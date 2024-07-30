import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static ArrayList<Integer>[] list;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //인접 리스트 생성
        list = new ArrayList[n+1];
        for (int i = 1; i < n+1; i++) {
            list[i] = new ArrayList<>();
        }

        //인접 리스트에 노드 연결, 무방향 그래프이므로 양쪽 모두 추가해줘야함
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list[start].add(end);
            list[end].add(start);
        }
        //방문 여부 체크 배열
        visited = new boolean[n+1];

        int count = 0;
        //1번 노드부터 마지막 노드까지 순회
        for (int i = 1; i <= n; i++) {
            //방문하지 않은 노드라면
            if(!visited[i]) {
                //dfs실행하고 count +1
                dfs(i);
                count++;
            }

        }

        System.out.println(count);
    }

    private static void dfs(int now) {
        //현재 노드 방문으로 변경
        visited[now] = true;
        
        //현재 노드에 연결된 모든 다음 노드에 대해서
        for (int next : list[now]) {
            //다음 노드가 방문하지 않은 노드라면 dfs실행
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
