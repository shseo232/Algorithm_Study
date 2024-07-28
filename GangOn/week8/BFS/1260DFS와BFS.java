import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static ArrayList<Integer>[] list;
    private static boolean[] visitedDFS;
    private static boolean[] visitedBFS;
    private static StringBuilder sbDFS;
    private static StringBuilder sbBFS;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        //인접 리스트 생성, 초기화
        list = new ArrayList[n+1];
        for (int i = 0; i < n+1; i++) {
            list[i] = new ArrayList<>();
        }


        //인접 리스트에 노드 연결, 무방향 그래프이므로 양쪽 모두 추가해줘야함
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        //방문할 수 있는 정점이 여러개인경우 정점번호가 더 작은 것을 먼저 방문하기 위해 정렬
        for (ArrayList<Integer> arrList : list) {
            Collections.sort(arrList);
        }

        //방문 여부 체크 배열
        visitedDFS = new boolean[n+1];
        visitedBFS = new boolean[n+1];

        //탐색결과 추가할 sb
        sbDFS = new StringBuilder();
        sbBFS = new StringBuilder();

        //v부터 dfs bfs 실행
        dfs(v);
        bfs(v);

        System.out.println(sbDFS);
        System.out.println(sbBFS);

    }

    private static void dfs(int now) {
        //현재 노드 방문으로 변경
        visitedDFS[now] = true;
        //방문한 현재 노드 sb에 추가
        sbDFS.append(now + " ");

        //현재 노드에 연결된 모든 다음 노드에 대해서
        for (int next : list[now]) {
            //다음 노드가 방문하지 않은 노드라면 dfs실행
            if (!visitedDFS[next]) {
                dfs(next);
            }
        }
    }

    private static void bfs(int start) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        visitedBFS[start] = true;

        //큐가 비어있지 않은 동안 반복
        while (!queue.isEmpty()) {
            //큐에 있는 노드 중 가장 먼저 추가된 원소 poll
            int now = queue.poll();
            //poll한 노드 sb에 추가
            sbBFS.append(now + " ");

            //현재 노드에 연결된 모든 다음 노드에 대해서
            for (int next : list[now]) {
                //다음 노드가 방문하지 않은 노드라면 큐에 add
                if (!visitedBFS[next]) {
                    queue.add(next);
                    //다음 노드도 방문으로 변경
                    visitedBFS[next] = true;
                }
            }
        }
    }
}
