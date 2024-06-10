class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int num =0;
        if(s.length()==4 || s.length()==6){
            for(int i = 0; i<s.length();i++){
                num = s.charAt(i);
                System.out.println(num);
                if(num>57){
                    answer = false;
                    break;
                }
            }
        }
        else{
            answer = false;
        }
        
        return answer;
    }
}
