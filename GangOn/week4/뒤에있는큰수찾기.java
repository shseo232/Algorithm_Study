import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
		    //answer배열에 -1 담아놓기
        for(int i = 0; i < answer.length; i++) {
          answer[i] = -1;
        }
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        for (int i = 1; i < numbers.length; i++) {
          while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
            answer[stack.pop()] = numbers[i];
          }
          stack.push(i);
          
        }
        return answer;
    }
}
