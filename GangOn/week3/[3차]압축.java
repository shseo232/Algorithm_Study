import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String msg) {
        //사전 초기화
    		Map<String, Integer> map = new HashMap<>();
    		
    		for(int i = 1; i < 27; i++) {
    			map.put((char) (i+64)+"" , i);
    		}
    		
    		//출력 담을 리스트
    		List<Integer> list = new ArrayList<>();
    		
    		int startidx = 0;
    		int value = 27;
    	
    		whileLoop:
    		while (true) {
          
          //맨 뒤에서부터 하나씩 줄여가며 startidx까지 자른 문자열이 key에 있는지 찾기
    			for (int i = msg.length(); i > startidx; i--) {
    				String w = msg.subSequence(startidx, i)+"";
            
            //있으면 그 문자열의 value(색인번호)를 list에 추가
    				if (map.containsKey(w)) {
    					list.add(map.get(w));
              
              //현재 입력(w)의 마지막 인덱스가 전체 메시지의 길이와 같으면 종료
    					if(i == msg.length()) {
    						break whileLoop;
                
              //아니면 현재 입력과 다음 글자를 더한 값을 사전에 추가
    					} else {
    						String c = msg.charAt(i)+"";
    						map.put(w + c, value);
    						value++; //다음에 담을 값을 위해 색인번호 증가
    						startidx = i; //startidx 업데이트
    					}
    				}
    			}
    		}
    
    		int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
