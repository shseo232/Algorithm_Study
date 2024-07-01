import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        int temp = 1;
        
        for (int i = 0; i < order.length; i++) {
            int recent = order[i];
            
            while (temp <= recent) {
                st.push(temp);
                temp++;
            }
            
            if (!st.isEmpty() && st.peek() == recent) {
                st.pop();
                answer++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}
