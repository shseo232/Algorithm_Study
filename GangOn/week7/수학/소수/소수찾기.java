import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(st.nextToken());
            answer += isPrime(m);
        }

        System.out.println(answer);

    }

    public static int isPrime(int n) {
        if (n < 2) {
            return 0;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    return 0;
                }
            }
            return 1;
        }
    }
}
