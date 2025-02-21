import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<ArrayList<Integer>> tree;
    static boolean isVisit[];
    static int parent[];
    static int n;
    public static void BFS(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        isVisit[v] = true;

        while (!q.isEmpty()) {
            v = q.remove();
            for(int i : tree.get(v)) {
                if(!isVisit[i]) {
                    isVisit[i] = true;
                    q.add(i);
                    parent[i] = v;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        tree = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        isVisit = new boolean[n + 1];
        parent = new int[n + 1];

        for(int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            tree.get(n1).add(n2);
            tree.get(n2).add(n1);
        }

        BFS(1);

        for(int i = 2; i < parent.length; i++) {
            System.out.println(parent[i]);
        }
    }
}