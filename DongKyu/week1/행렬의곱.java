class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i = 0;i<answer.length;i++) {
			for(int j=0;j<answer[0].length;j++) {
				int sum = 0;
				
				for(int l =0; l<arr2.length;l++) {
					sum += arr1[i][l]*arr2[l][j];
				}
				answer[i][j] = sum;
			}
		}
        return answer;
    }
}
