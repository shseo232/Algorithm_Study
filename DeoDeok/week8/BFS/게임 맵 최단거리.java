import java.util.*;
class Solution {
    static boolean[][] visited;
    static int[] dx = new int[]{-1,0,1,0};
    static int[] dy = new int[]{0,1,0,-1};
    static int[][] map;
    static int n;
    static int m;
    public int solution(int[][] maps) {
        int answer = 0;
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];
        bfs(0,0,maps);
         if (maps[n-1][m-1] == 1) {
            answer = -1;
        } else {
            answer = maps[n-1][m-1];
        }
        return answer;
    }
    static void bfs(int a, int b, int[][] maps){
        Queue<int[]> q = new LinkedList();
        q.add(new int[]{a,b});
        visited[a][b] = true;
    
        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int i=0; i<4; i++){
                int x = cur[0] + dx[i];
                int y = cur[1] + dy[i];
                if(x >=0 && y >=0 && x<n && y<m){
                    if(maps[x][y] ==1 && visited[x][y] == false){
                        visited[x][y] = true;
                        maps[x][y] = maps[cur[0]][cur[1]]+1;
                        q.add(new int[]{x,y});
                    }
                }
            }
        }
        
    }
}
