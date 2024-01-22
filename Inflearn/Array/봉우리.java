package inflearn.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 봉우리 {
    public int Solution(int[][] nArr) {
        int answer = 0;
        int temp;
        for(int i = 1; i < nArr.length; i++) {
            for(int j = 1; j < nArr.length; j++) {
                temp = nArr[i][j];
                if(temp > nArr[i-1][j] && temp > nArr[i][j-1] && temp > nArr[i][j+1] && temp > nArr[i+1][j]) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        봉우리 m = new 봉우리();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st ;
        String str;
        int[][] nArr = new int[n + 2][n + 2];

        for(int i = 1; i < n + 1; i++) {
            str = br.readLine();;
            st = new StringTokenizer(str);
            for(int j = 1; j < n + 1 ; j++) {
                nArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(m.Solution(nArr));
    }
}
