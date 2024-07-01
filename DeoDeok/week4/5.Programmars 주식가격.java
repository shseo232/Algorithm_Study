import java.util.*;
class Solution {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < prices.length; i++) {
            int count = 0;
            stack.push(prices[i]);
            for (int j = i + 1; j < prices.length; j++) {
                count++;//넘어가는 순간 1초
                if(stack.peek() > prices[j]) {
                    break;
                }
            }
            answer[i] = count;
        }

        return answer;
    }
}
