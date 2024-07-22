import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long max = Math.max(a, b);
		long min = Math.min(a, b);
		System.out.println(a * b / gcd(max, min));

	}

	static long gcd(long max, long min) {
		if (max % min == 0)
			return min;
		else
			return gcd(min, max % min);
	}

}
//유클리드 호제법 사용
