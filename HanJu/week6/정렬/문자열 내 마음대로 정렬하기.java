import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        int N = strings.length;
        for(int i = 0 ; i < N ; i++){
            strings[i] = strings[i].charAt(n)+strings[i];
        }
        
        Arrays.sort(strings);
         for(int i = 0 ; i < N ; i++){
            strings[i] = strings[i].substring(1);
        }        
        return strings;
    }
}
