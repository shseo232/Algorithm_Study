import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun11659 {
	/*
	 *문제
	수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.

	입력	
	첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

	출력
	총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

	제한
	1 ≤ N ≤ 100,000
	1 ≤ M ≤ 100,000
	1 ≤ i ≤ j ≤ N

	 * 예제 입력 1 
		5 3
		5 4 3 2 1
		1 3
		2 4
		5 5
		예제 출력 1 
		12
		9
		1
	 */

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[Integer.parseInt(st.nextToken())];
		int[] sumNum = new int[num.length];
		int repeat = Integer.parseInt(st.nextToken());
//		System.out.println(repeat);
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<num.length;i++) {
				num[i] = Integer.parseInt(st.nextToken());
				if(i==0) {
					sumNum[i] = num[i];
				}else {
					sumNum[i] = sumNum[i-1] + num[i];
				}
		}
		int[][] result = new int[repeat][2];
		for(int i=0; i<result.length;i++) {
			st = new StringTokenizer(br.readLine());
			result[i][0] = Integer.parseInt(st.nextToken());
//			System.out.println(result[i][0]);
			result[i][1] = Integer.parseInt(st.nextToken());
//			System.out.println(result[i][1]);
		}
		for(int[]r : result) {
			int begin = r[0]-2<0? 0 : sumNum[r[0]-2];
			int end = sumNum[r[1]-1];
			System.out.println(end-begin);
		}
	}

}
