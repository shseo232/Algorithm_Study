import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int x =0;
        while(x<s.length()){
            Stack<Character>stack = new Stack();
            boolean check = true;
            for(int i=0; i<s.length();i++){
                if(s.charAt(i)=='[' || s.charAt(i)=='(' || s.charAt(i)=='{')
                {
                    stack.push(s.charAt(i));
                }
                else if (!stack.isEmpty() && stack.peek()=='{' &&s.charAt(i)=='}'){
                    stack.pop();
                }

                else if (!stack.isEmpty() && stack.peek()=='(' &&s.charAt(i)==')'){  
                    stack.pop();
                }

                else if (!stack.isEmpty() && stack.peek()=='['&&s.charAt(i)==']'){  
                    stack.pop();
                }
                else{
                    check=false;
                    break;
                }
            }
            
            if(stack.isEmpty() && check){
                answer++;
            }
            x++;
            s = s.substring(1) + s.charAt(0);
        }
        return answer;
    }
}
