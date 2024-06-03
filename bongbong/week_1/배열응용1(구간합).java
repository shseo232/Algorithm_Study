package week_1.구간합구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()); //수의 개수 N
        int M = Integer.parseInt(st.nextToken()); //합을 구해야 하는 횟수 M
        int[] arr = new int[N + 1];
        List<Integer> result = new ArrayList<>();
        arr[0] = 0;

        st = new StringTokenizer(bf.readLine());
        // arr에 1~현재 인덱스까지의 구간합 저장
        for (int i = 1; i <= N; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
//            System.out.println(arr[e]);
//            System.out.println(arr[s-1]);
            result.add(arr[e] - arr[s - 1]);
        }
        for (int i : result) {
            System.out.println(i);
        }
    }
}

