import java.util.ArrayDeque;

class Solution {
    public int[] solution(int[] prices) {

        int[] answer = new int[prices.length];
        ArrayDeque <Integer> queue = new ArrayDeque<>();

        for(int i = 0; i < prices.length; i++) {
            queue = new ArrayDeque<>();
            queue.addLast(prices[i]);
            for(int j = i+1; j < prices.length; j++) {
                if(queue.peekFirst() <= prices[j]) {
                    queue.addLast(prices[j]);
                    if(j == prices.length-1) {
                        answer[i] = queue.size()-1;
                    }
                } else {
                    answer[i] = queue.size();
                    break;
                }
            }
        }
        return answer;
    }
}
