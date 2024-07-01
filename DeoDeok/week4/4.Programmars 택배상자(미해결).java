import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack();        
        int num=0;
        for(int i=1; i<=order.length;i++){
            stack.push(i);
            while(!stack.isEmpty() && stack.peek() == order[num]){
                stack.pop();
                num++;
                answer++;
                break;
            }
        }
        return answer;
    }
}
