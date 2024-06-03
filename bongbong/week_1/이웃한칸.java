class Solution {
    public int solution(String[][] board, int h, int w) {
        // 정수저장
        int n = board.length;
        // 같은색의 칸 개수
        int count = 0;
        // h와 w의 변화량
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        for (int i = 0; i <= 3; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            if (h_check >= 0 && h_check < n && w_check>=0 & w_check<n) {
                if (board[h][w].equals(board[h_check][w_check])) {
                    count++;
                }
            }

        }


        return count;
    }
}
