class Solution {
    public String solution(String new_id) {
        String answer = "";
        String check = "..";
        
        String first = new_id.toLowerCase();
        String second = "";
        for(int i = 0 ; i<first.length(); i++){
            char tmp = first.charAt(i);
            if((tmp>='a' && tmp<='z') || (tmp >='0'  && tmp<='9') || tmp == '-' || tmp =='_' || tmp =='.'){
                second += tmp;
            }
            else{
                continue;
            }
        }
        
        while(true){
            if(second.contains(check)){
                second = second.replace(check, ".");
            }
            else{
                break;
            }
        }
        
        String four = "";
        
        if(second.charAt(0) =='.'){
            for(int i = 1; i<second.length(); i++){
                four += second.charAt(i);
            }
        }
        else if(second.charAt(0) !='.') {
            for(int i = 0 ; i<second.length(); i++){
                four += second.charAt(i);
            }
        }
        
        if(four.length() == 0){
            four = "a";
        }
        
        if(four.length()>=15){
            four = four.substring(0,15);
        }
        
        if(four.charAt(four.length() - 1) == '.'){
            four = four.substring(0,four.length() - 1);
        }
        
        answer = four;
        
        if(four.length()<=2){
           char plus = four.charAt(four.length() - 1);
            System.out.println(plus);
            while(answer.length() <3){
                answer += plus;
            }
        }
       
      
        return answer;
    }
}
