import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr= new int[N+1];
        for(int i = 0 ;i <= N;i++)arr[i] = i;
        arr[1] = 0;
        int count =0;
        int answer = 0;


        A: for(int i = 2; i <= N; i++) {
            if(arr[i]!=0){
                answer = arr[i];
                count++;
                if(count == K)break A;
                arr[i] = 0;

                for(int j = i*2 ; j <= N; j += i){
                    if(arr[j] != 0){
                        answer = arr[j];
                        count++;
                        if(count == K)break A;
                        arr[j] = 0;
                    }
                }

            }
        }

        System.out.println(answer);


    }
}
