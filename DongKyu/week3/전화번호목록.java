import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        
        boolean answer = true;
        Arrays.sort(phone_book);
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < phone_book.length; i++) {
			map.put(phone_book[i],i);
		}
		for (String key : map.keySet()) {
			for (int i = 0; i < key.length(); i++) {
				if (map.containsKey(key.substring(0, i))) {
					answer = false;
				}
			}
		}
        return answer;
        
    }
}
