import java.util.Scanner;

public class Main {
	public static long factorial(long n) {
		if(n == 0 ) {
			return 1;
		}
		else {
			return factorial(n-1)*n;
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		
		System.out.println(factorial(N));
		
	}

}
