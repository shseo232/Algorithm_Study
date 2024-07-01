import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int num = 1;
        boolean check = true;

        for (int i = 0; i < n; i++) {
            if (num <= arr[i]) {
                while (num <= arr[i]) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                if (!stack.isEmpty() && stack.peek() == arr[i]) {
                    stack.pop();
                    sb.append("-\n");
                } else {
                    check = false;
                    break;
                }
            }
        }
        if (check) {
            System.out.print(sb);
        } else {
            System.out.print("NO");
        }
    }
}
