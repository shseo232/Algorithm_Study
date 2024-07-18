import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int temp =0;
        for(int i=0;i<citations.length;i++){
            int cnt =0;
            temp = citations[i];
            for(int j=i; j<citations.length;j++){
                cnt++;
                
            }
            
            if(temp>=cnt){
            
                    answer = cnt;
                break;
                }
        }  
        return answer;
    }
}
