package inflearn.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 점수계산 {
    public int Solution(int n, int[] nArr) {
        int answer = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(nArr[i] == 1) {
                cnt++;
                answer += cnt;
                System.out.println(answer + " answer");
            }
            else cnt = 0;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        점수계산 m = new 점수계산();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int nArr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(m.Solution(n, nArr));
    }
}
