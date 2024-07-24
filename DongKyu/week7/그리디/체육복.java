import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        //최종 목표 : n - 체육복을 잃어버리고 못빌리는 녀석들의 수
        HashSet<Integer> lostSet = new HashSet<>(); //잃어버린 녀석들
        HashSet<Integer> reserveSet = new HashSet<>(); // 빌려줄수 있는 녀석들

        for (int l : lost) {
            lostSet.add(l);
        }

        for (int r : reserve) {
            if (lostSet.contains(r)) {
                lostSet.remove(r); // 옷을 빌려줄 수 있는 녀석이 잃어버릴 수도 있다는 조건이 있으니 그녀석은 lostSet에 추가하지않는다 동시에 빌려줄수 있는 녀석으로도 추가하지 않는다.
            } else {
                reserveSet.add(r);
            }
        }

        for (int r : reserveSet) {
            if (lostSet.contains(r - 1)) {
                lostSet.remove(r - 1);
            } else if (lostSet.contains(r + 1)) {
                lostSet.remove(r + 1);
            }
        }
        answer = n-lostSet.size();
        
        return answer;
    }
}
