import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String word = st.nextToken().toUpperCase();
		
        String [] arr = new String[word.length()];
        int sum = 0;
        for(int i = 0; i<word.length();i++) {
        	if("A".equals(word.charAt(i)+"")||"B".equals(word.charAt(i)+"")||"C".equals(word.charAt(i)+"")) {
        		sum+=3;
        	}
        	else if("D".equals(word.charAt(i)+"")||"E".equals(word.charAt(i)+"")||"F".equals(word.charAt(i)+"")){
        		sum+=4;
        	}
        	else if("G".equals(word.charAt(i)+"")||"H".equals(word.charAt(i)+"")||"I".equals(word.charAt(i)+"")){
        		sum+=5;
        	}
        	else if("J".equals(word.charAt(i)+"")||"K".equals(word.charAt(i)+"")||"L".equals(word.charAt(i)+"")){
        		sum+=6;
        	}
        	else if("M".equals(word.charAt(i)+"")||"N".equals(word.charAt(i)+"")||"O".equals(word.charAt(i)+"")){
        		sum+=7;
        	}
        	else if("P".equals(word.charAt(i)+"")||"Q".equals(word.charAt(i)+"")||"R".equals(word.charAt(i)+"")||"S".equals(word.charAt(i)+"")){
        		sum+=8;
        	}
        	else if("T".equals(word.charAt(i)+"")||"U".equals(word.charAt(i)+"")||"V".equals(word.charAt(i)+"")){
        		sum+=9;
        	}
        	else if("W".equals(word.charAt(i)+"")||"X".equals(word.charAt(i)+"")||"Y".equals(word.charAt(i)+"")||"Z".equals(word.charAt(i)+"")){
        		sum+=10;
        	}
        }
        System.out.println(sum);
	}
}
