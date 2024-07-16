import java.util.Scanner;

public class Main {

    public static int[] recursion(String s, int l, int r,int count) {
    	count++;
        if (l >= r) {
        	int[] temp = {1,count};
            return temp;
        } else if (s.charAt(l) != s.charAt(r)) {
        	int[] temp = {0,count};
            return temp;
        } else {
            return recursion(s, l + 1, r - 1, count);
        }
    }

    public static int[] isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1, 0);
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	for(int i = 0 ; i < N ; i++) {
    		String s  = sc.next();
    		int[] temp = isPalindrome(s);
    		System.out.println(temp[0]+" "+temp[1]);
    	}
    	
    
    }
}
