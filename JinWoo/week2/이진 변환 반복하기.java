class Solution {
    public int[] solution(String s) {
        int[] answer = new int [2];
        
        int result = 0;
        int zero = 0;
        
        while(true){
            result++;
            int count = 0;
            for(int i = 0 ; i<s.length(); i++){
                if(s.charAt(i) == '1'){
                    count++;
                }
                else{
                    zero++;
                }
            }
            s = Integer.toString(count,2);
            if(count == 1){
                break;
            }
        }
        answer[0] = result;
        answer[1] = zero;
        
        return answer;
    }
}
