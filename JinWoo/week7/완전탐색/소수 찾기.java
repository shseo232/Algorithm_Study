import java.util.*;

class Solution {
    static String[] arr;
    static String[] check;
    static HashSet<Integer> set;
    static boolean[] visit;

    public int solution(String numbers) {
        int answer = 0;

        set = new HashSet<>();
        check = new String[numbers.length()];
        visit = new boolean[numbers.length()];
        arr = numbers.split("");

        dfs("", 0);

        for (int num : set) {
            if (prime(num)) {
                answer++;
            }
        }
        return answer;
    }

    public static void dfs(String num, int depth) {
        if (!num.isEmpty()) {
            set.add(Integer.parseInt(num));
        }

        if (depth == arr.length) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visit[i]) {
                visit[i] = true;
                check[i] = arr[depth];
                dfs(num + arr[i], depth + 1);
                visit[i] = false;
            }
        }
    }

    public static boolean prime(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
