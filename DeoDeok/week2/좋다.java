import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
    문제
    N개의 수 중에서 어떤 수가 다른 수 두 개의 합으로 나타낼 수 있다면 그 수를 “좋다(GOOD)”고 한다.
    
    N개의 수가 주어지면 그 중에서 좋은 수의 개수는 몇 개인지 출력하라.
    
    수의 위치가 다르면 값이 같아도 다른 수이다.
    
    입력
    첫째 줄에는 수의 개수 N(1 ≤ N ≤ 2,000), 두 번째 줄에는 i번째 수를 나타내는 Ai가 N개 주어진다. (|Ai| ≤ 1,000,000,000, Ai는 정수)
    
    출력
    좋은 수의 개수를 첫 번째 줄에 출력한다.
    
    예제 입력 1 
    10
    1 2 3 4 5 6 7 8 9 10
    예제 출력 1 
    8
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>(N);
        int good = 0;

        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);

        for (int i = 0; i < N; i++) {
            int start = 0;
            int end = N - 1;
            int num = list.get(i);

            while (start < end) {
                if (start == i) {
                    start++;
                    continue;
                }
                if (end == i) {
                    end--;
                    continue;
                }

                int sum = list.get(start) + list.get(end);
                if (sum == num) {
                    good++;
                    break;
                } else if (sum < num) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        System.out.println(good);
    }
}
