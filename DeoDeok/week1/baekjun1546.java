
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
 * 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.

	세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오
	
	첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 
	
	이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
 */
public class baekjun1546 {
	public  static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int N = Integer.parseInt(br.readLine());
	
	int score = 0;
	List<Double> list = new ArrayList();
	
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	for(int i = 0 ; i<N ; i++) {
		list.add(Double.parseDouble(st.nextToken()));
	}
	
	Collections.sort(list);
//    System.out.println(list);
	
	double M = list.get(list.size()-1);
	double avg =0;
	for(int i=0; i<list.size(); i++) {
		avg += list.get(i)/M*100;
	}
	System.out.println(avg/N);
	}
}
