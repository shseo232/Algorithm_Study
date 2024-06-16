package week_3.귤고르기;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/138476
경화는 수확한 귤 중 'k'개를 골라 상자 하나에 담아 판매하려고 합니다.
그런데 수확한 귤의 크기가 일정하지 않아 보기에 좋지 않다고 생각한 경화는 귤을 크기별로 분류했을 때 서로 다른 종류의 수를 최소화하고 싶습니다.

예를 들어, 경화가 수확한 귤 8개의 크기가 [1, 3, 2, 5, 4, 5, 2, 3] 이라고 합시다. 경화가 귤 6개를 판매하고 싶다면,
크기가 1, 4인 귤을 제외한 여섯 개의 귤을 상자에 담으면,
귤의 크기의 종류가 2, 3, 5로 총 3가지가 되며 이때가 서로 다른 종류가 최소일 때입니다.

경화가 한 상자에 담으려는 귤의 개수 k와
귤의 크기를 담은 배열 tangerine이 매개변수로 주어집니다.
경화가 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값을 return

k	tangerine	result
6	[1, 3, 2, 5, 4, 5, 2, 3]	3
4	[1, 3, 2, 5, 4, 5, 2, 3]	2
2	[1, 1, 1, 1, 2, 2, 2, 3]	1
 */

import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int temp = 0;

        // key : 크기, value : 개수 (HashMap)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1); // 같은 key로 이미 put인 경우 value값 1 증가
        }
        // 내림차순 정렬 (Collection.sort)
        List<Integer> lst = new ArrayList<>(map.keySet());
        Collections.sort(lst, (s1, s2) -> map.get(s2) - map.get(s1));
        // k가 될떄까지 value 더함 + answer++ (for,if)
        for (int i = 0; i < lst.size(); i++) {
            if (temp < k) {
                temp += map.get(lst.get(i));
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}
