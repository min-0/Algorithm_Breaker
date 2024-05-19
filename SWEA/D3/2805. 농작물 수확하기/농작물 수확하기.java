import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public int Solution(int[][] arr) {
        int answer = 0;
        int N = arr.length;

        for(int i = 0; i < N; i++) {
            int start = Math.abs(N/2 - i);
            int end = N - start;
            for(int k = start; k < end; k++) {
                answer+=arr[k][i];
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Solution m = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int t = 0; t < testCase; t++) {
            int N = Integer.parseInt(br.readLine());
            int [][] arr = new int[N][N];
            for(int i = 0; i < N; i++) {
                String str = br.readLine();
                for(int k = 0; k < N; k++) {
                    arr[i][k] = str.charAt(k) - '0';
                }
            }
            System.out.println("#" + (t+1) + " " + m.Solution(arr));
        }
    }
}
