class Solution {
    boolean solution(String s) {
      String su = s.toUpperCase();
		  
		  int pcount = 0;
		  int ycount = 0;
		
		  for(int i = 0; i < s.length(); i++) {
			  if(String.valueOf(su.charAt(i)).equals("P")) {
				  pcount++;
			  } else if(String.valueOf(su.charAt(i)).equals("Y")) {
				  ycount++;
			  }  
		  }
      return pcount == ycount;
    }
}
