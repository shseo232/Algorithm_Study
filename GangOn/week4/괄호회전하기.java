import java.util.ArrayDeque;
import java.util.Stack;

class Solution {
    public int solution(String s) {
		ArrayDeque<String> queue = new ArrayDeque<String>();
		
		//큐에 문자열담기
		for(int i = 0; i < s.length(); i++) {
			queue.addLast(s.charAt(i) + "");
		}

		int answer = 0;

		//큐를 왼쪽으로 한칸씩 회전
		for(int i = 0 ; i < s.length(); i++) {
			
			boolean flag = true;
			Stack<String> stack = new Stack<>();

			//큐를 한바퀴 돌리면서 큐의 첫 값이 여는 괄호면 스택에 push, 닫는 괄호면(가장 최근 여는괄호와 같은 종류인 경우) pop
			for(int j = 0 ; j < s.length(); j++) {
				if(queue.peekFirst().equals("(") || queue.peekFirst().equals("{") || queue.peekFirst().equals("[")) {
					stack.push(queue.peekFirst());

				} else {
					if (stack.isEmpty()) { //여는괄호수 < 닫는괄호수 일 경우 올바른 괄호 X
						flag = false;
					} else if(queue.peekFirst().equals(")") && stack.peek().equals("(")) {
						stack.pop();

					} else if(queue.peekFirst().equals("}") && stack.peek().equals("{")) {
						stack.pop();

					} else if(queue.peekFirst().equals("]") && stack.peek().equals("[")) {
						stack.pop();

					}
				}
				//큐 돌리기
				queue.addLast(queue.pollFirst());
			}

			if(stack.isEmpty() && flag) {
				answer++;
			}
			
			//큐 돌리기
			queue.addLast(queue.pollFirst());
			
		}
        return answer;
    }
}
