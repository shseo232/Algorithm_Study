import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				list.add(numbers[i]+numbers[j]);
			}
		}
		
		//중복제거
		Set<Integer> set = new HashSet<>(list);
		List<Integer> list2 = new ArrayList<>(set);
        Collections.sort(list2);

		int[] answer = list2.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
