import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N,M,V;
    static Queue<Integer>que = new LinkedList<>();
    static int [][] arr;
    static boolean [] check;

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // node
        M = Integer.parseInt(st.nextToken()); // edge
        V = Integer.parseInt(st.nextToken()); // start

        arr = new int[N + 1][N + 1];
        check = new boolean[N+1];


        for(int i = 0 ; i<M; i++){
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            arr[A][B] = arr[B][A] = 1;
        }
        dfs(V);
        sb.append("\n");

        check = new boolean[N+1];

        bfs(V);
        System.out.println(sb);
    }

    public static void dfs(int V){
        check[V] = true;
        sb.append(V+ " ");

        for(int i = 1 ; i<=N; i++){
            if(arr[V][i] == 1 && !check[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int V){
        que.offer(V);
        check[V] = true;

        while(!que.isEmpty()){
            V = que.poll();
            sb.append(V + " ");

            for(int i = 1 ; i<=N; i++){
                if(arr[V][i] == 1 && !check[i]){
                    que.offer(i);
                    check[i] = true;
                }
            }
        }
    }
}
