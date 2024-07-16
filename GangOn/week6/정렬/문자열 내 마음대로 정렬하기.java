import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>();
        
        for (String s : strings) {
          list.add(s);
        }
      
        Collections.sort(list, new Comparator<String>() {
          //compare함수 Override
          @Override
          public int compare(String o1, String o2) {
            //인덱스 n번째 글자를 기준으로 오름차순 정렬
            if(o1.charAt(n) > o2.charAt(n)) {
              return 1;
            } else if (o1.charAt(n) < o2.charAt(n)) {
              return -1;
            } else { // 같으면 사전순 정렬(기본 정렬)
              return o1.compareTo(o2);
            }
          }
        });
        
        
        String[] answer = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
          answer[i] = list.get(i);
        }
        return answer;
    }
}
