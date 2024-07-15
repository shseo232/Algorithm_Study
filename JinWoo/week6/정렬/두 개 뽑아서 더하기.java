import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        Arrays.sort(numbers);
        HashSet<Integer>set = new HashSet<>();
        
        for(int i = 0 ; i<numbers.length -1 ; i++){
            for(int j = i+1; j<numbers.length; j++){
                int result = numbers[i] + numbers[j];
                set.add(result);
            }
        }
        
        int [] answer = new int [set.size()];
        
        ArrayList<Integer>list = new ArrayList<>(set);
        
        Collections.sort(list);
        
        for(int i = 0  ;i<answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}

// set은 정렬이 자동으로 안되는 걸 까먹음 운좋게 테스트케이스가 정렬되는 문제였다.
// import java.util.*;

// class Solution {
//     public int[] solution(int[] numbers) {
        
//         Arrays.sort(numbers);
//         HashSet<Integer>set = new HashSet<>();
        
//         for(int i = 0 ; i<numbers.length -1 ; i++){
//             for(int j = i+1; j<numbers.length; j++){
//                 int result = numbers[i] + numbers[j];
//                 set.add(result);
//             }
//         }
        
//         int [] answer = new int [set.size()];
        
//         Iterator<Integer> ite = set.iterator();
        
//         for(int i = 0  ;i<answer.length; i++){
//             answer[i] = ite.next();
//         }

//         return answer;
//     }
// }
