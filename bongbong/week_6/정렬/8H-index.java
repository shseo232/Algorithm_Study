import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = n-i; // 정렬된 배열에서 i번째 수보다 큰 값들의 개수 = 'h편 이상이고'
            if(citations[i]>=h){ // h번 이상 인용된 것이 맞는지 확인
                answer = h;
                break;
            }
        }
        return answer;
    }
}
