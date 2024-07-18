import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        // Arrays.sort를 사용하여 files 배열을 정렬합니다.
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 첫 번째 파일 이름에서 HEAD 부분을 추출합니다.
                String head1 = s1.split("[0-9]")[0];
                // 두 번째 파일 이름에서 HEAD 부분을 추출합니다.
                String head2 = s2.split("[0-9]")[0];
                
                // HEAD 부분을 대소문자를 구분하지 않고 비교합니다.
                int compareHead = head1.toUpperCase().compareTo(head2.toUpperCase());
                
                // HEAD 부분이 동일한 경우 NUMBER 부분을 비교합니다.
                if(compareHead == 0) {
                    // HEAD 부분 이후의 문자열을 추출합니다.
                    s1 = s1.substring(head1.length());
                    s2 = s2.substring(head2.length());
                    
                    // 첫 번째 파일 이름에서 NUMBER 부분을 추출합니다.
                    String number1 = "";
                    for(char c : s1.toCharArray()) {
                        // 숫자인지 확인하고, 숫자 길이가 5 이하인지 확인합니다.
                        if(Character.isDigit(c) && number1.length() <= 5)
                            number1 += c;
                        else
                            break;
                    }
                    
                    // 두 번째 파일 이름에서 NUMBER 부분을 추출합니다.
                    String number2 = "";
                    for(char c : s2.toCharArray()) {
                        // 숫자인지 확인하고, 숫자 길이가 5 이하인지 확인합니다.
                        if(Character.isDigit(c) && number2.length() <= 5)
                            number2 += c;
                        else
                            break;
                    }
                    
                    // NUMBER 부분을 정수로 변환하여 비교합니다.
                    return Integer.parseInt(number1) - Integer.parseInt(number2);
                } else {
                    // HEAD 부분이 다르면 HEAD를 기준으로 정렬합니다.
                    return compareHead;
                }
            }
        });
        // 정렬된 files 배열을 반환합니다.
        return files;
    }
}
