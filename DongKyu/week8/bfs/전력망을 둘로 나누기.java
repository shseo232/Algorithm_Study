import java.util.*;

class Solution {
    public List<Integer>[] list;

    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE; // 초기값을 최대값으로 설정

        list = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int[] wire : wires) {
            list[wire[0]].add(wire[1]);
            list[wire[1]].add(wire[0]);
        }

        // 모든 간선을 제거하고 bfs를 통해 분리된 정점 수를 계산
        for (int[] wire : wires) {
            int n1 = bfs(wire[0], wire[1], n);
            int n2 = n - n1; // 전체 정점 수에서 n1을 빼면 n2가 됨

            // 두 그룹의 정점 수 차이의 절댓값을 계산
            answer = Math.min(answer, Math.abs(n1 - n2));
        }

        return answer;
    }

    public int bfs(int v1, int v2, int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visit = new boolean[n + 1];

        int cnt = 0;

        queue.add(v1);
        visit[v1] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            cnt++;

            for (int next : list[temp]) {
                if (next != v2 && !visit[next]) {
                    queue.add(next);
                    visit[next] = true;
                }
            }
        }

        return cnt;
    }
}
