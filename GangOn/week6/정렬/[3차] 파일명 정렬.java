import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        
        List<String> list = new ArrayList<String>();
        
        for (String s : files) {
            list.add(s);
        }
        //compare메서드 Override
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
              
                String[] o1arr = splitFileName(o1);
                String[] o2arr = splitFileName(o2);
              
                //arr[0]은 Head, arr[1]은 number부분임
                if (!o1arr[0].equals(o2arr[0])) { //Head부분이 같지 않으면
                    return o1arr[0].compareTo(o2arr[0]); //Head를 기준으로 오름차순 정렬
                } else {
                    if (!o1arr[1].equals(o2arr[1])) { //number부분이 같지 않으면
                        return Integer.parseInt(o1arr[1]) - (Integer.parseInt(o2arr[1])); //number를 기준으로 오름차순 정렬
                    } else { //둘다 같으면
                        return 0; //정렬하지 않음(입력순서대로 리턴)
                    }
                }
            }
        });
        String[] answer = list.toArray(new String[list.size()]);
        
        return answer;
    }

    //파일명을 head, number, tail로 분리하는 메서드
    public static String[] splitFileName(String s) {
        String[] result = new String[3];
        String head = "";
        String number = "";
        String tail = "";

        int headIdx = 0;
        int numberIdx = 0;

        // Head 부분 추출
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) { //문자가 아닌 값(숫자)가 나올때까지 headIdx증가
                headIdx++;
            } else {
                numberIdx = headIdx; //Number부분의 시작인덱스를 headIdx로 지정
                head = s.substring(0, headIdx).toLowerCase();// 0부터 headIdx 전까지 추출, 대소문자 구분 없애기
                break;
            }
        }

        // Number 부분 추출
        for (int i = headIdx; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {//다음 문자(숫자가 아닌 값)이 나올때까지 numberIdx증가
                numberIdx++;
                if(numberIdx == s.length()) { //Number 부분이 전체 문자의 끝까지면(tail부분이 없으면)
                    number = s.substring(headIdx, numberIdx); //headIdx부터 numberIdx 전까지 추출
                    break;
                }
            } else { //tail부분이 있으면
                number = s.substring(headIdx, numberIdx); //headIdx부터 numberIdx 전까지 추출
                break;
            }
        }
        //Number 부분의 앞부분 0 없애기
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != '0') {
                number = number.substring(i, number.length());
                break;
            }
        }



        // Tail 부분 추출
        // tail = s.substring(numberIdx, s.length());

        result[0] = head;
        result[1] = number;
        // result[2] = tail;

        return result;
    }
}
