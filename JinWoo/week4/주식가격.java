import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int [prices.length];
        
        for(int i = 0 ; i<prices.length - 1; i++){
            Stack<Integer>stack = new Stack<>();
            for(int j = i + 1; j<prices.length; j++){
                if(prices[i]<=prices[j]){
                    stack.add(prices[j]);
                }
                else {
                    stack.add(1);
                    break;
                }
            }
            answer[i] = stack.size();
        }
        return answer;
    }
}
