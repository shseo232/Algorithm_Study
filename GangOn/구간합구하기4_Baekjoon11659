import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		s = br.readLine();
		st = new StringTokenizer(s);
		int[] arr = new int[n+1];
		//구간합 저장할 배열 생성
		int[] prefixsum = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			//prefixsum[i] = i까지의 구간합
			prefixsum[i] = prefixsum[i-1] + arr[i];
		}
		
		for(int i = 0; i < m; i++) {
			s = br.readLine();
			st = new StringTokenizer(s);
			int start_idx = Integer.parseInt(st.nextToken());
			int end_idx = Integer.parseInt(st.nextToken());
			int sum =  prefixsum[end_idx] - prefixsum[start_idx-1];
			
			System.out.println(sum);
		}
	}
}
