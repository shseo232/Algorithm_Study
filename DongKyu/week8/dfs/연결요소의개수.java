import java.util.*;
import java.io.*;

class Main {
    static HashMap<Integer, List<Integer>> map = new HashMap<>();
    static Set<Integer> visited = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); 
        int b = Integer.parseInt(st.nextToken()); 

        // 첫번째 입력값을 key로, 2번째 입력값을 value로 추가하는 map생성
        for (int i = 0; i < b; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int key = Integer.parseInt(st1.nextToken());
            int value = Integer.parseInt(st1.nextToken());


            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(value);


            if (!map.containsKey(value)) {
                map.put(value, new ArrayList<>());
            }
            map.get(value).add(key);
        }
        
        

        // 연결요소 cnt 변수 생성
        int connect = 0;

        
        for (int i = 1; i <= a; i++) {
            if (!visited.contains(i)) {
                dfs(i);
                connect++;
            }
        }

        System.out.println(connect);
    }

    // 각 키별 대응되는 value를 순차적으로 도는 dfs생성
    private static void dfs(int key) {
        visited.add(key);

        
        for (int value : map.getOrDefault(key,new ArrayList<>())) { // nullpointer exception을 대비한
            if (!visited.contains(value)) {
                dfs(value); // 인접 노드로 재귀 호출
            }
        }
    }
}
