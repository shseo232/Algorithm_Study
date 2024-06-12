class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;  

        for (int i = 0; i < s.length(); i++) {
            String a = s.substring(i, i + 1);
            if (a.equals(" ")) {
                answer += " ";
                count = 0;  
            } else {
                if (count % 2 == 0) {
                    answer += a.toUpperCase();
                } else {
                    answer += a.toLowerCase();
                }
                count++;  
            }
        }

        return answer;
    }
}
