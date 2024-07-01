import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
               Stack<Integer> st = new Stack<>();
        int []answer = new int[numbers.length];
        
        st.push(0);
        for(int i = 1; i<numbers.length;i++) {
        	while(!st.isEmpty()&&numbers[st.peek()]<numbers[i]) { // 스택이 있는지를 먼저 확인안하면 EmptyStackException발생
        		answer[st.pop()]=numbers[i];
        	}
        	st.push(i);
        }
        while(!st.isEmpty()) {
        	answer[st.pop()]=-1;
        }
         return answer;
    }
       
    }
