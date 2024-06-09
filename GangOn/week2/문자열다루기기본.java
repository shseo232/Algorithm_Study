class Solution {
    public boolean solution(String s) {
        boolean isnum = true;
		    try {
			      Integer.parseInt(s);
		    } catch (NumberFormatException e) {
			      isnum = false;
		    } finally {
			      return ((s.length() == 4 || s.length() == 6) && isnum);
		    }
    }
}
