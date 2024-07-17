import java.util.*;  

class Solution {
    public static int N = 0;  // 이동 횟수를 세기 위한 정적 변수
    public static ArrayList<Integer> list = new ArrayList<>();  // 이동 경로를 저장할 리스트
    
    // 주어진 n개의 원반을 1번 기둥에서 3번 기둥으로 옮기는 이동 경로를 반환하는 함수
    public int[][] solution(int n) {
        hanoi(n, 1, 3);  // 하노이 탑 함수 호출, 1번 기둥에서 3번 기둥으로 옮김(옮기고자 하는 숫자를 적으면 된다 
        
        int[][] answer = new int[N][2];  // 결과를 저장할 2차원 배열 선언
        
        int count = 0;  // 2차원 배열의 행 인덱스를 위한 변수
        int idx = 0;  // 2차원 배열의 열 인덱스를 위한 변수
        
        // 리스트의 모든 요소를 2차원 배열에 복사
        for (int i = 0; i < list.size(); i++) {
            answer[count][idx] = list.get(i);  // 리스트의 요소를 2차원 배열에 저장
            idx++;  // 다음 열로 이동
            if (idx == 2) {  // 열 인덱스가 2가 되면 다음 행으로 이동
                count++;
                idx = 0;  // 열 인덱스를 초기화
            }
        }
        return answer;  // 이동 경로를 담은 2차원 배열 반환
    }

    // 하노이 탑 알고리즘을 수행하는 재귀 함수
    public static void hanoi(int n, int x, int y) {
        N++;  // 이동 횟수 증가
        if (n > 1) {  // 원반이 1개 이상이면
            hanoi(n - 1, x, 6 - x - y);  // n-1개의 원반을 시작 기둥에서 보조 기둥으로 이동
        }
        list.add(x);  // 현재 이동의 시작 기둥을 리스트에 추가
        list.add(y);  // 현재 이동의 목표 기둥을 리스트에 추가
        if (n > 1) {  // 원반이 1개 이상이면
            hanoi(n - 1, 6 - x - y, y);  // n-1개의 원반을 보조 기둥에서 목표 기둥으로 이동
        }
    }
}
