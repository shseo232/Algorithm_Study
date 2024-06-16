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
            }else {
            map.get(genres[i]).put(i, plays[i]);}
        }

        // 먼저 출력할 장르 비교를 위한 맵
        // key: 장르, value: 장르별 재생횟수의 합
        Map<String, Integer> max_g = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            max_g.put(genres[i], max_g.getOrDefault(genres[i],0)+plays[i]);
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
