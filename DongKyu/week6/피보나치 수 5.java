import java.util.*;
import java.io.*;
class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		ArrayList<Long>list = new ArrayList<>();
		list.add((long) 0);
		list.add((long) 1);
		for (int i = 2; i <= a; i++) {
			list.add(list.get(i-1)+list.get(i-2));
		}
		System.out.println(list.get(a));
	}

}
