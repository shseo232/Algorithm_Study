import java.util.*;

class Solution {
    
    private static int[] Times;
    private static int N;
    
    public long solution(int n, int[] times) {
        
        N = n;
        Times = times;

        Arrays.sort(Times);

        long left = 0;
        //심사에 걸리는 최대값(모든 사람이 가장 오래 걸리는 심사대에서 심사받을 경우
        long right = (long)Times[Times.length - 1] * n;
        
        return binarySearch(left, right);
    }
    
    //이분탐색 메서드
    public static long binarySearch(long left, long right) {

        //최소 탐색 시작점이 최대 탐색점보다 작을때
        while (left < right) {
            //중앙값부터 시작
            long mid = (left + right) / 2;

            //mid 시간 안에 심사받을 수 있는 사람이 주어진 n보다 작으면
            if (count(mid) < N) {
                //더 많은 시간이 필요함 -> 최소탐색범위 = mid + 1
                left = mid + 1;
            } else { //더 많으면 최대 탐색 범위를 mid로
                right = mid;
            }
        }

        return left;
    }
    
    //매개변수로 주어진 시간에 몇명의 사람이 심사받을 수 있을지 구하는 메서드
    public static long count(long time) {
        long count = 0;
        for (int i : Times) {
            count += time / i;
        }
        return count;
    }
    
}
