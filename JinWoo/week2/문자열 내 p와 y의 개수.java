import java.io.*;
import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String str = s.toLowerCase();
        
        int y = 0 ;
        int p = 0;
        
        for(int i = 0 ; i<str.length(); i++){
            if(str.charAt(i) == 'y'){
                y++;
            }
            else if(str.charAt(i) == 'p'){
                p++;
            }
        }
        if(y == p){
            answer = true;
        }
        else {
            answer = false;
        }

        return answer;
    }
}
