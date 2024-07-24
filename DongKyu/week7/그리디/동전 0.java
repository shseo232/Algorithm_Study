import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken()); // 동전 갯수
		int b = Integer.parseInt(st.nextToken()); // 타겟 금액
		Integer [] arr = new Integer[a];
		
		for (int i = 0; i < a; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		int ans =0;
		for(int i=0;i<arr.length;i++) {
			if(b>=arr[i]) {
				ans +=b/arr[i];
				b = b%arr[i];
			}
		}
		
		System.out.println(ans);
	}
}
