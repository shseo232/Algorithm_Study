import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        //1,2,3,6,8,10,12,15
        //num이 citations 요솟값보다 커지면
        for(int i = 0 ; i<citations.length ; i++){
            int num = citations.length - i;
            if(citations[i] >=num){
                answer = num;
                break;
            }
        }
        return answer;
    }
}
