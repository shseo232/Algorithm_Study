package week_4.뒤에있는큰수찾기;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/154539
참고 : https://sasca37.tistory.com/306
문제 설명
정수로 이루어진 배열 numbers가 있습니다.
배열 의 각 원소들에 대해 자신보다 뒤에 있는 숫자 중에서 자신보다 크면서 가장 가까이 있는 수를 뒷 큰수라고 합니다.

정수 배열 numbers가 매개변수로 주어질 때,
모든 원소에 대한 뒷 큰수들을 차례로 담은 배열을 return 하도록 solution 함수를 완성해주세요.
단, 뒷 큰수가 존재하지 않는 원소는 -1을 담습니다.

제한사항
4 ≤ numbers의 길이 ≤ 1,000,000
1 ≤ numbers[i] ≤ 1,000,000
입출력 예
numbers	            result
[2, 3, 3, 5]	    [3, 5, 5, -1]
[9, 1, 5, 3, 6, 2]	[-1, 5, 6, 6, -1, -1]


 */

import java.util.LinkedList;
import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numbers.length; i++) {

            while (!stack.empty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.peek()] = numbers[i];
                stack.pop();
            }
            stack.push(i);
        }

        while (!stack.empty()) {
            answer[stack.peek()] = -1;
            stack.pop();
        }


        return answer;
    }
}
