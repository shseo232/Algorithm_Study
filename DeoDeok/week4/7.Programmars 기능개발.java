import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        int[] remain = new int [progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            remain[i] = (100-progresses[i])/speeds[i];
            //나머지 처리
            if((100-progresses[i])%speeds[i]>0) {remain[i]+=1;}
        }
        int timer=0;
        for (int i = 0; i < remain.length; i++) {
            q.add(remain[i]);
        }
        //gpt의 도움을 받음
        while(!q.isEmpty()) {
            timer = q.poll();
            int count =1;
            //7,3,9
            // 7 보다 작은 수 찾음
            while(!q.isEmpty()&& timer>=q.peek()) {
                q.poll();
                //함꼐 처리됨
                count++;
            }
            answer.add(count);
        }

        System.out.println(Arrays.toString(remain));
        return answer.stream().mapToInt(i->i).toArray();
    }
}
