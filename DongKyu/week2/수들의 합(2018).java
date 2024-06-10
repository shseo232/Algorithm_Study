import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            for (int j = i; j <= num; j++) {
                sum += j;
                if (sum > num) {
                    break;
                } else if (sum == num) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
