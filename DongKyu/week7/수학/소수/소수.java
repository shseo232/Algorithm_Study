import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st1.nextToken());

        ArrayList<Integer> list = new ArrayList<>();


        for(int i=a; i<=b;i++){
            int cnt =0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    cnt++;

                }
            }
            if(cnt==1){
                list.add(i);
            }
        }

        int ans = 0;
        for(int k : list){
            ans +=k;
        }

        if(list.size()>0) {
            System.out.println(ans + "\n" + list.get(0));
        }
        else {
            System.out.println(-1);
        }

    }
}
