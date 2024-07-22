/*
https://www.acmicpc.net/problem/1541
문제
세준이는 양수와 +, -, 그리고 괄호를 가지고 식을 만들었다. 그리고 나서 세준이는 괄호를 모두 지웠다.

그리고 나서 세준이는 괄호를 적절히 쳐서 이 식의 값을 최소로 만들려고 한다.

괄호를 적절히 쳐서 이 식의 값을 최소로 만드는 프로그램을 작성하시오.

입력
첫째 줄에 식이 주어진다. 식은 ‘0’~‘9’, ‘+’, 그리고 ‘-’만으로 이루어져 있고,
가장 처음과 마지막 문자는 숫자이다.
그리고 연속해서 두 개 이상의 연산자가 나타나지 않고,
5자리보다 많이 연속되는 숫자는 없다. 수는 0으로 시작할 수 있다.
입력으로 주어지는 식의 길이는 50보다 작거나 같다.

출력
첫째 줄에 정답을 출력한다.

예제 입력 1
55-50+40
예제 출력 1
-35
예제 입력 2
10+20+30+40
예제 출력 2
100
예제 입력 3
00009-00009
예제 출력 3
0
 */

package week_7.그리디.잃어버린괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int result = 0;

        // - 뒤에 있는 값을 괄호로 묶을 때, 최소값 만들 수 있음
        String[] arr= str.split("-");

        for (int i = 0; i < arr.length; i++) {
            // + 기호 묶음도 하나씩 보면서 잘라주고
            String[] temp = arr[i].split("\\+");
            // + 묶음은 합계를 구해줌
            int tempSum = 0;
            for (int j = 0; j < temp.length; j++) {
                tempSum+= Integer.parseInt(temp[j]);
            }
            if (i == 0) {
                // 제일 첫번째 + 묶음은 그냥 더함
                result += tempSum;
            } else {
                // 나머지는 다 빼주면 됨 (-묶음으로 나누고 그 안에서 + 묶음으로 나눈거기 때문)
                result -= tempSum;
            }
        }

        System.out.println(result);

    }
}
