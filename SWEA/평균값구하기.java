package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균값구하기 {
    public int Solution (int [] arr) {
        float answer = 0;
        float sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += arr[i];
            answer = Math.round(sum/10);
        }

        return  (int)answer;
    }

    public static void main(String[] args) throws IOException {
        평균값구하기 m = new 평균값구하기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;
        int t = Integer.parseInt(br.readLine());
        int [] arr = new int[10];

        for(int i = 0; i < t; i++) {
            str = br.readLine();
            st = new StringTokenizer(str);
            for(int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            System.out.println("#" + (i+1) + " " + m.Solution(arr
            ));
        }

    }
}
