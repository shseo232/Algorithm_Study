public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = 0, e = 0, cnt=0, sum=0;

        while (n >= e) {
            if (n == sum) {
                cnt++;
                e++;
                sum += e;
            } else if (n > sum) {
                e++;
                sum += e;
            } else if (n<sum) {
                sum -= s;
                s++;
            }

        }
        System.out.println(cnt);
    }
}
