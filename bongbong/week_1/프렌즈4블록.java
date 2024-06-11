package week_1.프렌즈4블록;

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        String[][] arr = new String[board.length][board[0].length()];
        //2차원 배열로 변환
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                arr[i][j] = String.valueOf(board[i].charAt(j));
            }
        }
        boolean flag = true;

        while (flag) {
            flag = false;
            // 방문기록
            boolean[][] visited = new boolean[board.length][board[0].length()];
            // 2*2 찾기
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr[i].length - 1; j++) {
                    // 삭제한 블록(0)이 아니면서, 시작점(arr[i][j]) 과 같은 블록일 경우 visited에 표시
                    if (!"0".equals(arr[i][j]) && arr[i][j].equals(arr[i][j + 1]) && arr[i][j].equals(arr[i + 1][j]) && arr[i][j].equals(arr[i + 1][j + 1])) {
                        visited[i][j] = true;
                        visited[i][j + 1] = true;
                        visited[i + 1][j] = true;
                        visited[i + 1][j + 1] = true;
                        flag = true;

                    }
                }
            }
            // visited에 true이면 arr에서 0으로 바꿔줌
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (visited[i][j]) {
                        arr[i][j] = "0";
                    }
                }
            }

            // 내리기
            boolean down = true;
            while (down) {
                down = false;
                for (int i = 0; i < arr.length - 1; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        if (!"0".equals(arr[i][j]) && "0".equals(arr[i + 1][j])) {
                            arr[i + 1][j] = arr[i][j];
                            arr[i][j] = "0";
                            down = true;
                        }
                    }
                }
            }
        }
        // 빈칸 카운트
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ("0".equals(arr[i][j])) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
