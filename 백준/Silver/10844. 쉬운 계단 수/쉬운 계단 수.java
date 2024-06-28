import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long answer = 0;

        long[][] dp = new long[n + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i < n + 1; i++) {
            for (int k = 1; k < 9; k++) {
                dp[i][0] = dp[i - 1][1];
                dp[i][9] = dp[i - 1][8];
                dp[i][k] = (dp[i - 1][k - 1] + dp[i - 1][k + 1])%1000000000L;
            }
        }

        for (int i = 1; i < 10; i++) {
            answer += dp[n][i];
        }

        System.out.println(answer%1000000000L);
    }
}