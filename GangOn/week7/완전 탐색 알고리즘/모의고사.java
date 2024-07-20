import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        
        
        for(int i = 0; i < answers.length; i++) {
          int i1 = i % arr1.length;
          int i2 = i % arr2.length;
          int i3 = i % arr3.length;
          
          if (arr1[i1] == answers[i]) {
            score1++;
          }
          if (arr2[i2] == answers[i]) {
            score2++;
          }
          if (arr3[i3] == answers[i]) {
            score3++;
          }
        }
        
        int[] scores = {score1 ,score2, score3};
        int[] scoresCopy = scores.clone();
        Arrays.sort(scoresCopy);
        int max = scoresCopy[scoresCopy.length-1];
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
          if (scores[i] == max) {
            list.add(i+1);
          }
        }
        
        return list.stream().mapToInt(i->i).toArray();
        
    }
}
