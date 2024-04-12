import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 피보나치함수 {
    public void Solution (int fibo) {
        int arr0 [] = new int[41];
        int arr1 [] = new int[41];

        arr0[0] = 1;
        arr0[1] = 0;
        arr1[0] = 0;
        arr1[1] = 1;

        for(int i = 2; i <= 40; i++) {
            arr0[i] = arr0[i-1] + arr0[i-2];
            arr1[i] = arr1[i-1] + arr1[i-2];
        }

        System.out.println(arr0[fibo] + " " + arr1[fibo]);
    }

    public static void main(String[] args) throws IOException {
        피보나치함수 m = new 피보나치함수();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int fibo;

        for(int i = 0; i < n; i++) {
            fibo = Integer.parseInt(br.readLine());
            m.Solution(fibo);
        }
    }
}
