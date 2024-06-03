class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2[0].length; j++) {
				int sum = 0;
				for (int a = 0; a < arr2.length; a++) {
					sum += arr1[i][a] * arr2[a][j];
				}
				answer[i][j] = sum;
            }
        }
		
		return answer;
    }
}
