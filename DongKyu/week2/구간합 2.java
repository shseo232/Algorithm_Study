import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int arr[][] = new int[a + 1][a + 1];
		int[][] sum_arr = new int[a + 1][a + 1];
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= a; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for (int j = 1; j <= a; j++) {
				arr[i][j] = Integer.parseInt(st1.nextToken()); // 표본 배열 완성
			}
		}

		for (int i = 1; i < sum_arr.length; i++) {
			for (int j = 1; j < sum_arr.length; j++) {
				if (j == 0) {
					sum_arr[i][j] = 0;
				} else if (j == 1) {
					sum_arr[i][j] = arr[i][j];
				} else {
					sum_arr[i][j] = arr[i][j] + sum_arr[i][j - 1]; // 누적합 배열 완성
				}
			}
		}

		for (int i = 0; i < b; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int sum = 0;
			int x1 = Integer.parseInt(st1.nextToken());
			int y1 = Integer.parseInt(st1.nextToken());
			int x2 = Integer.parseInt(st1.nextToken());
			int y2 = Integer.parseInt(st1.nextToken());

			for (int j = x1; j <= x2; j++) {
				sum += sum_arr[j][y2] - sum_arr[j][y1 - 1];
			}
			sb.append(sum + "\n");
		}
		System.out.print(sb);
	}

}
