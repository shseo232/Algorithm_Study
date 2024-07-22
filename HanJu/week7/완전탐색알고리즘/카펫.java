import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int all = brown+yellow;
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = 2;  i < all/2 ; i++){
            if(all%i==0)arr.add(i);
        }
        for(int i : arr){
            int temp = all/i;
            
            if( (i-2)*(temp-2)==yellow ){
                answer[0] = i;
                answer[1] = temp;
            }
        }
        
        return answer;
    }
}
