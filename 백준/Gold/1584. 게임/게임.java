import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] game = new int[501][501];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n, m;
    static boolean isVisit[][] = new boolean[501][501];

    public static int BFS() {
        Queue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        q.add(new int[] {0, 0, 0});
        isVisit[0][0] = true;
        int result;

        while(!q.isEmpty()) {
            int[] temp = q.poll();
            result = temp[2];
            for(int i = 0; i < 4; i++) {
                int moveX = dx[i] + temp[0];
                int moveY = dy[i] + temp[1];
                if(moveX >= 0 && moveX <= 500 && moveY >= 0 && moveY <= 500) {
                    if(!isVisit[moveX][moveY] && game[moveX][moveY] != 2) {
                        isVisit[moveX][moveY] = true;
                        game[moveX][moveY] += result;
                        q.add(new int[] {moveX, moveY, game[moveX][moveY]});
                    }
                }
            }
        }

        return game[500][500];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x1, y1, x2, y2;

        n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            for(int k = Math.min(y1, y2); k <= Math.max(y1, y2); k++) {
                for(int j = Math.min(x1, x2); j <= Math.max(x1, x2); j++) {
                    game[k][j] = 1;
                }
            }
        }

        m = Integer.parseInt(br.readLine());
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            for(int k = Math.min(y1, y2); k <= Math.max(y1, y2); k++) {
                for(int j = Math.min(x1, x2); j <= Math.max(x1, x2); j++) {
                    game[k][j] = 2;
                }
            }
        }
        int answer = BFS();

        System.out.println(isVisit[500][500] ? answer : -1);
    }
}