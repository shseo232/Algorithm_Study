class Solution {
    public int[] solution(int[][] arr) {
        
        check(arr);
        return count;
    }
    
    static int[] count = new int[] {0, 0};
	
	public static void check(int[][] arr) {
		
		if(arr.length < 2) {
			count[arr[0][0]]++;
			return;
		}

		boolean flag = false;
		
		A: for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if(arr[0][0] == arr[i][j]) {
					flag = true;
				} else {
					flag = false;
					break A;
				}
			}
		}
		
		if(flag) {
			if (arr[0][0] == 0) {
				count[0]++;
			} else {
				count[1]++;
			}
			return;
		} else {
			split(arr);
		}
		

	}
	
	public static void split(int[][] arr) {
		int[][] arr1 = new int[arr.length/2][arr.length/2];
		int[][] arr2 = new int[arr.length/2][arr.length/2];
		int[][] arr3 = new int[arr.length/2][arr.length/2];
		int[][] arr4 = new int[arr.length/2][arr.length/2];
		for(int i = 0; i < arr.length/2; i++) {
			for(int j = 0; j < arr.length/2; j++) {
				arr1[i][j] = arr[i][j];
			}
		}
		
		for(int i = arr.length/2; i < arr.length; i++) {
			for(int j = 0; j < arr.length/2; j++) {
				arr2[i - arr.length/2][j] = arr[i][j];
			}
		}
		
		for(int i = 0; i < arr.length/2; i++) {
			for(int j = arr.length/2; j < arr.length; j++) {
				arr3[i][j - arr.length/2] = arr[i][j];
			}
		}
		
		for(int i = arr.length/2; i < arr.length; i++) {
			for(int j = arr.length/2; j < arr.length; j++) {
				arr4[i - arr.length/2][j - arr.length/2] = arr[i][j];
			}
		}
		
		check(arr1);
		check(arr2);
		check(arr3);
		check(arr4);
		
	}
}
