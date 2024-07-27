/*
https://www.acmicpc.net/problem/15652
N과 M (4)
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	512 MB	58641	46177	36766	78.765%
문제
자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

1부터 N까지 자연수 중에서 M개를 고른 수열
같은 수를 여러 번 골라도 된다.
고른 수열은 비내림차순이어야 한다.
길이가 K인 수열 A가 A1 ≤ A2 ≤ ... ≤ AK-1 ≤ AK를 만족하면, 비내림차순이라고 한다.
입력
첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)

출력
한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.

수열은 사전 순으로 증가하는 순서로 출력해야 한다.

예제 입력 1
3 1
예제 출력 1
1
2
3
예제 입력 2
4 2
예제 출력 2
1 1
1 2
1 3
1 4
2 2
2 3
2 4
3 3
3 4
4 4
예제 입력 3
3 3
예제 출력 3
1 1 1
1 1 2
1 1 3
1 2 2
1 2 3
1 3 3
2 2 2
2 2 3
2 3 3
3 3 3
 */
package week_7.수학.N과M4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int[] output = new int[r];
        int start = 0;
        int depth = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        List<String> list = new ArrayList<>();
        comb(list, arr, output, start, depth, n, r);
        Collections.sort(list); // 오름차순 정렬로 출력

        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);

    }

    static void comb(List<String> list, int[] arr, int[] output, int start, int depth, int n, int r) {
        if (depth == r) {
            // 배열을 문자열로 변환 (대괄호와 쉼표를 제거)
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < r; i++) {
                sb.append(output[i]).append(" ");
            }
            list.add(sb.toString().trim()); // 공백 제거 후 리스트에 추가

            return;
        }

        for (int i = start; i < n; i++) {
            output[depth] = arr[i]; // 방문한 값을 output 배열에 순서대로 넣어줌
            comb(list, arr, output, i, depth + 1, n, r);
        }
    }
}
