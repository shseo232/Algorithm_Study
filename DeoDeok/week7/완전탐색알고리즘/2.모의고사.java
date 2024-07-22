import java.util.*;
class Solution {
    public List<Integer> solution(int[] answers) {
        int[] answer = {};
        List<Integer> list = new ArrayList();
        int[] check = new int[3];
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};    
        check[0] = cal(a,answers);
        check[1] = cal(b,answers);
        check[2] = cal(c,answers);
        int[] arr = {check[0],check[1],check[2]};
        Arrays.sort(arr);
        int max = arr[(arr.length)-1];
        for(int i=0; i<check.length; i++){
            if(max == check[i]){
                list.add(i+1);
            }
        }
        return list;
    }
    public int cal(int[] abc,int[] answers){
          int count =0;
           for(int i=0; i<answers.length;i++){
               if(i<abc.length){
                   if(abc[i] == answers[i]){
                       count++;
                   }
               }else{
                    if(abc[i%abc.length] == answers[i]){
                        count++;
                    }
               }
           }
         return count; 
        }
}
