class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        String answer = "";
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            if (" ".equals(arr[i])) {
                answer += " ";
                idx = 0;
            } else {
                if (idx % 2 != 0) {
                    answer += arr[i].toLowerCase();
                } else {
                    answer += arr[i].toUpperCase();
                }
                idx++;
            }
        }

        return answer;
    }
}
