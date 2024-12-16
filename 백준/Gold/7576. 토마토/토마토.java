import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] box;
    static boolean[][] isVisit;
    static int n, m;
    static int[] moveX = {-1, 0, 1, 0};
    static int[] moveY = {0, 1, 0, -1};
    static Queue<int[]> q = new LinkedList<>();

    static int BFS() {
        int answer = 0;

        while (!q.isEmpty()) {
            int[] p = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = p[0] + moveX[i];
                int nextY = p[1] + moveY[i];
                if (nextX < n && nextY < m && nextX >= 0 && nextY >= 0) {
                    if (!isVisit[nextX][nextY] && box[nextX][nextY] == 0) {
                        q.add(new int[]{nextX, nextY});
                        isVisit[nextX][nextY] = true;
                        box[nextX][nextY] = box[p[0]][p[1]] + 1;
                        answer = box[nextX][nextY];
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        box = new int[n][m];
        isVisit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < m; k++) {
                box[i][k] = Integer.parseInt(st.nextToken());
                if (box[i][k] == 1) {
                    isVisit[i][k] = true;
                    q.add(new int[]{i, k});
                }
            }
        }
        int answer = BFS();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                if (box[i][k] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        if (answer == 0) {
            System.out.println(0);
        } else {
            System.out.println(answer - 1);
        }
    }
}