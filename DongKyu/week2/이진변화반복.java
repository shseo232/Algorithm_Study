class Solution {
    public int[] solution(String s) {
        int cnt1 = 0; //이진변화 수
        int cnt2 = 0; //제거한 0의 개수
        int []answer = new int[2];// [이진변화 수, 제거한 0의 개수] 담을 리스트 생성


        while (!("1").equals(s)) {
            int a = s.length();
            s = s.replace("0","");
            int b = s.length();
            cnt2 += a - b;
            cnt1++;
            s = Integer.toBinaryString(b);

        }

        answer[0] = cnt1;
        answer[1] = cnt2;
        
        return answer;
    }
}
