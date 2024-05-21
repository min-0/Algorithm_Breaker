import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());
        long [][] dp = new long [31][31];

        for (int t = 0; t < testCase; t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            if(N == 1) {
                System.out.println(M);
                continue;
            }
            if(N == M) {
                System.out.println(1);
                continue;
            }
            for (int i = 1; i <= 30; i++) {
                dp[i][i] = 1;
                for (int k = 1; k <= 30; k++) {
                    dp[1][k] = k;
                    dp[i][k] = dp[i - 1][k - 1] + dp[i][k - 1];
                }
            }
            System.out.println(dp[N][M]);
        }
    }
}
