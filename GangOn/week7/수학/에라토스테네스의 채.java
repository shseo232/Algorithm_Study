import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        isPrime(k, n);
    }

    public static void isPrime(int k, int n) {

        boolean[] prime = new boolean[n+1];
        int count = 0;
        int result = 0;
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i <= n; i++) {
            if(prime[i] == true) {
                continue;
            }

            for (int j = i; j <= n; j += i) {
                if (prime[j] == true) {
                    continue;
                }
                prime[j] = true;
                count++;
                if(count == k) {
                    System.out.println(j);
                    return;
                }
            }
        }
    }
}
