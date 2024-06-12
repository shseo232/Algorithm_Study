class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0 ; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                answer += " ";
            }
            else{
                if(s.charAt(i)>'Z'){
                    if(s.charAt(i) + n <= 'z'){
                    answer += (char)(s.charAt(i) + n);
                   }
                    else{
                    answer += (char)(s.charAt(i) + n - 'z' +'a' -1);
                   }
                }
                else{
                    if(s.charAt(i) + n <= 'Z'){
                    answer += (char)(s.charAt(i) + n);
                   }
                    else{
                    answer += (char)(s.charAt(i) + n - 'Z' +'A' -1);
                   }
                }
            }
        }
        return answer;
    }
}
