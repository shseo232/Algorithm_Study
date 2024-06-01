import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //자기 점수 중 최대값 M
        //모든 점수를 점수/M*100으로 고침

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] score = new double[N];
        double M = 0;
        double sum = 0;

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            if (M < score[i]) {
                M=score[i];
            }

        }

        for (int i = 0; i < N; i++) {
            score[i] = (score[i]/M)*100;
            sum += score[i];
        }

        sc.close();

        System.out.println(sum/N);

    }
}
