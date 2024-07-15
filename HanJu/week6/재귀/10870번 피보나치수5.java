import java.util.Scanner;

public class Main {
	public static long fibo(long n) {
		if(n == 0 ) {
			return 0;
		}else if(n==1) {
			return 1;
		}
		else {
			return fibo(n-1)+fibo(n-2);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		
		System.out.println(fibo(N));
		
	}

}
