class Solution {
    public int[] solution(int[][] arr) {
        
        check(arr);
        return count;
    }

	//0과 1의 개수를 담을 배열
    static int[] count = new int[] {0, 0};

	//배열을 구성하는 수가 모두 같은지 확인하는 메서드
	public static void check(int[][] arr) {

		//arr이 한 칸만 남으면 그 칸의 수를(0 or 1) count배열에 ++
		if(arr.length < 2) {
			count[arr[0][0]]++;
			return;
		}
	
		boolean flag = false;

		//자른 배열의 수가 모두 같으면 flag = true, 아니면 flag = false
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

		//자른 배열의 수가 모두 같으면 count 증가, 아니면 자르기
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

	//배열을 4등분하는 메서드
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

		//자른 배열들 다시 check
		check(arr1);
		check(arr2);
		check(arr3);
		check(arr4);
		
	}
}
