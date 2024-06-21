import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> q = new ArrayDeque<>();
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String w = st.nextToken();
            if("push".equals(w)){
                q.add(Integer.parseInt(st.nextToken()));
            }
            else if("pop".equals(w)){
                sb.append(q.size() > 0 ? q.poll() + "\n" : -1 + "\n");
            }
            else if("size".equals(w)){
                sb.append(q.size()+"\n");
            }
            else if("empty".equals(w)){
                sb.append(q.size() > 0 ?0+"\n":1+"\n");
            }
            else if("front".equals(w)){
                sb.append(q.size() > 0?q.getFirst()+"\n":-1+"\n");
            }
            else if("back".equals(w)){
                sb.append(q.size() > 0?q.getLast()+"\n":-1+"\n");
            }
        }
        System.out.println(sb);
    }
}
