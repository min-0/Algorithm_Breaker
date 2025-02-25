import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        ArrayList<int[]> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken()) - 1;

            arr.add(new int[]{s, e});
        }
        arr.sort(Comparator.comparingInt(a -> a[0]));
        int answer = 0;
        int last = 0;

        for(int[] pool : arr) {
            int s = Math.max(last, pool[0]);
            int e = pool[1];

            if (s <= e) {
                int len = e - s + 1;
                int cnt = (len + l - 1) / l;
                answer += cnt;
                last = s + cnt * l;
            }
        }
        System.out.println(answer);
    }
}