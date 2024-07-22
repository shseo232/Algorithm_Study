import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[]{0, 0};
        //yellow의 가로 길이
        int yellow_width = yellow;
        //yellow의 세로 길이
        int yellow_height = 1;
        
        //yellow가 yellow_width x 1 이라고 가정하고 체크 시작(가로가 세로보다 길기 때문)
        while(true) {
            //조건을 만족하면
            if((yellow_width * 2 + yellow_height * 2 + 4) == brown) {
                answer[0] = yellow_width + 2; //전체 가로길이는 노란색 격자 가로+2
                answer[1] = yellow_height + 2; //전체 세로길이는 노란색 격자 세로+2
                break;
            } else { //조건을 만족하지 못하면 노란색 격자의 세로길이를 증가시키고 다시 체크
                yellow_height++;
                if (yellow % yellow_height == 0) {
                    yellow_width = yellow /yellow_height;
                }
            }
        }
        return answer;
    }
}
