package week_2.주몽;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int[] nums = new int[n];
        int e = n - 1, s = 0, sum = 0, cnt = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 정렬
        Arrays.sort(nums);
        for (int i : nums) {
        }

        while (e > s) {
            sum = nums[s]+nums[e];
            if (sum == m) {
                cnt++;
                s++;
                e--;
            } else if (sum > m) { // e가 0인덱스 쪽으로 움직여야 합이 작아짐
                e--;
                sum = nums[s] + nums[e];
            } else if (sum < m) { // s가 n-1 인덱스 쪽으로 움직여야 합이 커짐
                s++;
            }
        }
        System.out.println(cnt);
    }
}
