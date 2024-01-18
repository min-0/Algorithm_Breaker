package inflearn.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 등수구하기 {
    public int[] Solution(int[] nArr) {
        int cnt = 0;
        int[] answer = new int[nArr.length];
        for(int i = 0; i < nArr.length; i++) {
            cnt = 1;
            for(int j = 0; j< nArr.length; j++){
                if(nArr[i] < nArr[j]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException  {
        등수구하기 m = new 등수구하기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nArr[] = new int[n];
        for(int i = 0; i < n; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }
        for(int x : m.Solution(nArr)) System.out.print(x + " ");
    }
}
