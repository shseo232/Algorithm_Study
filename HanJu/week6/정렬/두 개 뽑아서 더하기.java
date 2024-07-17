import java.io.*;
import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int N = numbers.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < N-1 ; i++){
            for(int j = i+1 ; j < N ; j++){
                int p = numbers[i] + numbers[j];
                if(!arr.contains(p)) arr.add(p);
            }
        }
        answer = arr.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
            
        
        return answer;
    }
}
