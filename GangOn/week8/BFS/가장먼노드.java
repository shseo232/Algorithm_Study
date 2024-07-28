import java.util.*;

class Solution {
    private static ArrayList<Integer>[] list;
    private static int[] visited;
    private static int maxDist;
    
    public int solution(int n, int[][] edge) {
        //인접 리스트 생성
        list = new ArrayList[n+1];
        for (int i = 1; i < n+1; i++) {
            list[i] = new ArrayList<>();
        }

        //인접 리스트에 노드 연결, 무방향 그래프이므로 양쪽 모두 추가해줘야함
        for (int i = 0; i < edge.length; i++) {
            int start = edge[i][0];
            int end = edge[i][1];
            list[start].add(end);
            list[end].add(start);
        }
        //1번 노드로부터의 거리 저장 배열
        visited = new int[n+1];

        //bfs 실행
        bfs();

        int answer = 0;
        
        //거리가 최대거리와 같으면 answer+1
        for (int i : visited) {
            if (i == maxDist) {
                answer++;
            }
        }
        return answer;
    }
    
    private static void bfs() {

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        //1번 노드부터 시작
        queue.add(1);
        visited[1] = 1;

        while (!queue.isEmpty()) {

            int now = queue.poll();
            
            //현재 노드와 연결된 노드에 대해서
            for (int next : list[now]) {
                //방문하지 않은 노드라면
                if (visited[next] == 0) {
                    //다음 노드에 현재 거리 + 1 추가
                    visited[next] = visited[now] + 1;
                    //최대거리 갱신
                    maxDist = visited[next];
                    
                    queue.add(next);
                }
            }
        }
    }
}
