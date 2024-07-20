/*
https://www.acmicpc.net/problem/1145
문제
다섯 개의 자연수가 있다. 이 수의 적어도 대부분의 배수는 위의 수 중 적어도 세 개로 나누어 지는 가장 작은 자연수이다.

서로 다른 다섯 개의 자연수가 주어질 때, 적어도 대부분의 배수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 다섯 개의 자연수가 주어진다. 100보다 작거나 같은 자연수이고, 서로 다른 수이다.

출력
첫째 줄에 적어도 대부분의 배수를 출력한다.

예제 입력 1
30 42 70 35 90
예제 출력 1
210
예제 입력 2
1 2 3 4 5
예제 출력 2
4
예제 입력 3
30 45 23 26 56
예제 출력 3
1170
예제 입력 4
3 14 15 92 65
예제 출력 4
195
 */

package week_7.완전탐색.적어도대부분의배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        int cnt = 0;


        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int N = arr[0];

        while (true) {
            N++; // 제일 작은 수부터 시작해서 3개 이상 나눠질 때 까지 1씩 더하면서 확인
            for (int i = 0; i < 5; i++) {
                if (N >= arr[i] && N % arr[i] == 0) cnt++;
            }
            if (cnt >= 3) {
                System.out.println(N);
                break;
            } else {
                cnt = 0;
            }
        }
    }
}
