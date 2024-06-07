package week_2.삼진법뒤집기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        // 3진법으로
        String tree_num = Integer.toString(n,3);
        // 뒤집기
        StringBuilder sb = new StringBuilder(tree_num);
        String reverse = sb.reverse().toString();
        // 10진법으로
        answer = Integer.parseInt(reverse, 3);

        return answer;
    }
}
