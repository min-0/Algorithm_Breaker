import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<ArrayList<int[]>> array;
    public static int prim(int n, int start, PriorityQueue<int[]> q) {
        boolean[] isVisit = new boolean[n + 1];
        q.add(new int[] {start, 1});

        int cnt = 0;
        while(!q.isEmpty()) {
            int[] current = q.poll();
            int node = current[0];
            int cost = current[1];

            if (isVisit[node]) continue;
            isVisit[node] = true;

            if (cost == 0) cnt++;
            for (int[] i : array.get(node)) {
                if(!isVisit[i[0]]) q.add(new int[] {i[0], i[1]});
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //건물 갯수
        int m = Integer.parseInt(st.nextToken()) + 1; //도로 갯수

        array = new ArrayList<>();

        for(int i = 0; i < n + 1; i++) {
            array.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cost  = Integer.parseInt(st.nextToken()); //0:오르막길, 1:내리막길
            array.get(a).add(new int[] {b, cost});
            array.get(b).add(new int[] {a, cost});
        }

        PriorityQueue<int[]> bestQ = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        int best = prim(n, 0, bestQ);
        PriorityQueue<int[]> worstQ = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        int worst = prim(n, 0, worstQ);
        System.out.println((int) (Math.pow(best, 2) - Math.pow(worst, 2)));
    }
}