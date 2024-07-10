import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static  int I, currentX, currentY, goalX, goalY;
    static int [][] chess;
    static int [] dx = {-2, -2, -1, 1, 2, 2, 1, -1};
    static int [] dy = {-1, 1, 2, 2, 1, -1, -2, -2};
    static boolean [][] isVisit;

    public static int BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));

        while(!queue.isEmpty()) {
            Point p = queue.poll();
            if(p.x == goalX && p.y == goalY) {
                return chess[p.x][p.y];
            }
            for(int i = 0; i < 8; i++) {
                int moveX = dx[i] + p.x;
                int moveY = dy[i] + p.y;

                if(moveX < 0  || moveY < 0 || moveX >= I || moveY >= I)  continue;
                if(isVisit[moveX][moveY]) continue;

                queue.add(new Point(moveX, moveY));
                chess[moveX][moveY] = chess[p.x][p.y] + 1;
                isVisit[moveX][moveY] = true;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++ ) {
            I = Integer.parseInt(br.readLine());
            chess = new int[I][I];
            isVisit = new boolean[I][I];

            st = new StringTokenizer(br.readLine());
            currentX = Integer.parseInt(st.nextToken());
            currentY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            goalX = Integer.parseInt(st.nextToken());
            goalY = Integer.parseInt(st.nextToken());

            System.out.println(BFS(currentX, currentY));
        }
    }
}
