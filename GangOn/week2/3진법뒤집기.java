class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
		    //3진법 변환(거꾸로 담기)
		    while(n > 0) {
			      int a = n % 3;
			      sb.append(a + "");
			      n = (int) n / 3;
		    }
        //System.out.println(sb.toString());
		
		    //10진법 변환
		    int answer = 0;
		    for(int i = 0; i < sb.length(); i++) {
			      answer += Integer.parseInt(sb.charAt(i)+"") * Math.pow(3, sb.length()-i-1);
		    }
        //System.out.println(answer);
        return answer;
	  }
}
