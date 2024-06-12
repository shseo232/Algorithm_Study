class Solution {
    public int solution(String s) {
        int answer = 0;

        String[] numbers_word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numbers_word.length; i++) {
            s = s.replaceAll(numbers_word[i], i+"");
        }

        answer = Integer.parseInt(s);
        return answer;
    }
}
