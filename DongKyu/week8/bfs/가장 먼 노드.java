import java.util.*;
 
class Solution {
    public int solution(int n, int[][] edge) {
        boolean[][] node = new boolean[n + 1][n + 1];
        boolean[] visit = new boolean[n + 1];
        
        for(int i = 0; i < edge.length; i++) {
            int x = edge[i][0];
            int y = edge[i][1];
            node[x][y] = true;
            node[y][x] = true;
        }
        
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visit[1] = true;
        int answer = 1;
        
        while(!q.isEmpty()) {
            answer = q.size();
            for(int i = 0; i < answer; i++) {
                int temp = q.poll();
                for(int j = 2; j <= n; j++) {
                    if(visit[j] == false && node[temp][j] == true) {
                    	visit[j] = true;
                        q.add(j);
                    }
                }
            }
        }
        return answer;
    }
}
