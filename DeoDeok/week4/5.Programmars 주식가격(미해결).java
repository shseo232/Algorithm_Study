import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i=0; i<prices.length;i++){
            Stack<Integer>stack = new Stack();
            stack.push(prices[i]);
            for(int j=i+1; j<prices.length;j++){
                if(!stack.isEmpty() && stack.peek()<prices[j]){
                    stack.push(prices[j]);
                }
            }
            answer[i] = stack.size();
        }
        
        
        return answer;
    }
}
