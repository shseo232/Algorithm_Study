class Solution {
    public String solution(String new_id) {
        //1단계
    		new_id = new_id.toLowerCase();
    		
    		//2단계
    		StringBuilder sb = new StringBuilder(new_id);
    		int length = sb.length();
    		for(int i =0; i < length; i++) {
    			if(!((sb.charAt(i) >= 97 && sb.charAt(i) <= 122) //알파벳 소문자거나
    					|| (sb.charAt(i) >= 48 && sb.charAt(i) <= 57)
    					|| "-".equals(sb.charAt(i)+"") //"-"과 같거나
    					|| "_".equals(sb.charAt(i)+"") //"_"과 같거나
    					|| ".".equals(sb.charAt(i)+""))) { //"."과 같거나에 모두 해당하지 않으면
    				sb.deleteCharAt(i);
    				i--;
    				length--;
    			}
    		}
    
    		//3단계
    		for(int i =0; i < length-1; i++) {
    			//현재 문자가 .이고 다음 문자도. 이면 현재 문자를 지움
    			if(".".equals(sb.charAt(i)+"") && String.valueOf(sb.charAt(i)).equals(String.valueOf(sb.charAt(i+1)))) {
    				sb.deleteCharAt(i);
    				i--;
    				length--;
    			}
    		}
    		
    		//4단계
    		if(".".equals(sb.charAt(0)+"")) {
    			sb.deleteCharAt(0);
    			length--;
    		} 
    		if (length !=0 && ".".equals(sb.charAt(length-1)+"")) {
    			sb.deleteCharAt(length-1);
    			length--;
    		}
    		
    		//5단계
    		if(length == 0) {
    			sb.append("a");
    			length++;
    		}
    		
    		//6단계
    		if(length >= 16) {
    			sb.delete(15, length);
    			length = 15;
    		}
    		if(".".equals(sb.charAt(length-1)+"")) {
    			sb.deleteCharAt(length-1);
    			length--;
    		}
    		
    		//7단계
    		if(length <= 2) {
    			while(length < 3) {
    				System.out.println(length);
    				sb.append(sb.charAt(length-1));
    				length++;
    			}
        }
        return sb.toString();
    }
}
