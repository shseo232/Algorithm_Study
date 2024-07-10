import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        Queue<Integer> que1 = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();
        
        long total1 = 0;
        long total2 = 0;
        
        for (int i = 0; i < queue1.length; i++) {
            que1.add(queue1[i]);
            total1 += queue1[i];
        }
        
        for (int i = 0; i < queue2.length; i++) {
            que2.add(queue2[i]);
            total2 += queue2[i];
        }
        
        int maxTurn = (queue1.length + queue2.length) * 2;
        
        while (total1 != total2 && answer <= maxTurn) {
            if (total1 > total2) {
                int num = que1.poll();
                total1 -= num;
                total2 += num;
                que2.add(num);
            } else {
                int num = que2.poll();
                total2 -= num;
                total1 += num;
                que1.add(num);
            }
            answer++;
        }
        
        if (total1 != total2) {
            return -1;
        }
        
        return answer;
    }
}
