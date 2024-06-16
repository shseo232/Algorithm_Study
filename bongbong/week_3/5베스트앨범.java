package week_3.베스트앨범;
// https://school.programmers.co.kr/learn/courses/30/lessons/42579

/*
스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.

속한 노래가 많이 재생된 장르를 먼저 수록합니다.
장르 내에서 많이 재생된 노래를 먼저 수록합니다.
장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.

제한사항
genres[i]는 고유번호가 i인 노래의 장르입니다.
plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
장르 종류는 100개 미만입니다.
장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
모든 장르는 재생된 횟수가 다릅니다.

입출력 예
genres	plays	return
["classic", "pop", "classic", "classic", "pop"]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]
 */

import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();

        // 장르별 곡-재생횟수를 담은 맵
        Map<String, Map<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            if (!map.containsKey(genres[i])) {
                map.put(genres[i], new HashMap<>());
                map.get(genres[i]).put(i, plays[i]);
            } else {
                map.get(genres[i]).put(i, plays[i]);
            }
        }

        // 먼저 출력할 장르 비교를 위한 맵
        // key: 장르, value: 장르별 재생횟수의 합
        Map<String, Integer> max_g = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            max_g.put(genres[i], max_g.getOrDefault(genres[i], 0) + plays[i]);
        }

        /* 오름차순 s1-s2>0 => s2, s1  내림차순 s2-s1>0 => s2,s1
                   s1-s2<0 => s1, s2         s2-s1<0 => s1,s2
         */

        List<String> lst = new ArrayList<>(max_g.keySet());
        Collections.sort(lst, (s1, s2) -> max_g.get(s2) - max_g.get(s1));

        for (String key : lst) {
            Map<Integer, Integer> map_temp = map.get(key);
            List<Integer> song_no = new ArrayList<>(map_temp.keySet()); // 곡번호가 담김

            Collections.sort(song_no, (s1, s2) -> map_temp.get(s2) - map_temp.get(s1));

            if (song_no.size() == 1) {
                answer.add(song_no.get(0));
            } else if (song_no.size() > 1) {
                answer.add(song_no.get(0));
                answer.add(song_no.get(1));
            }

        }

        return answer.stream().mapToInt(i -> i).toArray(); //stream 이용한 list -> arr 변환
    }
}
