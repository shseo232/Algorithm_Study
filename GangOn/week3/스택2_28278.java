import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {

            String commend = br.readLine();

            if(commend.length() == 1) {
                if(Integer.parseInt(commend) == 2) {
                    if(!stack.isEmpty()) {
                        sb.append(stack.pop()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                } else if(Integer.parseInt(commend) == 3) {
                    sb.append(stack.size()).append("\n");
                } else if(Integer.parseInt(commend) == 4) {
                    if(stack.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                } else if(Integer.parseInt(commend) == 5) {
                    if(stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                    }
                }
            } else {
                StringTokenizer st = new StringTokenizer(commend);
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                stack.push(y);
            }
        }
        System.out.print(sb);
    }
}
