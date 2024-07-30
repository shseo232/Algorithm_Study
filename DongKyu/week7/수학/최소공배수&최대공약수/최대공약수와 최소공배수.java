import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		long ans = 0;//최소공배수
		long an = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		if (a < b) {			
			for (long j = a; j > 0; j--) {
				if (a % j == 0 && b % j == 0) {
					an = j;
					ans = (a / j) * (b / j) * j;
					sb.append(j).append("\n").append(ans);
					ans = 0;
					break;
				}
			}
		} else {
			for (long j = b; j > 0; j--) {
				if (a % j == 0 && b % j == 0) {
					an = j;
					ans = (a / j) * (b / j) * j;
					sb.append(j).append("\n").append(ans);
					ans = 0;
					break;
				}
			}
		}

		System.out.println(sb.toString());

	}
}
