import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        isPrime(m, n);



    }

    public static void isPrime(int m, int n) {

        boolean[] prime = new boolean[n+1];
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(prime[i] == true) {
                continue;
            }

            for (int j = i * i; j <= n; j += i) {
                prime[j] = true;
            }
        }

        for (int i = m; i <= n; i++) {
            if (prime[i] == false) {
                System.out.println(i);
            }
        }
    }
}
