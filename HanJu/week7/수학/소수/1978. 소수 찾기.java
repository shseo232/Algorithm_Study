import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr= new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        for(int i = 0; i < N; i++){
            if(check(arr[i])){count++;}
        }
        System.out.println(count);

    }
    static boolean check(int num){
        if(num == 1){return false;}
        for(int i = 2 ; i< num ; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
