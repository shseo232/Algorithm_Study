import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < T ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());	
			int b = Integer.parseInt(st.nextToken());
			int max = Math.max(a, b);
			int min = Math.min(a, b);
			System.out.println(a*b/gcd(max,min));
		}
		

	}

	static int gcd(int max, int min) {
		if (max % min == 0)
			return min;
		else
			return gcd(min, max % min);
	}

}
//유클리드 호제법 사용
