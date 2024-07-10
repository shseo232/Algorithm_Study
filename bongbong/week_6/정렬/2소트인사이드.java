/*
https://www.acmicpc.net/problem/1427
문제
배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

입력
첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.

예제 입력 1
2143
예제 출력 1
4321
예제 입력 2
999998999
예제 출력 2
999999998
예제 입력 3
61423
예제 출력 3
64321
예제 입력 4
500613009
예제 출력 4
965310000
 */

package week_6.소트인사이드;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(Integer.parseInt(str.charAt(i) + ""));
        }
        Collections.sort(list, Collections.reverseOrder());

        for (int i : list) {
            System.out.print(i);
        }
    }


}
