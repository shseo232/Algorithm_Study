import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String M = Integer.toString(N);
        StringBuilder sb = new StringBuilder();

        Integer[] arr = new Integer[M.length()];
        for (int i = 0; i < M.length(); i++) {
            arr[i] = M.charAt(i) - '0'; // 문자를 숫자로 변환
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0; i<M.length();i++){
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());
    }
}
