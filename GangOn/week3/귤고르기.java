import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
		
        //종류별 개수 세기
				for(int i : tangerine) {
					map.put(i, map.getOrDefault(i, 0)+1);
				}
		
				//value를 리스트에 담은 다음 내림차순 정렬
				List<Integer> list = new ArrayList<>();
				for(int i : map.keySet()) {
					list.add(map.get(i));
				}
				Collections.sort(list, Collections.reverseOrder());
				
		
				int sum = 0;
				int idx = 0;
				int count = 0;
			
		    //총 개수의 합이 k이상이 될때까지 종류의 개수가 많은 것부터 더하기
				while(sum < k) {
					sum += list.get(idx);
					idx++;
					count++;
				}
				return count;
    }
}
