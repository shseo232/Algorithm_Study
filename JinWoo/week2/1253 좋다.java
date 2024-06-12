import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr.length - 1;
            int tmp = 0;

            while (start < end) {
                if (start == i) {
                    start++;
                    continue;
                }
                if (end == i) {
                    end--;
                    continue;
                }
                tmp = arr[start] + arr[end];

                if (tmp > arr[i]) {
                    end--;
                } else if (tmp < arr[i]) {
                    start++;
                } else {
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
