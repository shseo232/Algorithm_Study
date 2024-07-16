import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());

	        int N = Integer.parseInt(st.nextToken()); // 배열 길이
	        int M = Integer.parseInt(st.nextToken()); // 테스트케이스 몇번 돌릴지(for문에 사용)
	        
	        
	        st = new StringTokenizer(br.readLine());
	        int [] arr = new int[N];
	        
	        for(int i = 0 ; i<N; i++){
	            arr[i] = Integer.parseInt(st.nextToken());
	        }
	        int sum = 0;
	        int[]sumnum = new int[arr.length];
	        for(int i = 0; i<arr.length; i++) {
	        	if(i==0) {
	        		sumnum[i]= arr[0];
	        	}
	        	else {
	        		sumnum[i] = arr[i] + sumnum[i-1];
	        	}
	        }
	        
	        for(int i = 0 ; i<M; i++){
	            st = new StringTokenizer(br.readLine());
	            int a = Integer.parseInt(st.nextToken());//1
	            int b = Integer.parseInt(st.nextToken());//3
	            if(a==1) {
	            	sum = sumnum[b-1]-0;
	            }
	            else if(a==b) {
	            	sum = arr[a-1];
	            }
	            else {
	            	sum = sumnum[b-1] - sumnum[a-2];
	            }
		        System.out.println(sum);
	        }
	    }
}
