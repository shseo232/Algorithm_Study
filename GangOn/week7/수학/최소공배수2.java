import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long a = Math.max(A, B);
        long b = Math.min(A, B);
        System.out.println(a * b /gcd(a, b));


    }

    public static long gcd(long a, long b){
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
