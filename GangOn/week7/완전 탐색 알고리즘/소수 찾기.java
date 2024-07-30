import java.io.IOException;
import java.util.*;

class Solution {
    
    static int N;
    static int[] arr;
    static boolean[] check;
    static Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        
        N = numbers.length();

        check = new boolean[N];
        int[] numArr = new int[N];
        
        //numbers를 한글자씩 쪼개서 배열 만들기
        for (int i = 0; i < numbers.length(); i++) {
            numArr[i] = Integer.parseInt(numbers.charAt(i)+"");
        }
        
        //한자리 수부터 N(만들수 있는 최대 자릿수)까지 만들 수 있는 숫자의 조합 구하기
        for (int i = 1; i <= N; i++) {
            arr = new int[i];
            dfs(0, i, numArr);

        }
        
        //set에 있는 숫자가 소수인지 체크
        int answer = 0;
        for (int i : set) {
            answer += isPrime(i);
        }
        return answer;
    }
    
    //dfs로 조합 구하기(target: 만드려는 자리수)
    public static void dfs(int depth, int target, int[] numArr) {
        StringBuilder sb = new StringBuilder();
        if (depth == target) {
            for (int i : arr) {
                sb.append(i);
            }
            set.add(Integer.parseInt(sb.toString()));
            return;
        }

        for (int i = 0; i < numArr.length; i++) {
            if(!check[i]) {
                check[i] = true;
                arr[depth] = numArr[i];
                dfs(depth + 1, target, numArr);
                check[i] = false;
            }

        }
    }
    
    //소수 체크 메서드
    public static int isPrime(int n) {
        if (n < 2) {
            return 0;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    return 0;
                }
            }
            return 1;
        }
    }
}
