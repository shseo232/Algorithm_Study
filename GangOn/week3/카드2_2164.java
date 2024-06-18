import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			queue.addLast(i);
		}
		
		while(queue.size() > 1) {
			queue.pollFirst();
			queue.addLast(queue.pollFirst());
		}
		System.out.println(queue.pollFirst());
	}
}
