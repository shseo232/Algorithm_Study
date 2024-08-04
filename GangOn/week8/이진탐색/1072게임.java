import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static long x;
    private static long y;
    private static int target;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        //현재 승률
        target = (int) ((y * 100) / x);

        //최소 게임횟수 0부터 최대 게임횟수 10억 사이에서 이분탐색
        System.out.println(binarySearch(0, 1000000000));

    }

    //이분탐색 메서드
    public static int binarySearch(int left, int right) {

        //현재 승률이 99이상이면 z가 절대 변하지 않음
        if (target >=99) {
            return -1;
        }

        //최소 탐색 시작점이 최대 탐색점보다 작을때 
        while (left < right) {
            //중앙값부터 시작
            int mid = (left + right) / 2;
            //mid만큼 게임을 더 했을때의 승률
            int newTarget = (int) (((y + mid) * 100) / (x + mid));

            //게임을 더 했는데도 현재 승률보다 높지 않으면
            if (newTarget <= target) {
                //최소 탐색 범위 = mid+1
                left = mid + 1;
            } else { //더 높으면 최대 탐색 범위를 mid로
                right = mid;
            }
        }
        
        return left;
    }
}
