import java.util.*;

class Solution {
    public static int[] answer = new int[2];

    public int[] solution(int[][] arr) {
        quad(arr, 0, 0, arr.length);
        return answer;
    }

    public void quad(int[][] arr, int x, int y, int size) {
        if (check(arr, x, y, size)) { // 같은수라는건 +1만 하면된다 결과적으로  
            if (arr[x][y] == 1) {
                answer[1]++;
            } else {
                answer[0]++;
            }
            return;
        }

        //압축하는 과정 
        int newSize = size / 2;
        quad(arr, x, y, newSize);
        quad(arr, x, y + newSize, newSize);
        quad(arr, x + newSize, y, newSize);
        quad(arr, x + newSize, y + newSize, newSize);
    }

    //같은 수인지 아닌지 판단 
    public static boolean check(int[][] arr, int x, int y, int size) {
        int value = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != value) {
                    return false;  // 같은 수가 아니라고 판단
                }
            }
        }
        return true;  // 같은수라고 판단
    }
}
