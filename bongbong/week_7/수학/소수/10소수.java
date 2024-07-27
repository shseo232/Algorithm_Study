/*
문제
자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.

예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로,
이들 소수의 합은 620이고, 최솟값은 61이 된다.

입력
입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.

M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.

출력
M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.

단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.

예제 입력 1
60
100
예제 출력 1
620
61
예제 입력 2
64
65
예제 출력 2
-1
 */

package week_7.수학.소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;

        // 소수 여부를 나타내는 배열 초기화 (모두 true로 초기화)
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }


        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) { // 2. 아직 지우지 않은 수 중 가장 작은 수를 찾는다. 이것을 P라고 하고, 이 수는 소수이다.
                for (int j = i * i; j <= n; j += i) {
                    if (isPrime[j]) {
                        isPrime[j] = false; // 3. P를 지우고, 아직 지우지 않은 P의 배수를 크기 순서대로 지운다.
                    }
                }
            }
            // 4. 아직 모든 수를 지우지 않았다면, 다시 2번 단계로 간다.
        }

        for (int i = m; i <= n; i++) {
            if (i != 1 && isPrime[i]) { // 1은 소수가 아님
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
        }

        if (sum==0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);

        }
    }
}
