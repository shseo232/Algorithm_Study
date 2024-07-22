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
        int N = Integer.parseInt(st.nextToken());

        int MAX = N+1;
        int[] temp = new int[MAX+1];


        for(int i = 0; i < MAX+1; i++) {
            temp[i] = i;
        }


        List<Integer> prime = new ArrayList<>();
        for(int i = 2; i< MAX; i++){
            if(temp[i] != 0){
                prime.add(temp[i]);
                if(temp[i]>=M && temp[i]<=N &&temp[i]!=1){
                    System.out.println(temp[i]);
                }
                temp[i] = 0;

                for(int j = i*2; j < MAX; j+=i){
                    temp[j] = 0;
                }

            }
        }

//        for(int i =M ; i<= N ; i++){
//
//            if(prime.contains(i) && i!=1){
//                System.out.println(i);
//            }
//        }

    }


}
