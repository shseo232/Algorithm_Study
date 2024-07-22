/*
https://www.acmicpc.net/problem/2609
최대공약수와 최소공배수
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	117392	67797	55264	57.786%
문제
두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.

출력
첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.

예제 입력 1
24 18
예제 출력 1
6
72
 */

package week_7.수학.최대공약수와최소공배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        // 둘 중 작은수를 1씩 감소하면서 A,B에서 나눈 나머지가 둘다 0인 경우
        long min = Math.min(a, b);
        long GCD = 0; //최대공약수
        for (long j = min; j > 0; j--) {
            if (a % j == 0 && b % j == 0) {
                GCD = j;
                break;
            }
        }
        System.out.println(GCD);
        System.out.println(a * b / GCD);
    }

}
