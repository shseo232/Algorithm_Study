import java.util.*;

class Solution {
    public static int N  = 0 ;
    public static ArrayList<Integer>list = new ArrayList<>();
    
    public int[][] solution(int n) {
        hanoi(n,1,3);
        
        int [][] answer = new int [N][2];
        
        int count = 0 ;
        int idx = 0;
        
        for(int i = 0 ; i<list.size(); i++){
            answer[count][idx] = list.get(i);
            idx++;
            if(idx == 2){
                count++;
                idx = 0;
            }
        }
        return answer;
    }
    public static void hanoi(int n, int x , int y){
        N++;
        if(n > 1){
            hanoi(n - 1, x , 6 - x - y);
        }
        list.add(x);
        list.add(y);
        if(n>1){
            hanoi(n - 1, 6 - x - y , y);
        }
        
    }
}
