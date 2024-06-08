class Solution {
    public String solution(String s, int n) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			int a = s.charAt(i);
			if (a == 32) { //공백일경우
				sb.append((char) a);
			} else if(a < 91) { //대문자일 경우
				int B = (a + n - 65) % 26 + 65;
				sb.append((char) B);
			} else { //소문자일경우
				int b = (a + n - 97) % 26 + 97;
				sb.append((char) b);
			}
		}
		return sb.toString();
	}
}
