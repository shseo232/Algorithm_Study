package week_2.문자열다루기기본;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int cnt =0;

        // 중복 문자 제거
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.add(c)) {
                sb.append(c);
            }
        }
        String s_distinct = sb.toString();
        
        // 해당 숫자가 있는 만큼 count == 중복제거문자열의 길이 + 초기문자열이 4 or 6 
        String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

        for (int i = 0; i < num.length; i++) {
            if (s_distinct.contains(num[i])) {
                cnt++;
            }

            if (cnt == s_distinct.length() && (s.length()==4 || s.length()==6)) {
                answer = true;
            }

        }

        return answer;
    }
}
