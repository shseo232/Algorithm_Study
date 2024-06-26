import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int startIdx = 0;
		int endIdx = n-1;
		int count = 0;
		
		while(startIdx < endIdx) {
			int sum = arr[startIdx] + arr[endIdx];
			if(sum < m) {
				startIdx++;
			} else if (sum > m) {
				endIdx--;
			} else {
				count++;
				startIdx++;
				endIdx--;
			}
		}
		System.out.println(count);
		
	}
}
