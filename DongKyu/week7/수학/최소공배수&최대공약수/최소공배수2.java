import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		long ans = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		if (a < b) {
			for (long j = a; j > 0; j--) {
				if (a % j == 0 && b % j == 0) {
					ans = (a / j) * (b / j) * j;
					sb.append(ans).append("\n");
					ans = 0;
					break;
				}
			}
		} else {
			for (long j = b; j > 0; j--) {
				if (a % j == 0 && b % j == 0) {
					ans = (a / j) * (b / j) * j;
					sb.append(ans).append("\n");
					ans = 0;
					break;
				}
			}
		}

		System.out.println(sb.toString());

	}
}
