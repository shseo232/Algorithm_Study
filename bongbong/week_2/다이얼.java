package week_2.다이얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.MarshalledObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    /*
    1 - 2
    2 - 3
    3 - 4
    4 - 5
    5 - 6
    6 - 7
    7 - 8
    8 - 9
    9 - 10
    0 - 11
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if ("A".equals(s.charAt(i) + "") || "B".equals(s.charAt(i) + "") || "C".equals(s.charAt(i) + "")) {
                sum += 3;
            } else if ("D".equals(s.charAt(i) + "") || "E".equals(s.charAt(i) + "") || "F".equals(s.charAt(i) + "")) {
                sum += 4;
            } else if ("G".equals(s.charAt(i) + "") || "H".equals(s.charAt(i) + "") || "I".equals(s.charAt(i) + "")) {
                sum += 5;
            } else if ("J".equals(s.charAt(i) + "") || "K".equals(s.charAt(i) + "") || "L".equals(s.charAt(i) + "")) {
                sum += 6;
            } else if ("M".equals(s.charAt(i) + "") || "N".equals(s.charAt(i) + "") || "O".equals(s.charAt(i) + "")) {
                sum += 7;
            } else if ("P".equals(s.charAt(i) + "") || "Q".equals(s.charAt(i) + "") || "R".equals(s.charAt(i) + "") || "S".equals(s.charAt(i) + "")) {
                sum += 8;
            } else if ("T".equals(s.charAt(i) + "") || "U".equals(s.charAt(i) + "") || "V".equals(s.charAt(i) + "")) {
                sum += 9;
            } else if ("W".equals(s.charAt(i) + "") || "X".equals(s.charAt(i) + "") || "Y".equals(s.charAt(i) + "") || "Z".equals(s.charAt(i) + "")) {
                sum += 10;
            }
        }

        System.out.println(sum);

    }
}
