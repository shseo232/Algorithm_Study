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

        int n = Integer.parseInt(st.nextToken()); // 갯수
        int m = Integer.parseInt(st.nextToken()); // m번째

        int [] arr = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0; i< n;i++){
            arr[i]= Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(arr);

        System.out.println(arr[m-1]);

    }
}
