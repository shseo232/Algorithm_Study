import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mt = Integer.parseInt(br.readLine()); //과목개수
        int [] arr = new int[mt];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i<mt;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        double sum = 0;
        for(int i = 0; i<arr.length;i++) {
        	sum +=arr[i];
        }
        sum = ((sum/arr[arr.length-1])/mt)*100;
        
        System.out.println(sum);
	}

}
