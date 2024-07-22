import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String input = br.readLine();
		String [] arr = input.split("\\-");
		
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			int sum =0;
			String[]arr1 = arr[i].split("\\+");
			for(String key : arr1) {
				sum += Integer.parseInt(key);
			}
			list.add(sum);
		}
		int ans = list.get(0);
		for(int i=1; i<list.size();i++) {
			ans -=list.get(i);
		}
		
		System.out.println(ans);

		
	}
}
