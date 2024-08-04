import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [][] arr;
    static boolean [] check;
    static int N,M;

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N + 1 ][N + 1];
        check = new boolean[N + 1];

        for(int i = 0 ; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            arr[A][B] = arr[B][A] = 1;
        }

        int count = 0;

        for(int i = 1; i <= N; i++){
            if(!check[i]){
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void dfs(int node) {
        check[node] = true;

        for(int i = 1; i <= N; i++){
            if(arr[node][i] == 1 && !check[i]){
                dfs(i);
            }
        }
    }
}
