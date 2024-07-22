import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        //key: 학생번호, value: 체육복 수
        Map<Integer, Integer> map = new HashMap<>();
        
        //처음엔 모든 학생들이 한벌씩 가지고있음
        for (int i = 1; i <= n; i++) {
            map.put(i, 1);
        }
        //여벌옷 가지고 있는 학생에게 체육복 수 +1
        for(int i = 0; i < reserve.length; i++) {
            map.put(reserve[i], map.get(reserve[i]) + 1);
        }

        //도난당한 학생의 체육복 수 -1
        for (int i = 0; i < lost.length; i++) {
            map.put(lost[i], map.get(lost[i]) - 1);
        }
        //1번 학생부터 시작
        for (int i = 1; i <= n; i++) {
            //(본인 번호-1)번 학생이 있고, 본인이 여벌옷이 있고, (본인 번호-1)번 학생이 옷이 없으면
            if(map.containsKey(i-1) && map.get(i) == 2 && map.get(i-1) == 0) {
                //(본인 번호-1)번 학생의 체육복 수 + 1, 본인의 체육복 수 -1
                map.put(i-1, map.get(i-1) + 1);
                map.put(i, map.get(i) - 1);
            //(본인 번호+1)번 학생이 있고, 본인이 여벌옷이 있고, (본인 번호+1)번 학생이 옷이 없으면
            } else if(map.containsKey(i+1) && map.get(i) == 2 && map.get(i+1) == 0) {
                //(본인 번호+1)번 학생의 체육복 수 + 1, 본인의 체육복 수 -1
                map.put(i+1, map.get(i+1) + 1);
                map.put(i, map.get(i) - 1);
            } else {
                continue;
            }
        }

        int answer = 0;
        //i번째 학생의 체육복 수가 0이상이면 체육수업 가능
        for (int i : map.keySet()) {
            if (map.get(i) > 0) {
                answer ++;
            }
        }
        return answer;
    }
}
