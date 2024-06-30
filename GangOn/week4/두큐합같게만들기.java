import java.util.ArrayDeque;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        ArrayDeque<Integer> q1 = new ArrayDeque<Integer>();
        ArrayDeque<Integer> q2 = new ArrayDeque<Integer>();
        
        long sum1 = 0;
        long sum2 = 0;
        int answer = 0;
        
        
        for(int i : queue1) {
          q1.addLast(i);
          sum1 += i;
        }
        
        for(int i : queue2) {
          q2.addLast(i);
          sum2 += i;
        }
    
        while(sum1 != sum2) {
          if(sum1 > sum2) {
            sum1 -= q1.peekFirst();
            sum2 += q1.peekFirst();
            q2.addLast(q1.pollFirst());
            answer++;
          } else {
            sum1 += q2.peekFirst();
            sum2 -= q2.peekFirst();
            q1.addLast(q2.pollFirst());
            answer++;
          }
          
          if(answer > 3 * queue1.length - 3) {
            answer = -1;
            break;
          }
    
        }
            return answer;
            
            
    }
}
