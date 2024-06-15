package week_3.완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        // 참가자 입력
        for (String s : participant) {
            // getOrDefault 값이 있으면 반환하고 없으면 기본값을 반환
            map.put(s, map.getOrDefault(s,0)+1);
        }
        // 완주 결과 입력
        for (String s : completion) {
            map.put(s,map.get(s)-1); // 동명이인일 경우
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer+= key;
                break;
            }
        }


        return answer;
    }
}
