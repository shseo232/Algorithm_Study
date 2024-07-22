import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            for(int j = i+1; j < 5; j++) {
                for(int k = j+1; k < 5; k++) {
//                    System.out.println(arr[i] + " "+arr[j] +" "+ arr[k]);
                    list.add(LCM(arr[i], arr[j], arr[k]));
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }

    static int LCM(int a,int b, int c){
        int result = 0;

        int temp = 0;
        while(true){
            temp += a;
            if(temp % b ==0 && temp % c==0){
                result = temp;
                break;
            }


        }
//        System.out.println(result);
        return  result;
    }

}
//LCM함수는 a의 배수들로 b와c가 나눠떨어지는지 보고 최소공배수를 구함
//그렇기 위해서는 a가 항상 a,b,c중 최소여야함
//그래서 Arrays.sort(arr)를 해준거고,
//다섯개의 수 중 3개를 뽑는 모든 경우의 수에서 최소공배수를 구하고 list에 저장
//list를 정렬해서 0번 놈 출력
