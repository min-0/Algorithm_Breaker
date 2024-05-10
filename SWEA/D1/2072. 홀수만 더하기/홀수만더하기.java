package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 홀수만더하기 {
    public int Solution(int [] arr) {
        int answer = 0;

        for(int i = 0; i < 10; i++) {
            if(arr[i]%2 != 0) answer += arr[i];
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        홀수만더하기 m = new 홀수만더하기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String str;
        int [] arr = new int[10];

        for(int i = 0; i < t; i++) {
            str = br.readLine();
            st = new StringTokenizer(str);
            for(int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            System.out.println("#"+ (i+1) + " " + m.Solution(arr));
        }
    }
}
