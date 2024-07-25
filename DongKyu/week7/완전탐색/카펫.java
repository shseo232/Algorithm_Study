import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        
        ArrayList<Integer>list = new ArrayList<>();
        int target = brown+yellow;
        int y =0;//가로
        
        for(int i=1; i<=target;i++){ // i는 세로
            if(target%i==0){
                y=target / i;
                if(i>=y&&(y-2)*(i-2)== yellow){
                    list.add(i);
                    list.add(y);
                    break;  
                }
            }
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
