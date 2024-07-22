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
        int a = Integer.parseInt(st.nextToken());
        int[] arr = new int[a];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        int ans = 0;
        for(int i=0; i<arr.length;i++){
            int cnt =0;
            for(int j=2;j<=arr[i];j++){
                if(arr[i]%j==0){
                    cnt++;
                }
            }
            if(cnt==1){
                ans++;
            }
        }

        System.out.println(ans);


    }
}
