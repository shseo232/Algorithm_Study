package week_3.롤케이크자르기;


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> my_map = new HashMap<>();
        Map<Integer, Integer> bro_map = new HashMap<>();
        // bro_map에 등장 횟수와 함꼐 기록
        for (int i = 0; i < topping.length; i++) {
            bro_map.put(topping[i], bro_map.getOrDefault(topping[i], 0) + 1);

        }
        // bro에서 개수 차감하면서 꺼내서 size 비교
        for (int i = 0; i < topping.length; i++) {

            // 두개 이상이면 value 값에서 -1 하고(bro에는 그대로 놔두고) my로 옮겨담기
            if (bro_map.get(topping[i]) == 1) {
                bro_map.remove(topping[i]);
                my_map.put(topping[i], my_map.getOrDefault(topping[i], 0) + 1);
                
            // 1개면 remove하고 my로 옮겨담기    
            } else {
                bro_map.put(topping[i], bro_map.get(topping[i]) - 1);
                my_map.put(topping[i], my_map.getOrDefault(topping[i], 0) + 1);
            }
            if (bro_map.size() == my_map.size()) {
                answer++;
            }
        }
        return answer;
    }

}
