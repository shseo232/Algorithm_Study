/*
https://school.programmers.co.kr/learn/courses/30/lessons/42746
문제 설명
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

제한 사항
numbers의 길이는 1 이상 100,000 이하입니다.
numbers의 원소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
입출력 예
numbers	return
[6, 10, 2]	"6210"
[3, 30, 34, 5, 9]	"9534330"
 */

package week_6.정렬.가장큰수;

import java.util.Arrays;

public class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = numbers[i]+"";
        }

        /*
        두 숫자를 붙여보았을때, 붙인 수를 비교해서 더 큰 숫자를 만든경우를 큰수로 판단한다.
        비교 대상이 다를 경우, 비교 결과가 음수이면 첫 번째(o1) 인자가 두 번째 인자(o2)보다 앞에 옴.
        비교 결과가 양수이면 첫 번째 인자가(o1) 두 번째 인자(o2)보다 뒤에 옴.
         */
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        // 정렬된 배열의 첫 번째 원소가 "0"이라면, 이는 모든 숫자가 0으로 이루어진 경우이므로 "0"을 반환
        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
        }


        return answer.toString();
    }
}
