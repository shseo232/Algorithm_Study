class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(" ")) {
                answer += " ";
                continue;
            }
            String word = "";
            for (int j = 0; j < arr[i].length(); j++) {
                char c = arr[i].charAt(j);
                if (j % 2 == 0) {
                    word += Character.toUpperCase(c);
                } else {
                    word += Character.toLowerCase(c);
                }
            }
            answer += word;
            if (arr.length - 1 != i) {
                answer += " ";
            }
        }
        return answer;
    }
}
