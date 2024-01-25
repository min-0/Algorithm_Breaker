package inflearn.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 임시반장정하기 {
    public int Solution(int n, int[][] nArr) {
        int answer = 0;
        int max = 0;
        int cnt;
        
        for(int i = 0; i < n; i++) {
            cnt = 0;
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < 5; k++) {
                    if(nArr[i][k] == nArr[j][k]) {
                        cnt++;
                        break;
                    }
                }
                if(cnt>max) {
                    max = cnt;
                    answer = i+1;
                }
            }
        }
// i번째 학생과 j 학생이 k학년에 같은 반이었는지 확인하여 cnt 해줌
        return answer;
    }

    public static void main(String[] args) throws IOException {
        임시반장정하기 m = new 임시반장정하기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String str;

        int [][] nArr = new int[n][5];

        for(int i = 0; i < n; i++) {
            str = br.readLine();
            st = new StringTokenizer(str);
            for(int j = 0; j < 5; j++) {
                nArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(m.Solution(n, nArr));
    }
}
