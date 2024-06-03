import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mt = Integer.parseInt(br.readLine()); //첫줄 입력
        String nt = br.readLine();
        
        int answer = 0;
        
        for(int i = 0; i<mt;i++) {
        	answer += nt.charAt(i)-'0'; //여기서 0을 '0'으로 기입안하면 에러 ascii코드 값으로 char->int변형하기에
        }
       
        
        System.out.println(answer);
	}

}
