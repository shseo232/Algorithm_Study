class Solution {
    public String solution(String s, int n) {
        String answer = "";

        char[] c = s.toCharArray();

        for (char i : c) {

            if (i != 32) {
                if (i >= 97 && i <= 122) { //소문자이면
                    i +=n;
                    if (i > 122) {
                        i -= 26;
                    }
                } else if (i >= 65 && i <= 90) { // 대문자이면
                    i += n;
                    if (i > 90) {
                        i -= 26;
                    }
                }

            }
            answer += i;
        }


        return answer;
    }
}
