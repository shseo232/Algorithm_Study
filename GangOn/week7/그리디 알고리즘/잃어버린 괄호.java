import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        int answer= 0;
        int idx = 1;

        while (st.hasMoreTokens()) {
            int sum = 0;
            StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");
            while (st2.hasMoreTokens()) {
                sum += Integer.parseInt(st2.nextToken());
            }

            if(idx == 1) {
                answer += sum;
            } else {
                answer -= sum;
            }
            idx++;

        }

        System.out.println(answer);
        
    }
}
