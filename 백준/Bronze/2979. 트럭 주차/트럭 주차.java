import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] time = new int[100];

        int start, end, min = 0, max = 0;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            min = Math.min(min, start);
            max = Math.max(max, end);
            for(int k = start; k < end; k++) time[k]++;
        }

        for(int i = min; i < max; i++) {
            if(time[i] == 1) answer += time[i] * A;
            else if(time[i] == 2) answer += time[i] * B;
            else if(time[i] == 3) answer += time[i] * C;
        }

        System.out.println(answer);
    }
}
