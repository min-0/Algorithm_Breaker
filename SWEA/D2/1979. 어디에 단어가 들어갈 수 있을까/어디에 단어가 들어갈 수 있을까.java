import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public int Solution(int [][] arr, int K) {
        int answer = 0;
        int N = arr.length;
        //가로
        for (int i = 0; i < N; i++) {
            int col = 0;
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1) col++;
                else {
                    if (col == K) answer++;
                    col = 0;
                }
            }
            if (col == K) answer++;
        }

        // 세로
        for (int j = 0; j < N; j++) {
            int row = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i][j] == 1) row++;
                else {
                    if (row == K) answer++;
                    row = 0;
                }
            }
            if (row == K) answer++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution m = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());

        for(int t = 0; t < testCase; t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int [][] arr = new int[N][N];

            for(int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < N; k++) {
                    arr[i][k] = Integer.parseInt(st.nextToken());
                }
            }
            System.out.println("#" + (t+1) + " " + m.Solution(arr, K));
        }
    }
}
