import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		//최대공약수
		int gcd = GCD(max,min);
		System.out.println(gcd);
		
		//최소공배수
		System.out.println(max*min/gcd);
	}
	static int GCD(int max, int min) {
		if(max%min==0) {
			return min;
		}else {
			return GCD(min, max%min);
		}
	}
	//재귀함수로 구현
	//둘의 나머지가 0이면 min이 gcd
	//나머지가 0이 아니면, min 과 나머지의 GCD로 돌림

}
