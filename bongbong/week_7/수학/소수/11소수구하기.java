/*
https://www.acmicpc.net/problem/1929
문제
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

출력
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

예제 입력 1
3 16
예제 출력 1
3
5
7
11
13
 */
package week_7.수학.소수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        // 소수 여부를 나타내는 배열 초기화 (모두 true로 초기화)
        boolean[] isPrime = new boolean[n+ 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }


        for (int i = 2; i*i <= n; i++) {
            if (isPrime[i]) { // 2. 아직 지우지 않은 수 중 가장 작은 수를 찾는다. 이것을 P라고 하고, 이 수는 소수이다.
                for (int j = i*i; j <= n; j += i) {
                    if (isPrime[j]) {
                        isPrime[j] = false; // 3. P를 지우고, 아직 지우지 않은 P의 배수를 크기 순서대로 지운다.
                    }
                }
            }
            // 4. 아직 모든 수를 지우지 않았다면, 다시 2번 단계로 간다.
        }

        for(int i = m; i <= n; i++) {
            if(i!=1 && isPrime[i]){ // 1은 소수가 아님
                sb.append(i).append("\n");
            }
        }

        System.out.print(sb);
    }
}
