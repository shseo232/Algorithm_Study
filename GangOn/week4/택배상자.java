import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        //메인컨베이어
        Stack<Integer> stack = new Stack<>();
        //서브컨베이어
        Stack<Integer> subStack = new Stack<>();
        
        for (int i = order.length; i > 0; i--) {
          stack.push(i);
        }

        //비교할 order배열의 index
        int i = 0;
        //실은 택배의 수
        int answer = 0;

        //order배열의 마지막 index까지 이동하며 비교
        while(i < order.length) {
          if(!stack.isEmpty() && stack.peek() == order[i]) { //메인컨베이어에 순서에 맞는 택배가 있으면 싣기
            stack.pop();
            i++; //다음 인덱스로 이동
            answer++;
      
          } else if(!subStack.isEmpty() && subStack.peek() == order[i]) { //서브컨베이어에 순서에 맞는 택배가 있으면 싣기
            subStack.pop();
            i++; //다음 인덱스로 이동
            answer++;
      
          } else { 
            //둘다 맞는 택배가 없으면 메인에서 서브컨베이어로 이동
            if(!stack.isEmpty()) { 
              subStack.push(stack.pop());
            } else { //없으면 더이상 실을 수 있는 택배가 없으므로 종료
              break;
            }
          }
        }
        return answer;
    }
}
