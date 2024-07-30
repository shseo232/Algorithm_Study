import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            list.add(i);
        }

        int count = 0;
        for (int i = 2; i <=N; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) % i == 0) {
                    count++;
                    if (count == K) {
                        System.out.print(list.get(j));
                        break;
                    }
                    list.remove(j);
                }
            }
        }
    }
}
