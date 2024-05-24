import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
            if (this.end == o.end) return this.start - o.start;
            else return this.end - o.end;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Time [] arr = new Time[n];
        int answer = 0;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int  e = Integer.parseInt(st.nextToken());
            arr[i] = new Time(s, e);
        }

        Arrays.sort(arr);
        int time = 0;
        for(Time i : arr) {
            if(time <= i.start) {
                time = i.end;
                answer++;
            }
        };
        System.out.println(answer);
    }
}
