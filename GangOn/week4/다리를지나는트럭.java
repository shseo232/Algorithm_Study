import java.util.ArrayDeque;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        //대기 트럭 큐
        ArrayDeque<Integer> queue_wait = new ArrayDeque<Integer>();
        //다리를 건너는 트럭 큐
        ArrayDeque<Integer> queue_run = new ArrayDeque<Integer>();

        //다리를 건너는 트럭 큐 무게
        int queue_weights = 0;
		
        //대기 트럭 큐에 트럭 추가
        for(int i : truck_weights) {
            queue_wait.addLast(i);
        }
        
        //다리를 건너는 트럭 큐 무게
        for(int i = 0; i < bridge_length; i++) {
            queue_run.addLast(0);
        }
        
        //경과 시간
        int count = 0;
        
        //대기 트럭 큐가 비어있을때까지
        while(!queue_wait.isEmpty()) {
        
            //다리를 건너는 트럭 큐에서 하나 뽑고 무게에서 뺌
            queue_weights -= queue_run.pollFirst();
            //다리에 트럭을 추가할 수 있으면 추가
            if(!queue_wait.isEmpty() && queue_weights + queue_wait.peekFirst() <= weight) {
                queue_weights += queue_wait.peekFirst();
                queue_run.addLast(queue_wait.pollFirst());
            } else { //아니면 0 추가
                queue_run.addLast(0);
            }
            count++;
        }
        //마지막으로 다리에 올라온 트럭이 건널때까지 기다려야 하기 때문에 bridge_length 더함
        return count + bridge_length;
    }
}
