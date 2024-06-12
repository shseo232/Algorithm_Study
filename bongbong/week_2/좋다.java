package week_2.좋다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
N개의 수 중에서 어떤 수가 다른 수 두 개의 합으로 나타낼 수 있다면 그 수를 “좋다(GOOD)”고 한다.
==>  N은 자기 자신 + 0이어서는 안된다!

N개의 수가 주어지면 그 중에서 좋은 수의 개수는 몇 개인지 출력하라.

수의 위치가 다르면 값이 같아도 다른 수이다.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int cnt = 0;
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        for (int j = 0; j < n; j++) {
            int m = nums[j];
            int e = n-1;
            int s = 0;
            int sum = 0;
            while (e > s) {
                sum = nums[s] + nums[e];
                if (sum == m) {
                    if (s != j && e != j) {
                        cnt++;
                        break;
                    } else if (s == j) {
                        s++;
                    } else if (e == j) {
                        e--;
                    }
                } else if (sum > m) {
                    e--;
                } else if (sum < m) {
                    s++;
                }
            }
        }
        System.out.println(cnt);
    }
}
