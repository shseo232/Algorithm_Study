class Solution {
    public int solution(int m, int n, String[] board) {
        		String[][] arr = new String[board.length][board[0].length()];
		
		//2차원 배열로 변환
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length(); j++) {
				arr[i][j] = String.valueOf(board[i].charAt(j));
			}
		}

		boolean flag = true;
		
		while(flag) {
			flag = false;
			//복사 배열 생성
			boolean[][] copy_arr = new boolean[board.length][board[0].length()];
			//2X2형태 찾기
			for(int i = 0; i < arr.length-1; i++) {
				for(int j = 0; j < arr[i].length-1; j++) {
					if(arr[i][j] != "0" && arr[i][j].equals(arr[i][j+1]) && arr[i][j].equals(arr[i+1][j]) && arr[i][j].equals(arr[i+1][j+1])) {
						copy_arr[i][j] = true;
						copy_arr[i][j+1] = true;
						copy_arr[i+1][j] = true;
						copy_arr[i+1][j+1] = true;
						flag = true;
					}
				}
			}
//			System.out.println(Arrays.deepToString(copy_arr));
			
			
			//2X2 형태 블록 제거
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					if(copy_arr[i][j] == true) {
						arr[i][j] = "0";
					}
				}
			}
//			System.out.println(Arrays.deepToString(arr));
			
			
			//열 방향으로 블록 내리기
			boolean change = true;
			while(change) {
				change = false;
				for(int i = 0; i < arr.length-1; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						if(arr[i][j] != "0" && arr[i+1][j] == "0") {
							arr[i+1][j] = arr[i][j];
							arr[i][j] = "0";
							change = true;
						}
					}
				}
			}
			
//			System.out.println(Arrays.deepToString(arr));
			
		}
		// 빈칸 카운트
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == "0") {
					count++;
				}
			}
		}
		return count;
    }
}
