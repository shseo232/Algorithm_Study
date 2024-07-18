import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String temp1="";
        int N = numbers.length;

        String[] arr = new String[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr,(o1,o2)->(o2+o1).compareTo(o1+o2));
        //두번째 매개변수를 기준으로 정렬을 시킨다.
        //o2+o1 와 o1+o2를 비교하고
        StringBuilder br = new StringBuilder();
        for(String s : arr) {
    	    br.append(s);
        }
        if(br.toString().startsWith("0")) return "0";
        return br.toString();
    }
}
