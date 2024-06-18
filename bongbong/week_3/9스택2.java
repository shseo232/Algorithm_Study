package week_3.스택2;

/*
https://www.acmicpc.net/problem/28278
문제
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
3: 스택에 들어있는 정수의 개수를 출력한다.
4: 스택이 비어있으면 1, 아니면 0을 출력한다.
5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
입력
첫째 줄에 명령의 수 N이 주어진다. (1 ≤ N ≤ 1,000,000)

둘째 줄부터 N개 줄에 명령이 하나씩 주어진다.

출력을 요구하는 명령은 하나 이상 주어진다.

출력
출력을 요구하는 명령이 주어질 때마다 명령의 결과를 한 줄에 하나씩 출력한다.

예제 입력 1
9
4
1 3
1 5
3
2
5
2
2
5

예제 출력 1
1
2
5
3
3
-1
-1
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        List<Integer> stack = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            int temp = Integer.parseInt(st.nextToken());

            if (temp == 1) {
                stack.add(Integer.parseInt(st.nextToken()));
            } else if (temp == 2) {


                if (stack.size() == 0) {
                    sb.append(-1);
                    sb.append("\n");
                } else {
                    sb.append(stack.get(stack.size() - 1));
                    sb.append("\n");
                    stack.remove(stack.size() - 1);
                }
            } else if (temp == 3) {
                sb.append(stack.size());
                sb.append("\n");
            } else if (temp == 4) {
                sb.append(stack.size() == 0 ? 1 : 0);
                sb.append("\n");
            } else if (temp == 5) {
                sb.append(stack.size() != 0 ? stack.get(stack.size() - 1) : -1);
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
