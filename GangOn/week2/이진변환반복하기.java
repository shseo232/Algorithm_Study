class Solution {
    public int[] solution(String s) {
        StringBuilder sb = new StringBuilder(s);
		    int changecnt = 0;
		    int delcnt = 0;
		
		    while(!(sb+"").equals("1")) {
			      //0 지우기
			      int length = sb.length();
			      for(int i = 0; i < length; i++) {
				        if((sb.charAt(i)+"").equals("0")) {
					      sb.deleteCharAt(i);
					      delcnt++;
					      i--; // i번째 값이 없어졌으니 다음 인덱스로 넘어가면 안됨
					      length--; //길이도 재조정
				        }
			      }
            
			      //sb의 길이를 2진법으로 변환
			      System.out.println(sb.length());
			      sb = new StringBuilder(Integer.toBinaryString(sb.length()));
			      changecnt++;
		    }
        int[] answer = {changecnt, delcnt};
        return answer;
    }
}
