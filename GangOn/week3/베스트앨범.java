import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        //장르별 재생횟수 구하기
				Map<String, Integer> map = new HashMap<>();
				for (int i = 0; i < genres.length; i++) {
					map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]);
					
				}
				System.out.println(map.values());
				
				//재생횟수로 정렬
				List<Integer> valuelist = new ArrayList<>(map.values());
				List<String> genrelist = new ArrayList<>();
				Collections.sort(valuelist, Collections.reverseOrder());
				System.out.println(valuelist);
				
				//정렬된 재생횟수로 가장 많이 재생된 장르 순서 구하기
				for (int i : valuelist) {
					for(String s : map.keySet()) {
						if(map.get(s) == i) {
							genrelist.add(s);
						}
					}
				}
				System.out.println(genrelist);
				
				
				List<Integer> returnlist = new ArrayList<>();
		    //가장 많이 재생된 장르부터 담기
				for (String s : genrelist) {
					
					int firstplay = -1; //가장 많이 재생된 재생횟수
					int secondplay = -1; //두번째로 많이 재생된 재생횟수
					int firstidx = 0; //가장 많이 재생된 노래의 고유번호
					int secondidx = 0; //두번째로 많이 재생된 노래의 고유번호
					
		      //같은 장르 내에서 재생횟수 top2의 고유번호 구하기
					for (int i = 0; i < genres.length; i++) {
						if(genres[i].equals(s) && plays[i] > secondplay) {
							secondplay =  plays[i];
							secondidx = i;
							if(plays[i] > firstplay) {
								secondplay = firstplay;
								secondidx = firstidx;
								firstplay = plays[i];
								firstidx = i;
							}
						}
					}
					
		      //장르에 속한 곡이 하나라면 firstidx만 담음
					if (secondplay == -1) {
						returnlist.add(firstidx);
					} else {
						returnlist.add(firstidx);
						returnlist.add(secondidx);
					}
					
				}
				System.out.println(returnlist);
				int[] answer = returnlist.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}
