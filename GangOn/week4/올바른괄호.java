class Solution {
    boolean solution(String s) {
        
    int count = 0;
    
    for(int i = 0; i < s.length(); i++) {
        if(String.valueOf(s.charAt(i)).equals("(")) {
            count++;
        } else {
            count--;
        }
        if(count < 0) {
            return false;
        }
    }
    
    if(count == 0) {
        return true;
    } else {
        return false;
    }
    }
}
