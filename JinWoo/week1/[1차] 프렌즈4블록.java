import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        String[][] arr = new String[m][n];

        // 보드를 배열로 변환
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = String.valueOf(board[i].charAt(j));
            }
        }

        while (true) {  // 빈칸이 추가적으로 안나올 때 까지 반복
            boolean check = false;
            boolean[][] visit = new boolean[m][n];

            // 2x2 블록 찾기
            for (int i = 0; i < m - 1; i++) {  // 2*2 행렬을 찾는 느낌이라 m - 1 , n -1 까지만 찾으면 된다 .
                for (int j = 0; j < n - 1; j++) {
                    if (arr[i][j].equals("*")) continue;
                    String str = arr[i][j];
                    if (arr[i][j + 1].equals(str) && arr[i + 1][j].equals(str) && arr[i + 1][j + 1].equals(str)) {
                        visit[i][j] = true;
                        visit[i][j + 1] = true;
                        visit[i + 1][j] = true;
                        visit[i + 1][j + 1] = true;
                        check = true;
                    }
                }
            }

            if (!check) break;

            // 블록 제거
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (visit[i][j]) {
                        arr[i][j] = "*";
                        answer++;
                    }
                }
            }
            
            // 블록 아래로 이동
            for (int j = 0; j < n; j++) {
                for (int i = m - 1; i >= 0; i--) {
                    if (arr[i][j].equals("*")) {
                        for (int k = i - 1; k >= 0; k--) {
                            if (!arr[k][j].equals("*")) {
                                arr[i][j] = arr[k][j];
                                arr[k][j] = "*";
                                break;
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}
