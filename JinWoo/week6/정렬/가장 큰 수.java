import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String [] arr = new String [numbers.length];
        
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        //두배열의 문자를 이어 붙인걸 비교하여 정렬한다 
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        if(arr[0].equals("0")){
            return "0";
        }
        
        
        for(int i = 0 ; i<arr.length; i++){
            answer += arr[i];
        }
        
        return answer;
    }
}

//시간을 줄이기 위한 StringBuilder풀이

import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String [] arr = new String [numbers.length];
        
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        //두배열의 문자를 이어 붙인걸 비교하여 정렬한다 
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        if(arr[0].equals("0")){
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        
        
        for(int i = 0 ; i<arr.length; i++){
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}
