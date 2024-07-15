import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String [strings.length];
        String[] arr = new String [strings.length];
        
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = Character.toString(strings[i].charAt(n));
            arr[i] += strings[i];
            System.out.println(arr[i]);
        }
        
        Arrays.sort(arr);
        
        for(int i = 0 ; i<arr.length; i++){
            answer[i] = arr[i].substring(1,arr[i].length());
        }

        return answer;
    }
}
