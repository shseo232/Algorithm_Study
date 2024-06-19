import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            if (s == 1) {
                s = Integer.parseInt(st.nextToken());
                stack.push(s);
            }
            else if (s == 2) {
                if(!stack.isEmpty()){
                    sb.append(stack.pop()+"\n");
                }
                else{
                    sb.append(-1+"\n");
                }
            }
            else if (s == 3) {
                sb.append(stack.size()+"\n");
            }
            else if (s == 4) {
                if(stack.isEmpty()){
                    sb.append(1+"\n");
                }
                else{
                    sb.append(0+"\n");
                }
            }
            else if (s == 5) {
                if(!stack.isEmpty()){
                    s = stack.pop();
                    sb.append(s+"\n");
                    stack.push(s);
                }
                else{
                    sb.append(-1+"\n");
                }
            }
        }
        System.out.println(sb);
    }
}
