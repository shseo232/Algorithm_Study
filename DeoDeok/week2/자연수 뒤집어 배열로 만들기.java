class Solution {
    public int[] solution(long n) {
      
        String N = String.valueOf(n);
        int size = N.length();
          int[] answer = new int[size];
        for(int i =size; i>0;i--){
            String str = N.charAt(i-1)+"";
            answer[size-i] = Integer.parseInt(str);
        }
        return answer;
    }
}
