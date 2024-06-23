import java.util.*;
class Solution {
    public int[] solution(String msg) {
        HashMap<String, Integer>map = new HashMap<>();
		int idx= 65;
		for(int i =1; i<27;i++) {
			map.put((char)idx+"",i);
			idx++;
		}

		List<Integer>list = new ArrayList<>(); // answer에 들어갈 숫자들을 넣을 녀석
		int index = 0; // while문을 돌려줄 녀석
		int cnt = 27; // 맵에 추가할 녀석의 인데스 시작번호
		
		while(index<msg.length()) {
			String str =""; //문자를 돌아가며 있는지 없는지 체크할 녀석
			while(index<msg.length()) {
				if(!map.containsKey(str+msg.charAt(index))) { // 맵이 갖고 있지않다면 따로 처리하기 위해 브레이크 또한 브레이크 처리를 통해 str을 다시 공백처리하여 새로운 영문자로부터 시작 가능
					break;
				}else {
					str += msg.charAt(index); 
				}
					
				
				index++;
			}
			
			list.add(map.get(str));
			
			if(index<msg.length()) {
				map.put(str+msg.charAt(index), cnt++);
			}
			
			
			
			
		}
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
