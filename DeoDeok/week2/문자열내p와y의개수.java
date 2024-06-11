class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int countp =-1;
        int county =-1;
        // System.out.println(s);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p'){
                countp ++;
            }
            else if (s.charAt(i) =='y'){
                county ++;
            }
        }
        if(countp != county){
            answer = false;
        }
        return answer;
    }
}
