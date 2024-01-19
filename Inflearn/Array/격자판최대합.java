package inflearn.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 격자판최대합 {
    public int Solution(int n, int[][] nArr) {
        int sum, sum2 ;
        int answer = 0;

        for(int i = 0; i < n; i++) { //가로, 세로 최대
            sum = sum2 = 0;
            for(int j = 0; j < n ; j++) {
                sum += nArr[i][j];
                sum2 += nArr[j][i];
            }
            answer = Math.max(answer, sum);
            answer = Math.max(answer, sum2);
        }
        sum = sum2 = 0;
        for(int i = 0; i < n; i++) { //대각선, 역대각선 최대
            sum += nArr[i][i];
            sum2+= nArr[i][n-i-1];
        }
        answer = Math.max(answer, sum);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        격자판최대합 m = new 격자판최대합();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String str;
        int[][] nArr = new int[n][n];

        for(int i = 0; i < n; i++) {
            str = br.readLine();
            st = new StringTokenizer(str);
            for(int j = 0; j< n; j++) {
                nArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(m.Solution(n, nArr));
    }
}
