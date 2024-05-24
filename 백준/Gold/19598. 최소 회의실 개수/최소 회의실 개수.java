import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static class Time implements Comparable<Time> {
        int start, end;

        Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Time o) {
            if (this.start == o.start) return this.end - o.end;
            else return this.start - o.start;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Time[] arr = new Time[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[i] = new Time(s, e);
        }

        Arrays.sort(arr);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(arr[0].end);

        for (int i = 1; i < n; i++) {
            if (pq.peek() <= arr[i].start) pq.poll();
            pq.add(arr[i].end);
        }

        System.out.println(pq.size());
    }
}