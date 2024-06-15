// https://school.programmers.co.kr/learn/courses/30/lessons/42577
package week_3.전화번호목록;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book); // 효율성 up1

        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], map.getOrDefault(phone_book[i],0));
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0,j))) { // 효율성 up2
                    answer = false;
                    break;
                }
            }
        }
        
        // 시간초과 풀이
//        for (int i = 0; i < phone_book.length; i++) {
//            for (int j = 0; j < phone_book.length; j++) {
//                if (phone_book[i].startsWith(phone_book[j]) && !phone_book[i].equals(phone_book[j])) {
//                    answer = false;
//                    break;
//                }
//            }
//        }
        return answer;
    }
}
