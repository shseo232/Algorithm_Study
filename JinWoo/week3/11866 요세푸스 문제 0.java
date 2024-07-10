import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer>que =new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i<N; i++){
            que.add(i+1);
        }
        sb.append("<");

        int count = 1;
        
        while(que.size()>1){
            if(count == K){
                sb.append(que.poll()).append(", ");
                count = 1;
            }
            else {
                que.add(que.poll());
                count++;
            }
        }
        sb.append(que.poll()).append(">");
        System.out.println(sb);
    }
}
