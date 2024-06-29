import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Stack<Integer> stack = new Stack<>();
		//출력 문자열을 담을 StringBuilder
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		//입력된 수열을 배열로 만들기
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//스택에 넣을 수
		int i = 1;
		//스택과 비교할 배열의 인덱스
		int arrIdx = 0; 

		while(arrIdx < n) {
			if(stack.isEmpty()) { //스택이 비어있으면 push
				stack.push(i);
				sb.append("+" + "\n");
				i++;
			} else if (stack.peek() == arr[arrIdx]) { //스택의 top값이 배열의 arrIdx번째 인덱스 값과 같으면 pop
				stack.pop();
				arrIdx++; //
				sb.append("-" + "\n");
			} else {
				stack.push(i);
				sb.append("+" + "\n");
				i++;
			}
			//스택의 크기가 (비교를 위해)남은 배열보다 커지면
			if(stack.size() > n - arrIdx) {
				sb.setLength(0);//sb 초기화
				sb.append("NO");
				break;
			}
		}		
		System.out.println(sb);
	
	}
}
