import java.util.*;

class Solution {
    private static ArrayList<Integer>[] list;
    private static boolean[] visited;
    private static int count;
    
    public int solution(int n, int[][] wires) {
        //두 전력망의 개수 차이를 저장할 리스트
        ArrayList<Integer> countList = new ArrayList<>();

        //전선을 하나씩 끊어보면서 전력망 개수 체크
        for (int i = 0; i < wires.length; i++) {
            count = 1;
            int[][] cutWires = Arrays.copyOf(wires, wires.length);
            cutWires[i] = new int[]{0, 0};

            //인접 리스트 초기화, 생성
            list = new ArrayList[n+1];
            for (int j = 0; j < n+1; j++) {
                list[j] = new ArrayList<>();
            }

            for (int j = 0; j < cutWires.length; j++) {
                int v1 = cutWires[j][0];
                int v2 = cutWires[j][1];
                list[v1].add(v2);
                list[v2].add(v1);
            }

            //방문 여부 체크 배열
            visited = new boolean[n+1];

            //1번 송전탑과 연결된 송전탑의 개수 카운트
            dfs(1);
            countList.add(Math.abs(n - count * 2));
        }

        //countList에서 최소값이 가능한 비슷하도록 나눴을때의 개수의 차이
        int answer = Collections.min(countList);
        
        return answer;
    }
    
    private static void dfs(int now) {
        //현재 노드 방문으로 변경
        visited[now] = true;

        //현재 노드에 연결된 모든 다음 노드에 대해서
        for (int next : list[now]) {
            //다음 노드가 방문하지 않은 노드라면 dfs실행, count 증가
            if (!visited[next]) {
                dfs(next);
                count++;

            }
        }
        //현재 노드 false로 변경
        visited[now] = false;
    }
}
