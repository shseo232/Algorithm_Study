import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] arr = str.split("-");
        ArrayList<Integer> list = new ArrayList<>();

        for (String s : arr) {
            int sum = 0;
            String[] plus = s.split("\\+");
            for (String s1 : plus) {
                sum += Integer.parseInt(s1);
            }
            list.add(sum);
        }
      
        long result = list.get(0); // 첫 기준점은 더 한 갓을 가져와야한다.

        for (int i = 1; i < list.size(); i++) {
            result -= list.get(i);
        }
        System.out.print(result);
    }
}
