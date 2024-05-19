import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int [][] arr;
    static boolean [] isVisit;
    static int answer;

    public void DFS(int v) {
        isVisit[v] = true;
        answer++;
        for(int i = 1; i <= N; i++) {
            if(arr[v][i] == 1 && !isVisit[i]) {
                DFS(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        arr = new int[N+1][N+1];
        isVisit = new boolean[N+1];

        int u, v;

        for(int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            arr[u][v] = arr[v][u] = 1;
        }

        m.DFS(1);
        System.out.println(answer-1);

    }
}
