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
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        List<Integer>arr = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            if(check_prime(i)) arr.add(i);
        }
        int sum = 0;
        int min =0;
        int[] arr2 = new int[arr.size()];
        if(arr.size()==0){
            System.out.println(-1);
        }else{
            for (int i = 0; i < arr.size(); i++) {
                arr2[i] = arr.get(i);
            }
            Arrays.sort(arr2);
            for(int i : arr2) sum +=i;
            min = arr2[0];

            System.out.println(sum);
            System.out.println(min);
        }


    }
    static boolean check_prime(int num){
        if(num == 1){return false;}
        for(int i = 2 ; i< num ; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
