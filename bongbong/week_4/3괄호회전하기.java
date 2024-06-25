package week_4.괄호회전하기;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/76502
다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.

(), [], {} 는 모두 올바른 괄호 문자열입니다.
만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다.
예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다. 예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.

대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다.
이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때
s가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
s의 길이는 1 이상 1,000 이하입니다.
입출력 예
s	        result
"[](){}"	3
"}]()[{"	2
"[)(]"	    0
"}}}"	    0
입출력 예 설명
입출력 예 #1

다음 표는 "[](){}" 를 회전시킨 모습을 나타낸 것입니다.
x	s를 왼쪽으로 x칸만큼 회전	올바른 괄호 문자열?
0	"[](){}"	O
1	"](){}["	X
2	"(){}[]"	O
3	"){}[]("	X
4	"{}[]()"	O
5	"}[](){"	X
올바른 괄호 문자열이 되는 x가 3개이므로, 3을 return 해야 합니다.
입출력 예 #2

다음 표는 "}]()[{" 를 회전시킨 모습을 나타낸 것입니다.
x	s를 왼쪽으로 x칸만큼 회전	올바른 괄호 문자열?
0	"}]()[{"	X
1	"]()[{}"	X
2	"()[{}]"	O
3	")[{}]("	X
4	"[{}]()"	O
5	"{}]()["	X
올바른 괄호 문자열이 되는 x가 2개이므로, 2를 return 해야 합니다.
입출력 예 #3

s를 어떻게 회전하더라도 올바른 괄호 문자열을 만들 수 없으므로, 0을 return 해야 합니다.
입출력 예 #4

s를 어떻게 회전하더라도 올바른 괄호 문자열을 만들 수 없으므로, 0을 return 해야 합니다.
 */

import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String front = "";
        String back = "";
        String[] arr = new String[s.length()];
        boolean cnt = true;

        // 1. 스택을 이용해서 회전된 문자열을 담는다
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            front = s.substring(i);
            back = s.substring(0, i);
            arr[i] = front + back;
        }
        // 2. 올바른 괄호가 가능한지 확인
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                cnt = true;
                if (arr[i].charAt(j) == '(' || arr[i].charAt(j) == '{' || arr[i].charAt(j) == '[') {
                    stack.push(arr[i].charAt(j));
                } else if (arr[i].charAt(j) == ')' || arr[i].charAt(j) == '}' || arr[i].charAt(j) == ']') {
                    if (stack.empty()) {
                        cnt = false;
                        break;
                    } else if ((int) arr[i].charAt(j) - (int) stack.peek() >= 1) { // 같은 종류의 괄호일때만 pop
                        stack.pop();
                    }

                }

            }
            if (stack.empty() && cnt) {
                answer++;
            }
        }

        return answer;
    }
}
