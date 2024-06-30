import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer>map = new HashMap<>();//각 크기별 몇개의 귤이 있는지 hashmap 생성
		for(int i = 0; i<tangerine.length;i++) {
			if(map.containsKey(tangerine[i])) {
				map.put(tangerine[i], map.get(tangerine[i])+1);
			}
			else {
				map.put(tangerine[i],1);
			}
		}
        
        // 크기로 나눈 개수를 정렬하기 위한 배열로 생성작업 -> 의도 한 것은 크기가 같은 녀석들이 있다면 그들의 조합으로 result를 구할 수 있기에
		// 쉽게 설명하자면 겹치는 크기를 가진 녀석들을 일단 뽑고 그들을 정렬함으로써 크기는 이제 안중에 없고
		// 같은 크기를 가진 녀석들의 갯수로 답을 구하려고한다.
		
		Integer []arr = new Integer[map.size()]; 
		int idx = 0;
		for(int key : map.values()) {
			arr[idx++]=key;
		}
        
        // 역순으로 정렬 -> 역순으로 정렬하는 이유는 어차피 낱개 애들은 필요없기에
		Arrays.sort(arr, Collections.reverseOrder()); // 역순 정렬을 하기위해서는 int[]arr-> Integer[]arr로
        int answer = 0;
        int sum = 0;
		for(int i=0; i< arr.length;i++) {
			sum+=arr[i];		
			if(sum >= k) {
				answer =i+1;
				break;
			}
		}

        return answer;
    }
}
