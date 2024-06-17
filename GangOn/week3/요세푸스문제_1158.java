import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		StringBuilder sb = new StringBuilder();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		sb.append("<");
		for (int i = 1; i <= n; i++) {
			queue.addLast(i);
		}
		
		while(!queue.isEmpty()) {
			for (int j = 1; j < k; j++) {
				queue.addLast(queue.pollFirst());
			}
			if (queue.size() == 1) {
				sb.append(queue.pollFirst() + ">");
			} else {
				sb.append(queue.pollFirst()+", ");
			}
			
		}
		System.out.println(sb);
	}
}
