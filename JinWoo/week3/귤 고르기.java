import java.io.*;
import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int[] arr = new int[10000001];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < tangerine.length; i++) {
            if (!map.containsKey(tangerine[i])) {
                map.put(tangerine[i], 1);
            } else {
                map.put(tangerine[i], map.get(tangerine[i]) + 1);
            }
        }

        int result = tangerine.length;
        int count = 1;
        while (result != k) {
            for (int i = 0; i < tangerine.length; i++) {
                if (map.get(tangerine[i]) == count) {
                    for (int j = 0; j < count; j++) {
                        if (result > k) {
                            map.put(tangerine[i], map.get(tangerine[i]) - 1);
                            result -= 1;
                        }
                    }
                } else {
                    continue;
                }
            }
            count++;
        }
        
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < tangerine.length; i++) {
            if (map.get(tangerine[i]) > 0) {
                set.add(tangerine[i]);
            }
        }

        answer = set.size();

        return answer;
    }
}
