import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
		
				for (String s : phone_book) {
					map.put(s, 0);
				}
				
				//phone_book의 요소 s에 대해
				for (String s : phone_book) {
					for (int i = 0; i < s.length(); i++) {
		        //s를 앞에서부터 하나씩 늘려보면서 그 값이 key에 있으면
						if(map.containsKey(s.substring(0, i))) {
							return false;
						}
					}
				}
        return true;
    }
}
