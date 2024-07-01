import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<Integer>(); //소요일수를 담는 큐 제작
		for(int i = 0; i<progresses.length;i++) {
			int n = (int)Math.ceil((100-progresses[i])/(double)speeds[i]);
			
			q.offer(n);
		}

		List<Integer> list = new ArrayList<>();

		while (!q.isEmpty()) {

			int k = q.poll();
			int cnt = 1;
			while (!q.isEmpty() && k >= q.peek()) {

				q.poll();
				cnt++;

			}
			list.add(cnt);
		}
		int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
