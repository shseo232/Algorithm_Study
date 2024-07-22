import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int [] arr = new int [n + 2]; // 양 옆에 앞뒤 
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        Arrays.fill(arr,1);
        
        for(int i = 0 ; i<lost.length; i++){
            arr[lost[i]]--;
        }
        
        for(int i = 0 ; i<reserve.length; i++){
            arr[reserve[i]]++;
        }
         
        //정렬했기 떄문에 뒤에꺼 부터 하는게 맞음 
        for(int i = 1 ; i<=n; i++){
            int back = i - 1; 
            int front = i + 1;
            if(arr[i] == 0){
                if(arr[back] == 2){
                    arr[i] = 1;
                    arr[back] = 1;
                }
                else if (arr[front] == 2){
                    arr[i] = 1; 
                    arr[front] = 1;
                }
            }    
        }
        
        for(int i = 1 ; i<=n; i++){
            if(arr[i]>=1){
                answer++;
            }
        }
        
        return answer;
    }
}
