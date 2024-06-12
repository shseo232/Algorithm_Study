package week_2.자연수뒤집어배열로만들기;

class Solution {
    public int[] solution(long n) {
        String num = n+"";
        int[] answer = new int[num.length()];
        int idx = 0;
        for(int i = num.length()-1 ; i>=0;i--){
            answer[idx] = num.charAt(i)-'0';
            idx++;
        }
        return answer;
    }
}
