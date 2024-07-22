import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        List<String> list = new ArrayList<>();

        for(int i : numbers) {
            list.add(String.valueOf(i));
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return (o2+o1).compareTo(o1+o2);

//                if(o1.charAt(0) != o2.charAt(0)) {
//                    return o2.charAt(0) - o1.charAt(0);
//                } else if (o1.length() > 1 && o2.length() > 1 && o1.charAt(1) != o2.charAt(1)){
//                    return o2.charAt(1) - o1.charAt(1);
//                } else if (o1.length() == 1 && o2.length() > 1 && o1.charAt(0) != o2.charAt(1)){
//                    return o2.charAt(1) - o1.charAt(0);
//                } else if (o1.length() > 1 && o2.length() == 1 && o1.charAt(1) != o2.charAt(0)){
//                    return o2.charAt(0) - o1.charAt(1);
//                } else if (o1.length() > 2 && o2.length() > 2 && o1.charAt(2) != o2.charAt(2)){
//                    return o2.charAt(2) - o1.charAt(2);
//                } else if (o1.length() == 2 && o2.length() > 2 && o1.charAt(1) != o2.charAt(2)){
//                    return o2.charAt(2) - o1.charAt(1);
//                } else if (o1.length() > 2 && o2.length() == 2 && o1.charAt(2) != o2.charAt(1)){
//                    return o2.charAt(1) - o1.charAt(2);
//                } else {
//                    return -1;
//                }

            }
        });
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }

        String answer = sb.toString();
        //원소가 모두 0인 경우 처리
        if (answer.charAt(0) == '0') {
            return "0";
        } else {
            return answer;
        }
    }
}
