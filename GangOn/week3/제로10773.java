import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < k; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n != 0) {
				stack.push(n);
			} else {
				stack.pop();
			}
		}
		
		int sum = stack.stream().mapToInt(i->i).sum();
		System.out.println(sum);
		

	}

}
