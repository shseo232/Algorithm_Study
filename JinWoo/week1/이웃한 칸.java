class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0 ;
        int [][] directions = {{0,1},{1,0},{-1,0},{0,-1}};
        
        for(int [] dir : directions){
            int m_h = h + dir[0];
            int m_w = w + dir[1];
            
            System.out.println(m_w);
            System.out.println(m_h);
            
            if(m_h>=0 && m_w >=0 && m_h<board.length && m_w<board[0].length){
                if(board[m_h][m_w].equals(board[h][w])){
                    answer++;
                    }
                }
        }
        return answer;
    }
}
