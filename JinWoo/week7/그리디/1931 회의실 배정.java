import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        //회의 종료 시간 기준으로 정렬 -> 같을 때 시작 시간으로 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int end = -1; // 0일 수도 있기 때문에 -1로 시작
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (end <= arr[i][0]) { //끝나는 시작이 시작시간보다 작거나 같을 때
                end = arr[i][1];  // 그 시작시간에 해당 하는 종료시간이 다시 end가 되버린다 .
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
