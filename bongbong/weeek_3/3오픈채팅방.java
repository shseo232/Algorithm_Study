import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] solution(String[] record) {
        List<String> lst_a = new ArrayList<>();

        // hashmap에 key:uid, value:닉네임으로 저장
        Map<String,String> map = new HashMap<>();
        List<String[]> list = new ArrayList<>();
        // 공백별로 잘라서 list에 넣음
        for (int i = 0; i < record.length; i++) {
            list.add(record[i].split(" "));
        }

        // 0번째는 in/out, 1번째가 id, 2번째가 닉네임
        for(int i=0;i<list.size();i++) {

            if ("Enter".equals(list.get(i)[0]) || "Change".equals(list.get(i)[0])) {
                map.put(list.get(i)[1], list.get(i)[2]);
            }
        }

        for(int i=0;i<list.size();i++) {

            if ("Enter".equals(list.get(i)[0])) {
                String temp = "";
                temp += map.get(list.get(i)[1]);
                temp += "님이 들어왔습니다.";
                lst_a.add(temp);

            } else if ("Leave".equals(list.get(i)[0])) {
                String temp = "";
                temp+= map.get(list.get(i)[1]);
                temp += "님이 나갔습니다.";
                lst_a.add(temp);
            }

        }

        String[] answer = new String[lst_a.size()];
        for (int i = 0;i<answer.length;i++) {
            answer[i] = lst_a.get(i);
        }
        return answer;
    }
}
