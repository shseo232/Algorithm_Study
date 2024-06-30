import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
		
		
		int[] days = new int[progresses.length];
		
		//각 작업별 남은 일수 구하기
		for(int i = 0; i < progresses.length; i++) {
			days[i] = (100 - progresses[i]) / speeds[i];
			if((100 - progresses[i]) % speeds[i] > 0) {
				days[i]++;
			}
		}
		
		// 첫 배포가능까지 남은 일수
		int bapoableday = days[0];
		
		int count = 0;
		
		for(int i = 0; i < days.length; i++) {
			if(days[i] <= bapoableday) { //첫 배포가능작업의 작업일수보다 작거나 같으면
				count++; //함께 배포하기 위해 count증가
			} else { //첫 배포가능작업의 작업일수보다 크면
				list.add(count); //모아뒀던 작업의 수 add
				bapoableday = days[i]; // 배포가능까지 남은 일수 업데이트
				count = 1; //카운트 초기화
			}
		}
		list.add(count); //최종적으로 남은 작업들 add 
		int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
