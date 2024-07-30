import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long left = 0 ;
        long right = Long.MAX_VALUE;
        
        while(left<=right){
            long mid = (left +right) / 2;
            long result = 0 ;
            for(int i = 0 ; i<times.length ; i++){
                result += (mid / times[i]);
            }
                if(result < n){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                    answer = mid;
                }
            }      
        return answer;
    }
}
