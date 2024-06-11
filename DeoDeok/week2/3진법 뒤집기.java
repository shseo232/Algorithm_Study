class Solution {
    public int solution(int n) {
        String str = "";

        while (n != 0) {
            str += n % 3;
            n /= 3;
        }
        
        return Integer.parseInt(str,3);
        //Integer.parseInt(str, 3); - str 문자열을 3진수로 해석하여 10진수로 변환한다.
//출처: https://ittrue.tistory.com/335 [IT is True:티스토리]
    }
}
