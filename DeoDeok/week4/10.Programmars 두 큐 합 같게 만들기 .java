import java.util.*;
 /*
        11 5   1
        1 5    1 1
        5      1 1 1
        0     1 1 1 5
        1     1 1 5
        1 1   1 5
        111   5
        1115  0
         */
class Solution {
    public int solution(int[] queue1, int[] queue2) {
           int answer = -1;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        long q1sum = 0;
        long q2sum = 0;

        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            q2.add(queue2[i]);
            q1sum += queue1[i];
            q2sum += queue2[i];
        }

        long totalSum = q1sum + q2sum;
    
        if (totalSum % 2 != 0) {
            return -1;
        }

        long num = totalSum / 2;
        int count = 0;
        for(int i=0; i<(queue1.length+queue2.length)*2; i++) {
            if(q1sum < num){
                int a = q2.poll();
                q1.add(a);
                q1sum+=a;
                q2sum-=a;
                count++;
            } else if (q1sum > num) {
                int a = q1.poll();
                q2.add(a);
                q1sum-=a;
                q2sum+=a;
                count++;
            }
            else{
                answer = count;
                break;
            }
        }

        return answer;
    }
}
