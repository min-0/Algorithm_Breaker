import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int n, m;

        for (int t = 0; t < tc; t++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            Queue<int[]> q = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                q.add(new int[]{i, Integer.parseInt(st.nextToken())}); //index와 중요도 저장
            }

            int cnt = 0;
            while(!q.isEmpty()) {
                int [] current = q.poll();
                boolean isMax = true;

                for(int [] x : q) {
                    if(x[1] > current[1]) { //{index, importance} 중요도 비교
                        isMax = false;
                        break;
                    }
                }

                if(isMax) {
                    cnt++;
                    if(current[0] == m) break;
                }
                else q.add(current);
            }
            System.out.println(cnt);
        }
    }
}
