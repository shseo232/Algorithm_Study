import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < topping.length; i++) {
            if (map.containsKey(topping[i])) {
                map.put(topping[i], map.get(topping[i]) + 1);
            } else {
                map.put(topping[i], 1);
            }
        }

        for (int i = 0; i < topping.length; i++) {
            if (map.size() == set.size()) {
                answer++;
            }
            map.put(topping[i], map.get(topping[i]) - 1);
            if (map.get(topping[i]) == 0) {
                map.remove(topping[i]);
            }
            set.add(topping[i]);
        }
        return answer;
    }
}
