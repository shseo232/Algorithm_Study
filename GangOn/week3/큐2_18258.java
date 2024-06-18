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
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String commend = st.nextToken();
			
			if(commend.equals("push")) {
				queue.addLast(Integer.parseInt(st.nextToken()));
			} else if(commend.equals("pop")) {
				if(queue.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(queue.pollFirst() + "\n");
				}
			} else if(commend.equals("size")) {
				sb.append(queue.size() + "\n");
			} else if(commend.equals("empty")) {
				if(queue.isEmpty()) {
					sb.append(1 + "\n");
				} else {
					sb.append(0 + "\n");
				}
			} else if(commend.equals("front")) {
				if(queue.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(queue.peekFirst() + "\n");
				}
			} else if(commend.equals("back")) {
				if(queue.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(queue.peekLast() + "\n");
				}
			}
		}
		System.out.println(sb);
	}
}
