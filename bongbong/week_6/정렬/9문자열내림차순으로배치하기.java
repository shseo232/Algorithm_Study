/*
https://school.programmers.co.kr/learn/courses/30/lessons/12917
문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
입출력 예
s	return
"Zbcdefg"	"gfedcbZ"
 */

package week_6.정렬.문자열내림차순으로배치하기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String s) {
        String answer = "";

        // list에 int로 하나씩 잘라서 담음
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add((int)s.charAt(i));
        }

        Collections.sort(list,Collections.reverseOrder());

        // answer에 붙여줄 때 (char)로 형변환 해서 붙임
        for (int i : list) {
            answer+=(char)i;
        }



        return answer;
    }
}
