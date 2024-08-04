import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        if(isPrime(m, n)[1] != -1) {
            System.out.println(isPrime(m, n)[0]);
            System.out.println(isPrime(m, n)[1]);
        } else {
            System.out.println(isPrime(m, n)[1]);
        }

    }

    public static int[] isPrime(int m, int n) {

        boolean[] prime = new boolean[n+1];
        int[] result = new int[2];
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
        int sum = 0;
        boolean isFirst = true;
        int min = -1;
        for (int i = m; i <= n; i++) {
            if(isFirst && prime[i] == false) {
                min = i;
                sum += i;
                isFirst = false;
            } else if(prime[i] == false) {
                sum += i;
            }
        }
        result[0] = sum;
        result[1] = min;

        return result;


    }
}
