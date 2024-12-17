import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<int[]>> gr = new ArrayList<>();

        for(int i = 0; i <= v; i++) {
            gr.add(new ArrayList<>());
        }

        for(int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            gr.get(start).add(new int[] {end, weight});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[] {k, 0});
        int[] result = new int[v + 1];
        Arrays.fill(result, Integer.MAX_VALUE);
        result[k] = 0;

        while (!pq.isEmpty()) {
            int[] temp = pq.poll();
            for(int[] i : gr.get(temp[0])) {
                int distance = i[1] + result[temp[0]];
                if(distance < result[i[0]]) {
                    result[i[0]] = distance;
                    pq.add(new int[] {i[0], distance});
                }
            }
        }
        for(int i = 1; i < v + 1; i++) {
            if (result[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
                continue;
            }
            System.out.println(result[i]);
        }
    }
}