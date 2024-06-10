import java.util.*;
class Solution {
    public int solution(int n) {
        StringBuilder m = new StringBuilder();
		while(n!=0) {
			m.append(n%3);
			n=n/3;
			
		}
        
        int answer = 0;
        int jegop = 1;
        for(int i =m.length()-1; i>=0;i--) {
			answer += (m.charAt(i)-'0') * jegop;
            jegop *=3;
		}
        return answer;
    }
}
