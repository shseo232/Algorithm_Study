package CodingTest;

import java.util.Arrays;
import java.util.Stack;

public class Programmars154539 {
    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = -1;
        }
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
            boolean flag = false;
            for (int j=i+1; j<numbers.length; j++) {
                flag = true;
                if(stack.peek()< numbers[j]) {
                    stack.pop();
                    stack.push(numbers[j]);
                    break;
                }
            }
            if(!flag) {
                break;
            }
            answer[i] = stack.peek();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 3, 5};
        System.out.println(Arrays.toString(solution(numbers)));
    }
}
