import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        List<Character> list = new ArrayList<>();
        
        for (int i = 0 ; i < s.length(); i++) {
          list.add(s.charAt(i));
        }
        
        Collections.sort(list, Collections.reverseOrder());
        for (int i : list) {
          answer.append((char) i);
        }
        return answer.toString();
    }
}
