import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS와BFS {

    static int N, M, V;

    static int arr [][];
    static boolean isVisit [];

    public void DFS(int V) {
        System.out.print(V + " ");
        isVisit [V] = true;

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
        System.out.print(V + " ");

        while (!q.isEmpty()) {
            V = q.poll();
            for(int i = 1; i <= N; i++) {
                if(arr[V][i] == 1 && !isVisit[i]) {
                    isVisit[i] = true;
                    q.add(i);
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        DFS와BFS m = new DFS와BFS();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        arr = new int[N + 1][N + 1];
        isVisit = new boolean[N + 1];
        int f, b;

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            f = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            arr[f][b] = 1;
            arr[b][f] = 1;
        }
        m.DFS(V);
        System.out.println();
        isVisit = new boolean[N + 1];
        m.BFS(V);
    }
}
