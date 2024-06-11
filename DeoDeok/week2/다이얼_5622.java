import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();
	int sum = 0;
    str = str.replaceAll("[A-C]", "3 ")
    .replaceAll("[D-F]", "4 ")
    .replaceAll("[G-I]", "5 ")
    .replaceAll("[J-L]","6 ")
    .replaceAll("[M-O]","7 ")
    .replaceAll("[P-S]","8 ")
    .replaceAll("[T-V]","9 ")
	.replaceAll("[W-Z]","10 ");
	StringTokenizer st = new StringTokenizer(str);
	while(st.hasMoreTokens()) {
		sum += Integer.parseInt(st.nextToken());
	}
	System.out.println(sum);
	}
	
}
