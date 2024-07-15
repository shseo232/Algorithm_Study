import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        boolean [] arr = new boolean[20000001];

        for(int i = 0 ; i<N; i++){
            int tmp = Integer.parseInt(br.readLine());
            arr[tmp+1000000] = true;
        }

        for(int i = 0 ; i<arr.length; i++) {
            if (arr[i] == true) {
                sb.append(i-1000000).append("\n");
            }
        }
        System.out.println(sb);
    }
}
