package inflearn.Array;

import java.io.*;

public class 피보나치수열 {
    public int[] Solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for(int i = 2;  i <n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        피보나치수열 m = new 피보나치수열();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int x : m.Solution(n)) System.out.print( x+ " ");
    }
}
