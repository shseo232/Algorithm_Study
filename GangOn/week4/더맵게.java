import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
      
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

      for(int i : scoville) {
          pq.add(i);
      }
      
      int answer = 0;
      while(pq.peek() < K) {
        
        if(pq.size() <= 1) {
            answer = -1;
            break;
        }
        
        int a = pq.poll();
        int b = pq.poll();
        int mix = a + (b * 2);
        pq.add(mix);
        answer++;
      }
      return answer;
    }
}
