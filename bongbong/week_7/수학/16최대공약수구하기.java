/*
https://www.acmicpc.net/problem/1850
최대공약수
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	256 MB	27823	9353	7616	35.536%
문제
모든 자리가 1로만 이루어져있는 두 자연수 A와 B가 주어진다. 이때, A와 B의 최대 공약수를 구하는 프로그램을 작성하시오.

예를 들어, A가 111이고, B가 1111인 경우에 A와 B의 최대공약수는 1이고, A가 111이고, B가 111111인 경우에는 최대공약수가 111이다.

입력
첫째 줄에 두 자연수 A와 B를 이루는 1의 개수가 주어진다. 입력되는 수는 263보다 작은 자연수이다.

출력
첫째 줄에 A와 B의 최대공약수를 출력한다. 정답은 천만 자리를 넘지 않는다.

예제 입력 1
3 4
예제 출력 1
1
예제 입력 2
3 6
예제 출력 2
111
예제 입력 3
500000000000000000 500000000000000002
예제 출력 3
11
 */

package week_7.수학.최대공약수1850;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long result = gcd(a, b);
        for (int i = 0; i < result; i++) {
            sb.append("1");
        }
        System.out.println(sb);

    }

    // 유클리드호제법
    static long gcd(long x, long y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }
}
