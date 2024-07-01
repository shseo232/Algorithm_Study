import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer>que =new LinkedList<>();

        int N = Integer.parseInt(br.readLine());


        for(int i = 0 ; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            if(word.equals("push")){
                que.add(Integer.parseInt(st.nextToken()));
            }
            else if(word.equals("pop")){
                if(que.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(que.poll()).append("\n");
                }
            }
            else if(word.equals("size")){
                sb.append(que.size()).append("\n");
            }
            else if(word.equals("empty")){
                if(que.isEmpty()){
                    sb.append(1).append("\n");
                }
                else {
                    sb.append(0).append("\n");
                }
            }
            else if(word.equals("front")){
                if(que.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(que.peek()).append("\n");
                }
            }
            else if(word.equals("back")){
                if(que.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else {
                    sb.append(que.get(que.size()-1)).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
