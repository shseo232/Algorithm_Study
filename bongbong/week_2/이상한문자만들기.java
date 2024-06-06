package week_2.이상한문자만들기;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 각 단어는 하나 이상의 공백문자가 있음
        // 각 단어의 짝수번째는 대문자로(0은짝수)
        // 각 단어의 홀수번째는 소문자로

        String[] split = s.split(" ",-1);

        for (String str : split) {
            for (int i = 0; i < str.length(); i++) {

                String temp = "";
                if (i % 2 == 0 && Character.isLowerCase(str.charAt(i))) { // 짝수번째 인덱스가 소문자인경우
                    temp += String.valueOf(Character.toUpperCase(str.charAt(i)));

                } else if (i % 2 != 0 && Character.isUpperCase(str.charAt(i))) { // 홀수번째 인덱스가 대문자인경우
                    temp += String.valueOf(Character.toLowerCase(str.charAt(i)));
                } else {
                    temp += String.valueOf(str.charAt(i));
                }

                answer += temp;

            }
            answer += " "; // 공백으로 구분

        }
        return answer.substring(0,answer.length()-1); // 맨 뒤에 들어가는 공백 제거
    }
}
