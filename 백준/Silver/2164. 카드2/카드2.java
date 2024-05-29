import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> d = new ArrayDeque<>();

        for(int i = 1; i <= n; i++) d.offer(i);

        while (d.size() != 1) {
            d.pollFirst();
            d.offerLast(d.pollFirst());
        }
        System.out.println(d.poll());
    }
}
