class Solution {
    public String solution(String new_id) {
        String answer = "";

        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        answer = answer.replaceAll("[.]{2,}",".");
        answer = answer.replaceAll("^[.]|[.]$", "");
        
        //5
        if(answer.length()==0) {
			answer ="a";
		}
        //6
        if(answer.length()>=16) {
			answer = answer.substring(0,15);
			if(answer.endsWith(".")) {
				answer = answer.substring(0,14);
			}
		}
		else {
			if(answer.endsWith(".")) {
				answer = answer.substring(0,14);
			}
		}
        //7
        if(answer.length()==2) {
			for(int i =0; i< 1;i++) {
				answer += answer.charAt(1);
			}
		}

		else if(answer.length()==1) {
			for(int i =0; i< 2;i++) {
				answer += answer.charAt(0);
			}
		}
        
        return answer;
    }
}
