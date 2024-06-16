import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        //완주자 해시맵
				Map<String, Integer> mapc = new HashMap<>();
				
				//key: 완주자 이름, value:이름의 수
				for (String s : completion) {
					mapc.put(s, mapc.getOrDefault(s, 0)+1);
				}
		
				for (String s : participant) {
					//완주자맵 key에 참가자의 이름이 있으면
					if(mapc.containsKey(s)) {
						//value를 -1함
						mapc.put(s, mapc.get(s)-1);
						//value가 -1이라면 그 키값을 리턴
						if (mapc.get(s) == -1) {
		          return s;
						}
					}
					//아예 들어있지도 않다면 바로 리턴
					else {
						return s;
					}
				}
		    //어차피 for문 안에서 무조건 리턴되는거 같은데 없으면 오류남..
		    return "";
    }
}
