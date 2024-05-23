import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static public void ac(String cmd, Deque<Integer> deque) {
        boolean reverse = false;

        for (int i = 0; i < cmd.length(); i++) {
            if (cmd.charAt(i) == 'R') {
                reverse = !reverse;
            }
            if (cmd.charAt(i) == 'D') {
                if (deque.isEmpty()) {
                    System.out.println("error");
                    return;
                }
                if(reverse) deque.removeLast();
                else deque.removeFirst();
            }
        }

        StringBuilder answer = new StringBuilder();
        answer.append("[");
        while (!deque.isEmpty()) {
            answer.append(reverse ? deque.removeLast() : deque.removeFirst());
            if (!deque.isEmpty()) answer.append(",");
        }
        answer.append("]");
        
        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String cmd = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            Deque<Integer> deque = new LinkedList<>();

            for (String s : str.substring(1, str.length() - 1).split(",")) {
                if(!s.equals("")) deque.add(Integer.valueOf(s));
            }
            ac(cmd, deque);
        }
    }
}