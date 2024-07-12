import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	String n = sc.nextLine();
	String num = sc.nextLine();
	String[] arr= num.split(" ");
	int N = Integer.parseInt(n);
	int[] arr2 = new int[N];
	for(int i = 0 ; i<N;i++) {
		arr2[i] = Integer.parseInt(arr[i]);
	}
	Arrays.sort(arr2);
	int sum = 0;
	for(int i = 0 ; i < N ; i++) {
		sum += arr2[i];
		for(int j = 0 ; j < i ; j++) {
			sum+=arr2[j];
		}

	}
	System.out.println(sum);
	
	
    }
}
