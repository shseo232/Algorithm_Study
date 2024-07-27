class Solution {
    static int[] numArr;
    static int tarNum;
    static int answer;
    
    public int solution(int[] numbers, int target) {
        
        numArr = numbers;
        tarNum = target;
        answer = 0;

        dfs(0, 0);
        
        return answer;
    }
    
    public static void dfs(int depth, int sum) {
        //numArr의 마지막 수까지 탐색했을 때
        if(depth == numArr.length) {
            //그때까지의 합이 target과 같으면
            if(sum == tarNum) {
                //answer + 1
                answer++;
            }
            //dfs 종료
            return;
        }
        //깊이 1 증가, 현재까지의 합 + numbers[depth]의 값
        dfs(depth + 1, sum + numArr[depth]);
        //깊이 1 증가, 현재까지의 합 - numbers[depth]의 값
        dfs(depth + 1, sum - numArr[depth]);
    }
}
