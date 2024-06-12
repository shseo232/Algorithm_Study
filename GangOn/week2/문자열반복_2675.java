import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			String s  = st.nextToken();
			StringBuilder sb = new StringBuilder();
      
      //s의 각 자리를 r번 반복해서 sb에 추가
			for(int j = 0; j < s.length(); j++) {
				String s1 =String.valueOf(s.charAt(j)).repeat(r);
				sb.append(s1);
			}
			System.out.println(sb.toString());
		}
		
	}
}
