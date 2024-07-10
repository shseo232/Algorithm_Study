import java.util.*;

class Solution {
    public int[] solution(String msg) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 1; i <= 26; i++) {
            map.put(String.valueOf((char) (64 + i)), i);
        }

        int idx = 0;
        int last = 27;

        while (idx < msg.length()) {
            int num = 1;
            int tmp = 0;

            while (idx + num <= msg.length() && map.containsKey(msg.substring(idx, idx + num))) {
                tmp = map.get(msg.substring(idx, idx + num));
                num++;
            }

            list.add(tmp);

            if (idx + num <= msg.length()) {
                map.put(msg.substring(idx, idx + num), last++);
            }

            idx += (num - 1);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
