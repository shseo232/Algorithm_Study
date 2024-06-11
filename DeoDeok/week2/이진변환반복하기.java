class Solution {
    public int[] solution(String s) {
            StringBuilder sb = new StringBuilder();
			int[] answer = new int[2];
			int count =0;
			int length =0;
			int play =0;
			while(s.length() != 1) {
			for(int i=0; i<s.length();i++) {
				if(s.charAt(i) == '0') {
					count++;
				}
			}
			s = s.replaceAll("0","");
			length = s.length();
			while(length !=0) {
				sb.append(length % 2);
				length /=2;
			}
			s = sb.reverse().toString();
			sb.delete(0, sb.length());
			play ++;
			answer[0] = play;
			answer[1] = count;
			}
            return answer;
    }
}
