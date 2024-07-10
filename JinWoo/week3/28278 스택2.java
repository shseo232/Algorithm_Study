import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            if (first == 1) {
                stack.add(Integer.parseInt(st.nextToken()));
            }
            else if (first == 2) {
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");

                    }
                    else {
                        sb.append(stack.pop()).append("\n");

                    }
            }
            else if (first == 3) {
                sb.append(stack.size()).append("\n");

            }
            else if (first == 4) {
                if (stack.isEmpty()) {
                    sb.append(1).append("\n");
                }
                else{
                    sb.append(0).append("\n");
                }
            }
            else if (first == 5){
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else{
                    sb.append(stack.peek()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
