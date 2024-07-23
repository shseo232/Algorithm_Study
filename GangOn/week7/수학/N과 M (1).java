import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] arr;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        check = new boolean[N+1];
        dfs(0);

        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if (depth == M) {
            for (int i : arr) {
                sb.append(i + " ");
            }
//            System.out.println("끝");
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= N; i++) {
            if(!check[i]) {
                check[i] = true;
                arr[depth] = i;
//                System.out.println(Arrays.toString(arr) + " i : " + i + " depth: " + depth);
                dfs(depth + 1);
                check[i] = false;
            }

        }
    }
}
