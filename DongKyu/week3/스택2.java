import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();//시간초과로 인해 각 줄마다 sysout이 아닌한번에 모았다가 출력
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());
            
            if (a == 1) {
                stack.push(Integer.parseInt(st1.nextToken()));
            } else if (a == 2) {
                if (!stack.isEmpty()) {
                    sb.append(stack.pop()).append("\n");
                } else {
                    sb.append("-1").append("\n");
                }
            } else if (a == 3) {
                sb.append(stack.size()).append("\n");
            } else if (a == 4) {
                if (!stack.isEmpty()) {
                    sb.append("0").append("\n");
                } else {
                    sb.append("1").append("\n");
                }
            } else if (a == 5) {
                if (!stack.isEmpty()) {
                    sb.append(stack.peek()).append("\n");
                } else {
                    sb.append("-1").append("\n");
                }
            }
        }
        System.out.print(sb.toString());
    }
}
