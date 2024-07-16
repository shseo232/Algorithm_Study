import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			System.out.println(isPalindrome(s)[0] + " " + isPalindrome(s)[1]);
		}

		
	}
	
	public static int[] recursion(String s, int l, int r, int cnt){
		cnt++;
        if(l >= r) { 
        	return new int[] {1, cnt};
        }
        else if(s.charAt(l) != s.charAt(r)) { 
        	return new int[] {0, cnt};
        }
        else return recursion(s, l+1, r-1, cnt);
    }
	
	
    public static int[] isPalindrome(String s){
        return recursion(s, 0, s.length()-1, 0);
    }
}
