import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int back = 0;
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if(cmd.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                back = x;
                q.add(x);
            }
            else if(cmd.equals("pop")) {
                if(q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(q.poll()).append("\n");
            }
            else if(cmd.equals("size")) {
                sb.append(q.size()).append("\n");
            }
            else if(cmd.equals("empty")) {
                if(q.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
            else if(cmd.equals("front")) {
                if(q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(q.peek()).append("\n");
            }
            else if(cmd.equals("back")) {
                if(q.isEmpty()) sb.append(-1).append("\n");
                else sb.append(back).append("\n");
            }
        }
        System.out.println(sb);
    }
}
