import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int N, cnt;
    static int [][] arr;
    static boolean [][] isVisit;
    static int [] dx = {0, 1, 0, -1};
    static int [] dy = {1, 0, -1, 0};
    static ArrayList<Integer> answer = new ArrayList<>();
    public void DFS(int x, int y) {
        isVisit[x][y] = true;
        cnt++;

        for(int i = 0; i < 4; i++) {
            int moveX = dx[i] + x;
            int moveY = dy[i] + y;
            if(moveX < 0 || moveY < 0 || moveX >= N || moveY >= N) continue;
            if(isVisit[moveX][moveY] || arr[moveX][moveY] == 0) continue;
            DFS(moveX, moveY);
        }
    }
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        isVisit = new boolean[N][N];

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            for(int k = 0; k < N; k++) {
                arr[i][k] = str.charAt(k) - '0';
            }
        }

        for(int i = 0; i < N; i++) {
            for(int k = 0; k < N; k++) {
                if (!isVisit[i][k] && arr[i][k] == 1) {
                    cnt = 0;
                    m.DFS(i, k);
                    answer.add(cnt);
                }
            }
        }
        Collections.sort(answer);
        System.out.println(answer.size());
        for(int n : answer) System.out.println(n);
    }
}
