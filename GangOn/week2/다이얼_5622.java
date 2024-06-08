import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int result = 0;
		
		String[] arr = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS","TUV", "WXYZ"};
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[j].contains(String.valueOf(s.charAt(i)))) {
					result += (j + 3);
				}
			}
		}
		System.out.println(result);
	}
}
