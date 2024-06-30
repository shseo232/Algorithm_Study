import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack =new Stack<Integer>();
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num==0&&i>=1) {
            	stack.pop();
            }
            else {
            	stack.push(num);
            }
        }
        for(int key : stack) {
        	sum+=key;
        }

        System.out.println(sum);
    }
}
