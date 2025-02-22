import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println((int)Math.pow(2, n) - 1);
        hanoi(n, 1, 2, 3);
        System.out.println(sb);
    }

    public static void hanoi(int n, int s, int m, int e) {
        if(n == 1) {
            sb.append(s + " " + e + "\n");
            return;
        }

        hanoi(n - 1, s, e, m);
        sb.append(s + " " + e + "\n");
        hanoi(n - 1, m, s, e);
    }
}