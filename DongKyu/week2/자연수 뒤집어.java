class Solution {
    public int[] solution(long n) {
        String m = n + ""; // 문자열로 변환 후
		int[] arr = new int[m.length()];
		for (int i = 0; i < m.length(); i++) { // 1차 배열 변환
			if (i == m.length() - 1) {
				arr[i] = Integer.parseInt(m.substring(i));
			} else {
				arr[i] = Integer.parseInt(m.substring(i, i + 1));
			}
		}
        int[] answer = new int[m.length()];
        for(int i =m.length()-1;i>=0;i--) {
			answer[(m.length()-1)-i]=arr[i];
		}
        return answer;
    }
}
