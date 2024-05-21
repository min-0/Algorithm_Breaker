import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int k, n;
    static public int DP(int [][] dp) {
        for(int i = 1; i <= n; i++) {
            dp[0][i] = i;
        }

        for(int i  = 1; i <= k; i++) {
            for(int j = 1; j <= n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[k][n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int t = 0; t < testCase; t++) {
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            int [][] apt = new int[k + 1][n + 1];

            System.out.println(DP(apt));
        }
    }
}
