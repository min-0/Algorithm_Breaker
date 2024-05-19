import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색 {
    static int arr[][];
    static boolean isVisit[][];
    static int N, M;
    static int[] moveX = {0, 0, 1, -1};
    static int[] moveY = {1, -1, 0, 0};

    public void Solution(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));

        while (!q.isEmpty()) {
            Point p = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = p.x + moveX[i];
                int nextY = p.y + moveY[i];
                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) continue;
                if (isVisit[nextX][nextY] || arr[nextX][nextY] == 0) continue;
                q.add(new Point(nextX, nextY));
                isVisit[nextX][nextY] = true;
                arr[nextX][nextY] = arr[p.x][p.y] + 1;
            }
        }
        System.out.println(arr[N - 1][M - 1]);

    }

    public static void main(String[] args) throws IOException {
        미로탐색 m = new 미로탐색();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        isVisit = new boolean[N][M];
        String str;

        for (int i = 0; i < N; i++) {
            str = br.readLine();
            for (int k = 0; k < M; k++) {
                arr[i][k] = str.charAt(k) - '0';
            }
        }
        isVisit[0][0] = true;

        m.Solution(0, 0);

        for(int i = 0; i < N; i++) {
            for(int k = 0; k < M; k++) {
                if(isVisit[i][k]) System.out.print(arr[i][k]);
                else System.out.print(0);
            }
            System.out.println();
        }
    }
}
