import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static ArrayList<Integer>[] list;
    private static boolean[] visited;
    private static int answer;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //인접 리스트 생성
        list = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }

        //인접 리스트에 노드 연결, 무방향 그래프이므로 양쪽 모두 추가해줘야함
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int f1 = Integer.parseInt(st.nextToken());
            int f2= Integer.parseInt(st.nextToken());
            list[f1].add(f2);
            list[f2].add(f1);
        }

        //방문 여부 체크 배열
        visited = new boolean[n];

        //1번 노드부터 마지막 노드까지 순회
        for (int i = 0; i < n; i++) {
            //방문하지 않은 노드고 아직 친구관계가 존재하지 않는다면
            if(!visited[i] && answer == 0) {
                //dfs실행
                dfs(i, 0);
            }

        }
        System.out.println(answer);

    }

    private static void dfs(int now, int depth) {
        //5명이 친구관계가 있으면
        if(depth == 4) {
             answer = 1;
             return;
        }
        //현재 노드 방문으로 변경
        visited[now] = true;

        //현재 노드에 연결된 모든 다음 노드에 대해서
        for (int next : list[now]) {
            //다음 노드가 방문하지 않은 노드라면 dfs실행, depth증가
            if (!visited[next]) {
                dfs(next, depth + 1);
            }
        }
        //현재 노드 false로 변경(얘가 친구가 두명있을수도 있어서 다시 체크해봐야함)
        visited[now] = false;
    }
}
