import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = {0,0,3,4,5,6,7,8,9,10};
        String[] Alphabet = { "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };

        String str = br.readLine()  ;
        int result = 0 ;

        for(int i = 0 ; i<str.length(); i++){
            char find = str.charAt(i);
            for(int j = 2 ; j<Alphabet.length; j++ ){
                for(int k = 0 ; k<Alphabet[j].length(); k++){
                    if(find == Alphabet[j].charAt(k)){
                        result += arr[j];
                    }
                }
            }
        }
        System.out.println(result);
    }
}

