import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Solution {
    public String[] solution(String[] record) {
        //결과를 담기 위한 리스트
        List<String> list = new ArrayList<>();
        //유저 아이디와 닉네임을 담기 위한 해시맵
				Map<String, String> map = new HashMap<>();
				
				//첫 단어가 Enter나 Change면 두번째 단어(유저아이디)를 key로, 세번째 단어(닉네임)을 value로 담음
				for (String s : record) {
					String[] word =  s.split(" ");
					if (word[0].equals("Enter") || word[0].equals("Change")) {
						map.put(word[1], word[2]);
					}
				}

				//최종적으로 확정된 유저아이디의 닉네임을 이용해 출력문 리스트 만들기
				for (String s : record) {
					String[] word =  s.split(" ");
					if (word[0].equals("Enter")) {
						list.add(map.get(word[1])+"님이 들어왔습니다.");
					} else if (word[0].equals("Leave")) {
						list.add(map.get(word[1])+"님이 나갔습니다.");
					}
				}
		    //리스트를 배열로 변환
				String[] answer = list.stream().toArray(String[] :: new);
				return answer;
    }
}
