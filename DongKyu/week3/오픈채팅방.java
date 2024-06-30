import java.util.*;
import java.io.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<String, String>();
        List<String> list = new ArrayList<>();
        String[] answer = {};
        
        for(int i=0; i<record.length;i++){ // 애새기들 담는 map부터 생성
            String[]arr = record[i].split(" ");
            if(arr[0].startsWith("Enter")||arr[0].startsWith("Change")){
                map.put(arr[1],arr[2]);
            }
        }
        
        for(int i = 0; i<record.length;i++){
            String[]arr = record[i].split(" ");
            if(arr[0].startsWith("Enter")){
                list.add(map.get(arr[1])+"님이 들어왔습니다.");
            } else if (arr[0].startsWith("Leave")) {
                list.add(map.get(arr[1])+"님이 나갔습니다.");;
            }
        }
        answer = list.stream().toArray(String[]::new); // List<String> 타입 -> String[] 타입
        return answer;
    }
}
