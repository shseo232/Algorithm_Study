import java.util.HashSet;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        //전체 토핑의 길이
				int len = topping.length;
				int[] firstpiece = new int[len];
				int[] secondpiece = new int[len];

				//첫번째 조각
				HashSet<Integer> toppingcount = new HashSet<>();
			
				//앞에서부터 자르면서 토핑 종류 더하기
				for (int i = 0; i < len; i++) {
					toppingcount.add(topping[i]);
					//0에서 i까지 잘랐을 때 토핑 종류의 개수
				  firstpiece[i] = toppingcount.size();
				}

				//두번째 조각
				toppingcount = new HashSet<>();
				//뒤에서부터 자르면서 토핑 종류 더하기
				for (int i = len - 1; i >= 0; i--) {
					toppingcount.add(topping[i]);
					//전체 토핑의 길이에서 i까지 잘랐을 때 토핑 종류의 개수
				  secondpiece[i] = toppingcount.size();
				}
				
				for (int i = 1; i < len; i++) {
						//두 조각의 토핑 종류의 개수가 같으면 answer++
				    if (firstpiece[i - 1] == secondpiece[i]) {
				        answer++;
				    }
				}
        return answer;
    }
}
