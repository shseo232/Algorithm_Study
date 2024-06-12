import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 *  1
	1
 */
public class baekjun11720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		String Num = br.readLine();
		int sum=0;
		for(int i=0; i<Num.length();i++) {
			sum += Integer.parseInt(Num.substring(i,i+1));	
			}
		System.out.println(sum);
	}
	/*
	 * public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		String Num = br.readLine();
		int sum=0;
		for(int i=0; i<Num.length();i++) {
			sum += Integer.parseInt(String.valueOf(Num.charAt(i)));
		}
		System.out.println(sum);
	}

}
	 */

}
