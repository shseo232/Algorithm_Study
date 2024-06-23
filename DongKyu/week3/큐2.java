import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();
        
        for (int i = 1; i < n+1; i++) {
        	String s = br.readLine();
        	String[] arr = s.split(" ");
        	String order = arr[0];
        	
        	if("push".equals(order)) {
        		q.push(Integer.parseInt(arr[1]));
        	}
        	else if("pop".equals(order)) {
        		if(q.isEmpty()) {
        			sb.append(-1).append("\n");
        		}
        		else {
        			sb.append(q.pollLast()).append("\n");//
        		}
        	}else if("size".equals(order)) {
        		sb.append(q.size()).append("\n");;
        	}else if("empty".equals(order)) {
        		if(q.isEmpty()) {
        			sb.append(1).append("\n");
        		}else {
        			sb.append(0).append("\n");
        		}
        	}else if("front".equals(order)) {
        		if(q.isEmpty()) {
        			sb.append(-1).append("\n");
        		}else {
        			sb.append(q.getLast()).append("\n");
        		}
        	}else if("back".equals(order)) {
        		if(q.isEmpty()) {
        			sb.append(-1).append("\n");
        		}else {
        			sb.append(q.getFirst()).append("\n");
        		}
        	}
        	
        }
        

        System.out.println(sb.toString());
    }
}
