import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visited;
    static Map<Integer, ArrayList<Integer>> map;
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        map = new HashMap<Integer, ArrayList<Integer>>();
//        visited = new boolean[n+1];
        for(int i=1; i<=n; i++){
            map.put(i, new ArrayList<Integer>());
        }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map.get(a).add(b);
            map.get(b).add(a);
        }
        for(int i: map.keySet()){
            Collections.sort(map.get(i));
        }
        visited = new boolean[n+1];
        dfs(v);
        for(int i  : list){
            System.out.print(i+" ");
        }
        System.out.println();
        visited = new boolean[n+1];
        list = new ArrayList<>();
        bfs(v);
        for(int i  : list){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void dfs(int i) {
        visited[i] = true;
        if(!list.contains(i)) {
            list.add(i);
        }
        for(int j: map.get(i)){
            if(!visited[j]) {
                dfs(j);
            }
        }
    }
    static void bfs(int i) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        visited[i] = true;
        while(!q.isEmpty()) {
            int v = q.poll();
            list.add(v);
            for(int j: map.get(v)) {
                if(!visited[j]) {
                    visited[j] = true;
                    q.offer(j);
                }
            }
        }

    }
    }

