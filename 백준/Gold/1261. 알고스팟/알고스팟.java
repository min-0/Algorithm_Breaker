import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] miro;
    static int[] moveX = {1, 0, -1, 0};
    static int[] moveY = {0, -1, 0, 1};
    static int answer[][];
    public static int BFS() {
        Deque<Point> deque = new ArrayDeque<>();
        deque.add(new Point(0, 0));
        answer[0][0] = 0;

        while (!deque.isEmpty()) {
            Point p = deque.poll();
            int x = p.x, y = p.y;

            for (int i = 0; i < 4; i++) {
                int nextX = p.x + moveX[i];
                int nextY = p.y + moveY[i];

                if (nextX < 0 || nextY < 0 || nextX >= m || nextY >= n) continue;
                int broken = answer[x][y] + miro[nextX][nextY];
                if (broken < answer[nextX][nextY]) {
                    answer[nextX][nextY] = broken;
                    if (miro[nextX][nextY] == 0) deque.addFirst(new Point(nextX, nextY));
                    else deque.addLast(new Point(nextX, nextY));
                }
            }
        }
        return answer[m - 1][n - 1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        miro = new int[m][n];
        answer = new int[m][n];
        for (int i = 0; i < m; i++) Arrays.fill(answer[i], Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            for (int k = 0; k < n; k++) {
                miro[i][k] = str.charAt(k) - '0';
            }
        }
        System.out.println(BFS());
    }
}