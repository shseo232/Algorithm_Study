package week_2.문자열내p와y의개수;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String lowers = s.toLowerCase();
        int cnt_y = 0;
        int cnt_p = 0;

        // p,y 개수 세기
        for (int i = 0; i < lowers.length(); i++) {
            if (lowers.charAt(i) == 121) {// y인경우
                cnt_y++;
            } else if (lowers.charAt(i) == 112) {// p인경우
                cnt_p++;
            }
        }
        // p의 개수와 y의 개수가 다른경우 false
        if (cnt_y != cnt_p) {
            answer = false;
        }
        return answer;
    }
}
