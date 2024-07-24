import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N,M;
    static boolean[] visited;
    static int[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visited = new boolean[N+1];
        dfs(0,1);
        System.out.println(sb);

    }
    static void dfs(int depth,int V){

        if (depth == M) {
            boolean zero = false;
            for (int i : arr) {
                if(i==0) {
                    zero = true;
                    break;
                }
                sb.append(i + " ");
            }
            if (!zero) {
                sb.append("\n");
            }
            return;
        }

        for(int i = V-1 ; i <=N; i++){
            if(!visited[i]){
//                visited[i] = true;
                arr[depth] = i;
                dfs(depth + 1,i+1);
                visited[i] = false;
            }
        }
    }
}
