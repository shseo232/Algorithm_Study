import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0 ; i<N; i++){
            int tmp = 0;
            for(int j = i+1; j<=N; j++){
                tmp += j ;
                if(tmp>N){
                    break;
                }
                else if(tmp == N){
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
