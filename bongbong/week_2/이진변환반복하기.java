class Solution {
    public int[] solution(String s) {
        int cnt_change = 0; // 이진 변환 횟수
        int cnt_zero = 0; // 제거된 0의 총 개수
        int[] answer = {cnt_change, cnt_zero};

        while (!s.equals("1")) {
            int lengthBefore = s.length(); // 변환 전 길이

            // 모든 0을 제거하고 남은 1의 개수로 s를 변경
            s = s.replaceAll("0", "");
            int lengthAfter = s.length(); // 0을 제거한 후의 길이
            cnt_zero += (lengthBefore - lengthAfter); // 제거된 0의 개수를 더함

            // 남은 문자열의 길이를 2진수로 변환
            s = Integer.toString(lengthAfter,2);

            cnt_change++; // 이진 변환 횟수 증가
        }

        return answer;
    }
    
}
