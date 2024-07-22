import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
      
        for(int i = 1 ; i<=Math.sqrt(sum); i++){
            if(sum % i == 0){
                int width = i;
                int height = sum / i;
                if((height -2) * (width - 2) == yellow){
                    answer[0] = height;
                    answer[1] = width;
                    break;
                } 
            }
        } 
        return answer;
    }
}
