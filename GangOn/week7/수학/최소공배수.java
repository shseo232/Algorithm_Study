import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int a = Math.max(A, B);
            int b = Math.min(A, B);
            System.out.println(a * b /gcd(a, b));
        }

    }

    public static int gcd(int a, int b){
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
