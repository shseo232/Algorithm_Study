class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n+1];
        arr[0] = 0;//0번 학생은 존재x (생략해도댐)
        for(int i = 1; i <= n; i++){
            arr[i] = 1;
        }
        for(int i : lost){
            arr[i] -=1;
        }
        for(int i : reserve){
            arr[i] +=1;
        }
        for(int i = 1; i < n;i++){
            if(arr[i] == 0){
                if(arr[i-1] == 2){
                    arr[i] = 1;
                    arr[i-1] = 1;
                }else if(arr[i+1] == 2){
                    arr[i] = 1;
                    arr[i+1] = 1;
                }
            }
        }
        if(arr[n] == 0 && arr[n-1] == 2){
            arr[n] = 1;
            arr[n-1] = 1;
        }
        for(int i : arr){
            if(i!=0){answer++;}
        }
        return answer;
    }
}
//전체 애들 리스트를 만들고 0:없는놈 1:한개가진놈 2:2개가진놈
//일단 여벌이 있는 애들이 도난 당한 경우를 리스트에 업데이트
// lost 배열에서 자신의 앞->뒤 순으로 체크해서 빌려오기
