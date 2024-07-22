import java.io.*;
import java.util.*;
class Solution {
    public List<Integer> solution(int[] answers) {

        int[] A = {1,2,3,4,5};
        int[] B = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] C = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] correct = new int[3];
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == A[i%5]) {correct[0]++;}
            if(answers[i] == B[i%8]) {correct[1]++;}
            if(answers[i] == C[i%10]) {correct[2]++;}
        }
//        for(int i: correct){
//            System.out.print(i+" ");
//        }
        int max = 0;
        for(int i : correct){
            if(i > max) max = i;
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i<3;i++){
            if(correct[i]==max){result.add(i+1);}
        }
        
        
        
        return result;
    }
}
