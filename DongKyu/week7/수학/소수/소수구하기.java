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
        StringTokenizer st = new StringTokenizer(br.readLine());
        //n, k 입력 받기
        int n = Integer.parseInt(st.nextToken()); // 시작
        int k = Integer.parseInt(st.nextToken()); // 끝
        primeNumber(n, k);
    }

    static void primeNumber(int n,int k) {
        if(k<2){
            return;
        }

        int[] arr = new int[k + 1];  ////n까지 비교하기 위해 n+1만큼의 길이를 가진 배열 생성
        StringBuilder sb = new StringBuilder();
        //배열 초기화화
        for (int i = 2; i <= k; i++) {
            arr[i] = i;
        }

        for (int i = 2; i*i <= k; i++) {
            if (arr[i] == 0) {
                continue;
            }

            //배수들 지우기
            for (int j = i*i; j <= k; j += i) {
                if (arr[j] != 0) {
                    arr[j] = 0;
                }
            }

        }

        for (int i = 2; i <=k; i++) {
            if (arr[i] != 0 && arr[i]>=n) {
                sb.append(arr[i]).append(" ");
            }
        }

        System.out.println(sb.toString());

    }
}
