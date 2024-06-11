class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++ ){
            int a = s.charAt(i);
            int b = s.charAt(i)+n;
            if(a == 32){
                b = 32;
            }
            if(a > 64 && a <91){
                if(b >90){
                    b = b - 26;
                }
            }
            else if (a > 96 && a < 123){
             if(b > 122) {
                 b = b-26;
             }  
            }
            answer += (char)b;
        }
        
        
        return answer;
    }
}
