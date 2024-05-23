import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Deque<Integer> deque = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("push_front")) {
                int x = Integer.parseInt(st.nextToken());
                deque.addFirst(x);
            } else if (cmd.equals("push_back")) {
                int x = Integer.parseInt(st.nextToken());
                deque.addLast(x);
            } else if (cmd.equals("pop_front")) {
                if (!deque.isEmpty()) System.out.println(deque.pollFirst());
                else System.out.println(-1);
            } else if (cmd.equals("pop_back")) {
                if (!deque.isEmpty()) System.out.println(deque.pollLast());
                else System.out.println(-1);
            }
            else if (cmd.equals("size")) System.out.println(deque.size());
            else if (cmd.equals("empty")) {
                if (deque.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if (cmd.equals("front")) {
                if (!deque.isEmpty()) System.out.println(deque.peekFirst());
                else System.out.println(-1);
            } else if (cmd.equals("back")) {
                if (!deque.isEmpty()) System.out.println(deque.peekLast());
                else System.out.println(-1);
            }
        }
    }
}
