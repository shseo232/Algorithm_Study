class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt1 = 0; //p의 개수
		int cnt2 = 0; //y의 개수
		s = s.toLowerCase();
        for(int i = 0; i< s.length();i++) {
			if("p".equals(s.charAt(i)+"")) {
				cnt1 ++;
			}
			else if("y".equals(s.charAt(i)+"")) {
				cnt2++;
			}
			else {
				answer = true;
			}
		}
		
		if(cnt1 == cnt2) {
			answer = true;
		}
		else {
			answer = false;
		}

        return answer;
    }
}
