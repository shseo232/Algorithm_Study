class Solution {
    public int[] solution(long n) {
        
        String s = String.valueOf(n);
		StringBuilder sb = new StringBuilder(s);
		String s1 = sb.reverse().toString();
		
		int[] answer = new int[s1.length()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(String.valueOf(s1.charAt(i)));
    }
    return answer;
    }
}
