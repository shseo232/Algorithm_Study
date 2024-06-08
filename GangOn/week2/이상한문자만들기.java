import java.util.Arrays;

class Solution {
    public String solution(String s) {
		String[] arr= s.split(" ", -1); //마지막 공백도 포함해서 split
		StringBuilder sb = new StringBuilder();
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length(); j++) {
				if(j % 2 == 0) {
					sb.append(String.valueOf(arr[i].charAt(j)).toUpperCase());
				} else {
					sb.append(String.valueOf(arr[i].charAt(j)).toLowerCase());
				}
			}
      //배열의 마지막 요소가 아니라면 공백 추가
			if (i < arr.length -1) {
				sb.append(" ");
			}
		}
		return sb.toString();
    }
}
