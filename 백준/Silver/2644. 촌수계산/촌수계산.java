import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [][] arr;
    static boolean [] isVisit;
    static int N, M, a, b;
    static int answer = -1;
    public void DFS(int current, int cnt) {
        if(current == b) {
            answer = cnt;
            return;
        }
        isVisit[current] = true;

        for(int i =1; i <= N; i++) {
            if(!isVisit[i] && arr[current][i] == 1) {
                DFS(i, cnt+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(br.readLine());

        arr = new int[N+1][N+1];
        isVisit = new boolean[N+1];

        for(int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = arr[y][x] = 1;
        }

        m.DFS(a, 0);
        System.out.println(answer);
    }
}
