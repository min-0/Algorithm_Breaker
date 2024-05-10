package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 중간값찾기 {
    public int Solution (int n, int [] arr) {
        int answer = 0;
        Arrays.sort(arr);
        answer = arr[arr.length/2];

        return answer;
    }

    public static void main(String[] args) throws IOException {
        중간값찾기 m = new 중간값찾기 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(m.Solution(n, arr));
    }
}
