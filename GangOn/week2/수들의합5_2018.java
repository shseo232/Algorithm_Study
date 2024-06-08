import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int startIdx = 0;
		int endIdx = 0;
		int sum = 0;
		int count = 0;
		
		while(endIdx <= n) {
			if (sum < n) {
				endIdx++;
				sum += endIdx;
			} else if (sum > n) {
				sum -= startIdx;
				startIdx++;
			} else {
				count++;
				endIdx++;
				sum += endIdx;
			}
		}
		System.out.println(count);
		
	}
}
