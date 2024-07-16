import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		System.out.println(fibo(n));
		
	}
	
	static long fibo(int n) {
		if(n <= 1) {
			return n;
		}

		return fibo(n-1) + fibo(n-2);
	}
}
