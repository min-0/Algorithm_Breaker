
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        for (int i = 0; i < t; i++) {
            st =new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            Double[] arr = new Double[n];
            double[] result = new double[n];
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                arr[j] = Integer.parseInt(st.nextToken()) * 0.35 + Integer.parseInt(st.nextToken()) * 0.45 + Integer.parseInt(st.nextToken()) * 0.2;
            }
            double tmp = arr[k - 1];
            Arrays.sort(arr, Collections.reverseOrder());
            for (int j = 0; j < n; j++) {
                if (arr[j] == tmp) {
                    System.out.println("#" + (i + 1) + " " + grade[j / (n / 10)]);
                }
            }

        }
    }
}
