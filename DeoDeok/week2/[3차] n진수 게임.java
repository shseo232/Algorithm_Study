class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
         int repeat = t;
		 String str =" ";
		 String Pstr = "";
		 for(int i=0; i< t*m; i++) {
			 str+= Integer.toString(i,n).toUpperCase();
		 }
		 
		 while(repeat > 0) {
			 int i = p;
			 Pstr += str.charAt(p);
			 p=p+m;
			 repeat--;
		 }
        answer = Pstr;
        return answer;
    }
}
