import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //n, k 입력 받기
        int n = Integer.parseInt(st.nextToken()); // 몇번째까지
        int k = Integer.parseInt(st.nextToken()); // 몇번째에 지워졌는지
        primeNumber(n,k);
    }

    static void primeNumber(int n, int k){
        int[] arr = new int[n+1];

        for(int i = 2; i<=n;i++){
            arr[i] = i;
        }

        for(int i=2; i<=n;i++){
            if(arr[i]==0){
                continue;
            }
            for(int j=i;j<=n;j+=i){
                if(arr[j]!=0){
                   arr[j]=0;
                   k--;
                   if(k==0){
                       System.out.println(j);
                       break;
                   }
                }
            }
        }
    }
}
