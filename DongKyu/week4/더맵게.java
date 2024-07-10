import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
		for(int i = 0; i< scoville.length;i++) {
			minheap.add(scoville[i]);
		}
		
		int temp1 = 0;
		int temp2 = 0;
		int newb = 0;
		int answer = 0;
        // 모든 음식의 스코빌 지수가 이미 K 이상인 경우
        if (minheap.peek() >= K) {
            return 0;
        }
        
		while(minheap.size() > 1&&minheap.peek() <K) {
			temp1= minheap.poll();//가장 작은요소
			temp2 = minheap.poll();
			
			newb=temp1 + (temp2*2);
			minheap.add(newb);
			answer++;
			
		}
        
        if (minheap.peek() < K) {// 모든 요소를 섞어도 K 이상이 될 수 없는 경우
            return -1; 
        }
        
        return answer;
        
    }
}
