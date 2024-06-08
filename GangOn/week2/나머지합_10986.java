import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		//구간합 배열 생성
		long[] prefixSum = new long[n+1];
    
		//나머지 값의 개수 저장하는 배열 생성
    //remainCount의 인덱스: prefixSum을 m으로 나눈 나머지
    //remainCount의 값: prefixSum을 m으로 나눈 나머지(=인덱스)의 개수
		long[] remainCount = new long[m];
		
		st = new StringTokenizer(br.readLine());
		
    //구간합 구하고 구간합을 m으로 나눈 나머지와 같은 remainCount의 인덱스의 값을 +1
		for(int i = 1; i <= n; i++) {
			prefixSum[i] = prefixSum[i-1] + Integer.parseInt(st.nextToken());
			remainCount[(int) (prefixSum[i] % m)]++;
		}
	    
    //처음부터 n까지의 구간합을 나눈 나머지가 0인 경우 먼저 카운트
		long result = remainCount[0];
    //나머지의 개수가 같은 구간합들의 조합 구하기
		for(int i = 0; i < remainCount.length; i++) {
			if(remainCount[i] > 1) {
				result += remainCount[i] * (remainCount[i] - 1) / 2;
			}
		}
		System.out.println(result);
	}
}
