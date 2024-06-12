import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(int n, int t, int m, int p) {
        Map<Integer , String> map = new HashMap();
    		map.put(10, "A");
    		map.put(11, "B");
    		map.put(12, "C");
    		map.put(13, "D");
    		map.put(14, "E");
    		map.put(15, "F");
    		
    		StringBuilder sb = new StringBuilder();
    		
    		for(int i =0; i < t*m; i++) { //길이가 얼만큼 나올 지 몰라서 일단 (미리 구할 숫자의 갯수*게임에 참가하는 인원)만큼 생성
    			int num = i;
    			StringBuilder sb1 = new StringBuilder();
    			do {
    				int a = num % n;
    				if(a >= 10) {
    					sb1.append(map.get(a));
    				} else {
    					sb1.append(a + "");
    				}
    				num = (int) num / n;
    			} while(num > 0);
    			sb.append(sb1.reverse());
    		}
    		//튜브의 순서에 해당하는 문자 더하기
    		StringBuilder result = new StringBuilder();
    		for (int i = 0; i < t; i++) {
    			int idx = i * m + p - 1;
    			result.append(sb.charAt(idx)+"");
    		}
		    return result.toString();
    }
}
