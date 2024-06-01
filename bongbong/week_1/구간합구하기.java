package week_1.구간합구하기;
//P11720

import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String numbers = sc.next();
        sc.close();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(numbers.charAt(i)+"");
        }

        System.out.println(sum);



    }
}
