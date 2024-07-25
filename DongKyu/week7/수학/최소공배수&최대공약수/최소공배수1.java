import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
        StringBuilder sb =new StringBuilder();
    	
    	for(int i =0; i< n; i++) {
    		int ans = 0;
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		if(a<b) {
    			for(int j=a;j>0;j--) {
    				if(a%j==0&&b%j==0) {
    					ans = (a/j) * (b/j) * j;
    					sb.append(ans).append("\n");
    					ans =0;
    					break;
    				}
    			}
    		}else {
    			for(int j=b;j>0;j--) {
    				if(a%j==0&&b%j==0) {
    					ans = (a/j) * (b/j) * j;
    					sb.append(ans).append("\n");
    					ans =0;
    					break;
    				}
    			}
    		}
    	}
        
    	System.out.println(sb.toString());

        
    }
}
