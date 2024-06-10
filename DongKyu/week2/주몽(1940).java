import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int[] arr = new int[num];
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int target_num = Integer.parseInt(st1.nextToken());
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int index = 0;
        
        for(int i = 0; i<num;i++) {
        	arr[i] = Integer.parseInt(st2.nextToken());
        	
        }
        Arrays.sort(arr);

        int start= 0;
        int end = num-1;
        int cnt = 0;
        
        
        while(start<end) {
        	int sum = arr[start] + arr[end];
        	
        	if(sum <target_num) {
        		start++;
        	}
        	else if(sum == target_num) {
        		cnt++;
        		end--;
        		start++;
        		
        	}
        	else {
        		end--;
        	}
        }
       
        System.out.println(cnt);
	}
}
