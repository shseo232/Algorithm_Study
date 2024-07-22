import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        //[시작시간, 종료시간]을 담을 2차원 배열 생성
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        //종료시간을 기준으로 오름차순 정렬, 종료시간이 같으면 시작시간을 기준으로 오름차순 정렬
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int endTime = 0;
        int count = 0;
        //시작시간이 종료시간과 같거나 이후면
        for (int i = 0; i < n; i++) {
            if(arr[i][0] >= endTime) {
                count++;
                endTime = arr[i][1]; //종료시간 재설정

            }
        }

        System.out.println(count);
    }
}
