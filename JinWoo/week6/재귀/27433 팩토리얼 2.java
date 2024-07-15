import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        System.out.println(fac(N));
    }

    public static long fac(int a) {
        if (a == 0) {
            return 1;
        }
        return a * fac(a - 1);
    }
}
