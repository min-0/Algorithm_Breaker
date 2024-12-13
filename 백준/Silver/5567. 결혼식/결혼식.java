import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int arr[][];
    static boolean isVisit[];

    static public int BFS(int v, int cnt) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        isVisit[v] = true;

        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!q.isEmpty()) {
            int size = q.size();
            cnt++;

            if (cnt > 2) break;

            for (int i = 0; i < size; i++) {
                int current = q.poll();

                for (int j = 1; j <= n; j++) {
                    if (arr[current][j] == 1 && !isVisit[j]) {
                        isVisit[j] = true;
                        q.add(j);
                        arrayList.add(j);
                    }
                }
            }
        }
        return arrayList.size();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        arr = new int[n + 1][n + 1];
        isVisit = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[f][b] = 1;
            arr[b][f] = 1;
        }

        System.out.println(BFS(1, 0));
    }
}