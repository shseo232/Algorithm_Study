import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long min = Math.min(a, b);
		long max = Math.max(a, b);

		long result = gcd(max, min);
//		for (int i = 0; i < result; i++) {
//			System.out.print("1");
//		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < result; i++) {
			sb.append("1");
		}
		System.out.println(sb);

	}

	static long gcd(long max, long min) {
		if (max % min == 0)
			return min;
		else
			return gcd(min, max % min);
	}

}
//패턴찾기맨
//두 입력값의 최대공약수의 개수만큼 1을 출력하면 실제 값의 최대공약수임
//그냥 sysout으로 하면 시간초과나서 StringBuilder를 썼다
