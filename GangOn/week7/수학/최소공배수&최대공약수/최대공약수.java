import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long n = gcd(A, B);

        StringBuilder sb = new StringBuilder();
        for (long i = 0; i < n; i++) {
            sb.append("1");
        }

        System.out.println(sb);

    }
    public static long gcd(long a, long b){
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
