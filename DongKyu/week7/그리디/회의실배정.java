import java.util.*;
import java.io.*;

public class Main { //1931

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mt = Integer.parseInt(br.readLine());
		int[][] arr = new int[mt][2];
		
		for( int i=0; i<arr.length;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
	       Arrays.sort(arr, new Comparator<int[]>() {
	              @Override
	              public int compare(int[] o1, int[] o2) {
	                  if (o1[1] == o2[1]) {
	                      return o1[0] - o2[0];
	                  }
	                  else {
	                	  return o1[1] - o2[1];
	                  }
	                      
	              }
	            });

		
		int cnt = 1;
		
		int temp = arr[0][1];
		for(int i =1; i<arr.length;i++) {			
			if(arr[i][0]>=temp) {
				temp = arr[i][1];
				cnt++;
				continue;
				
			}
		}
		System.out.println(cnt);
	
		
		
		
	}
}
