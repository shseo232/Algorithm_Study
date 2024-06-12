import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int [] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int result = 0;

        for(int i = 0 ; i<N-1; i++){
            int tmp = M;
            tmp -= arr[i];
            for(int j = i+1; j<N; j++){
                if(tmp - arr[j] == 0){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
