import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack <Integer> stack  = new Stack<>();
        int result = 0 ;

        for(int i = 0 ; i<N; i++){
            int a = Integer.parseInt(br.readLine());
            if(a != 0){
                result += stack.push(a);;
            }
            else {
                result -= stack.pop();
            }
        }
        System.out.println(result);
    }
}
