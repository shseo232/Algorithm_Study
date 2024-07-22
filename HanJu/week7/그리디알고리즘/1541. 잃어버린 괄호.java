import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc =  new Scanner(System.in);
        String[] arr = sc.nextLine().split("-");
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
                String[] temp = arr[i].split("\\+");
                arr2[i] = 0;
                for(String s : temp){
//                    System.out.println(s);
                    arr2[i] += Integer.parseInt(s);
                }
        }
        int result = arr2[0];
        for(int i = 1; i < arr2.length; i++){
            result -= arr2[i];
        }
        System.out.println(result);
    }
}
// -를 기준으로 전부다 split해주고
// 남은 애들끼리 +가 있으면 다시 split해서 나눠서 더하고,
// 다 빼버리기
