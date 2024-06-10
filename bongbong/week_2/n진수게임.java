package week_2.n진수게임;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String num = "";
        int idx = p-1;

        //한자리씩 끊어 말해야 함
        //t는 바퀴수 = 숫자나열은 p번째 부터 m*t개를 해야 함
        //
        for (int i = 0; i < m * t; i++) {
            num += Integer.toString(i, n);
        }
        // answer의 길이가 t일때까지만 반복
        while (answer.length()!=t) {
            if (Character.isLowerCase(num.charAt(idx))) {
                answer += Character.toUpperCase(num.charAt(idx));
            }else {
                answer += num.charAt(idx);
            }
                idx+=m; // 사람인원수+내가 지금 맣란 숫자 inedx = 한바퀴 후 내가 말할 숫자의 index
        }

        return answer;
    }
    
}
