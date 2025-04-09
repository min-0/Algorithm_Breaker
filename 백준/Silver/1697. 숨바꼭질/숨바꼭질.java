import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, k;
    static int[] arr = new int[100001];
    static boolean[] isVisit = new boolean[100001];

    public static int BFS(int n) {
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        isVisit[n] = true;

        while(!q.isEmpty()) {
            int current = q.poll();

            if(current == k) return arr[k];

            int[] next = {current - 1, current + 1, current * 2};
            for(int i : next) {
                if(i >= 0 && i < arr.length && !isVisit[i]) {
                    q.add(i);
                    isVisit[i] = true;
                    arr[i] = arr[current] + 1;
                }
            }
        }

        return arr[k];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if (n == k) {
            System.out.println("0");
        } else {
            System.out.println(BFS(n));
        }
    }
}