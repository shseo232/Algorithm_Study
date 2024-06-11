class Solution {
    public String solution(String new_id) {
         String answer = "";
	        //1번쨰
	        new_id = new_id.toLowerCase();
	        //2번쨰
	        new_id = new_id.replaceAll("[^a-z0-9-_.]","");
	        //3번째
	        new_id = new_id.replaceAll("\\.{2,}", ".");
	        //4번째
	        new_id = new_id.replaceAll("^[.]", "");
	        new_id = new_id.replaceAll("[.]$", "");
	        
	        //5번쨰
	        if ("".equals(new_id)) new_id = "a";

	        //6번쨰
	        if (new_id.length() >= 16) {
	            new_id = new_id.substring(0,15);
	        }
	        // 끝에 한번 더 체크
	        new_id = new_id.replaceAll("[.]$", "");
	        
	        // 7단계
	        while (new_id.length() < 3) {
	            new_id += new_id.substring(new_id.length()-1);
	        }
	        answer = new_id;   
        return answer;
    }
}
