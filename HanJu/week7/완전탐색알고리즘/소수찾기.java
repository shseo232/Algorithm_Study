import java.io.*;
import java.util.*;

class Solution {
    static String numbers;
    static int len;
    static boolean[] visited;
    static ArrayList<Integer>  prime_list;
    static Set<Integer> list;
    static int[] arr, arr_temp;
    static int max_len;
    
    public int solution(String numbers) {
        int answer = 0;
        len = numbers.length();

        arr = new int[len];
        String[] stemp = numbers.split("");
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(stemp[i]);
        }

        visited = new boolean[len];
        list = new HashSet<>();
        for (int i = 1; i <= len; i++) {
            max_len = i;
            arr_temp = new int[i];
            dfs(0);
        }

        prime_list = new ArrayList<>();
        prime(len);
        for (int i : list) {
            if (prime_list.contains(i)) {
                answer++;
//                System.out.println(i);
            }
        }
        System.out.println(answer);
        
        return answer;
    }
    static void prime(int len) {
        String s = "9".repeat(len);
        int max = Integer.parseInt(s);
        int[] check = new int[max + 1];
        for (int i = 2; i <= max; i++) {
            check[i] = i;
        }
        for (int i = 2; i <= max; i++) {
            if (check[i] != 0) {
                prime_list.add(i);
                for (int j = i * 2; j <= max; j += i) {
                    check[j] = 0;
                }
            }
        }
    }

    static void dfs(int depth) {
        if (depth == max_len) {
            StringBuilder temp = new StringBuilder();
            for (int i : arr_temp) {
                temp.append(i);
            }
            list.add(Integer.parseInt(temp.toString()));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr_temp[depth] = arr[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
//설명링크
//https://hanjucoding.tistory.com/6
