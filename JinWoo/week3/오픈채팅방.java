import java.util.*;

class Solution {
    public ArrayList<String> solution(String[] record) {

        ArrayList<String> list = new ArrayList<>();


        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < record.length; i++) {
            String[] arr = record[i].split(" ");

            if (!arr[0].equals("Leave")) {
                map.put(arr[1], arr[2]);
            }
        }

        for (int i = 0; i < record.length; i++) {
            String[] arr = record[i].split(" ");

            if (arr[0].equals("Enter")) {
                list.add(map.get(arr[1]) + "님이 들어왔습니다.");
            } else if (arr[0].equals("Leave")) {
                list.add(map.get(arr[1]) + "님이 나갔습니다.");
            }
        }
        return list;
    }
}
