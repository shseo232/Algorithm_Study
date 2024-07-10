import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> que = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        int plus = Integer.MIN_VALUE;

        for (int i = 0; i < progresses.length; i++) {
            int num = 100 - progresses[i];
            int tmp = 0;
            if (num % speeds[i] != 0) {
                tmp = (num / speeds[i]) + 1;
            } else {
                tmp = num / speeds[i];
            }
            if (tmp > plus) {
                plus = tmp;
            }
            que.add(plus);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : que) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        for (int i = 0; i < 101; i++) {
            if (map.containsKey(i)) {
                list.add(map.get(i));
            }
        }
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
