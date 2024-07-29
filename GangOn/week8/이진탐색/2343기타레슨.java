import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static int[] arr;
    private static int n;
    private static int m;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];

        //하나의 블루레이에 들어갈 수 있는 강의 길이의 최소값 = 가장 긴 강의의 길이
        int min = 0;
        //하나의 블루레이에 들어갈 수 있는 강의 길이의 최대값 = 모든 강의 길이의 합
        int max = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max += arr[i];
            min = Math.max(min, arr[i]);
        }


        System.out.println(binarySearch(min, max));

    }

    //각 블루레이의 길이가 length일때 몇개의 블루레이로 모든 강의를 담을 수 있는지 세는 메서드
    public static int bluRayCount(int length) {
        int sum = 0;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum > length) {
                sum = arr[i];
                count++;
            }
        }
        return count;
    }

    //최소 블루레이 크기 left ~ 최대 블루레이 크기 right 사이에서 이분탐색
    public static int binarySearch(int left, int right) {
        while (left < right) {
            //중앙값부터 시작
            int mid = (left + right) / 2;
            //블루레이의 크기가 mid일 때 가지고 있는 블루레이 m개보다 많다면
            // -> 블루레이의 크기를 늘려서 개수를 줄여야함
            if (bluRayCount(mid) > m) {
                left = mid + 1;
            } else{ //반대면 블루레이 크기 줄이기
                right = mid;
            }
        }
        //블루레이 크기 중 최소값 리턴
        return left;
    }
}
