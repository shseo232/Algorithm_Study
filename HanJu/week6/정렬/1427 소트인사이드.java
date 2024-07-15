import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	String s = sc.next();

	String[] arr1= s.split("");
	Integer[] arr2 = new Integer[s.length()];
	for(int i = 0 ; i < s.length(); i++) {
		arr2[i] = Integer.parseInt(arr1[i]);
	}
	Arrays.sort(arr2, Collections.reverseOrder());
	
	for(int i : arr2) {
		System.out.print(i);
	}
	
}
}
