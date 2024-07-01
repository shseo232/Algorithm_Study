import java.util.*;
class Solution {
     public static int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack();
        int num=1;
        for(int i=0; i<order.length;i++){
           while(num<=order[i]){
               stack.push(num);
               num++;
           }
           if(!stack.isEmpty()&&stack.peek()==order[i]){
               stack.pop();
               answer++;
           }
           else{
               break;
           }
        }
        return answer;
    }
}
