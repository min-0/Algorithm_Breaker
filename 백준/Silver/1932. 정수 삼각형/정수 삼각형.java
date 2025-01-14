import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int first = Integer.parseInt(br.readLine());

        int[][] dp = new int[n][n + 1];
        for (int[] i : dp) Arrays.fill(i, -1);

        dp[0][1] = first;
        for(int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int k = 1; k <= n; k++) {
                if(st.hasMoreTokens()) dp[i][k] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i < n; i++) {
            for(int k = 1; k <= n; k++) {
                if(k != 1) dp[i][k] = Math.max(dp[i - 1][k] + dp[i][k], dp[i - 1][k - 1] + dp[i][k]);
                else {
                    dp[i][k] = dp[i - 1][k] + dp[i][k];
                }
            }
        }

        int answer = 0;
        for(int i = 0; i <= n; i++) {
            answer = Math.max(answer, dp[n - 1][i]);
        }
        System.out.println(answer);
    }
}