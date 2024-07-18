import java.util.*;
import java.io.*;
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        long ans = 1;
        
        for (int i = a; i > 0; i--) {
            ans *= i;
        }
        
        System.out.println(ans);
    }
}
