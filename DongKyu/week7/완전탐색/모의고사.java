import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[]a = {1,2,3,4,5};
        int[]b = {2,1,2,3,2,4,2,5};
        int[]c = {3,3,1,1,2,2,4,4,5,5};
        
        int[]check ={0,0,0};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<answers.length;i++){
            if(answers[i]==a[i%a.length]){
                check[0]++;
            }
            if(answers[i]==b[i%b.length]){//독립적으로 판단하기 위해 else if가 아닌 if로 표기
                check[1]++;
            }
            if(answers[i]==c[i%c.length]){
                System.out.println(i+"번째");
                check[2]++;
            }
        }
        
        int max = 0;
        for(int i =0; i<check.length;i++){
            if(check[i]>max){
                max=check[i];
            }
        }
        for(int i =0;i<check.length;i++){
            if(check[i]==max){
                list.add(i+1);
            }
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
