import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        System.out.println(fib(N));
    }

    public static int fib(int a) {
        if (a == 0) {
            return 0;
        }
        if (a == 1) {
            return 1;
        }
        return fib(a - 1) + fib(a - 2);
    }
}
