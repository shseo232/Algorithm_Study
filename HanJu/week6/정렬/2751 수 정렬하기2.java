import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : arr) {
            bw.write(String.valueOf(i) + "\n");
        }
        bw.flush(); // 버퍼를 비웁니다.
        bw.close(); // BufferedWriter를 닫습니다.
        br.close(); // BufferedReader를 닫습니다.
    }
}
