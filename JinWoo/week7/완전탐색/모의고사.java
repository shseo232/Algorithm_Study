import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        int [] num1 = {1,2,3,4,5};
        int [] num2 = {2,1,2,3,2,4,2,5};
        int [] num3 ={3,3,1,1,2,2,4,4,5,5};
        
        int [] arr = new int [3];
        
        for(int i = 0 ; i<answers.length; i++){
            if(num1[i % 5] == answers[i]){
                arr[0]++;
            }
            if(num2[i % 8] == answers[i]){
                arr[1]++;
            }
            if(num3[i % 10] == answers[i]){
                arr[2]++;
            }
        }
        
        int max = Math.max(arr[0],Math.max(arr[1],arr[2]));
        int count = 0 ;
        
        ArrayList<Integer>list = new ArrayList<>();
        
        if(max == arr[0]){
            list.add(1);
        }
        if(max == arr[1]){
            list.add(2);
        }
        if(max == arr[2]){
            list.add(3);
        }
        
        return list;
    }
}
