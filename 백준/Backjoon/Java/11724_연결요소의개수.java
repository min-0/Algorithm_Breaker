import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 연결요소의개수 {

    static int arr[][];
    static boolean isVisit[];
    static int N;
    public void DFS(int V) {
        isVisit[V] = true;

        if(V > N) {
            return;
        }
        for(int i = 1; i <= N; i++) {
            if(arr[V][i] == 1 && !isVisit[i]) {
                DFS(i);
            }
        }
    }

    public void BFS(int V) {
        Queue<Integer> q = new LinkedList<>();
        q.add(V);
        isVisit[V] = true;

        while (!q.isEmpty()) {
            V = q.poll();
            for(int i = 1; i <= N; i++) {
                if(arr[V][i] == 1 && !isVisit[i]) {
                    q.add(i);
                    isVisit[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        연결요소의개수 m = new 연결요소의개수();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N + 1][N + 1];
        isVisit = new boolean[N + 1];

        int u, v;

        for(int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            arr[u][v] = 1;
            arr[v][u] = 1;
        }

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if(!isVisit[i]) {
                cnt++;
                m.BFS(i);
            }
        }
        System.out.println(cnt);
    }
}
