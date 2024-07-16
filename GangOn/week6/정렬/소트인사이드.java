import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < s.length(); i++) {
			list.add(Integer.parseInt(s.charAt(i)+""));
		}

		Collections.sort(list, Collections.reverseOrder());

		for (int i : list) {
			sb.append(i);
		}
		System.out.println(sb);
		
	}

}
