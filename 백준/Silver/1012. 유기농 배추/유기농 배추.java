import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int M, N, K;
    static int [][] arr;
    static boolean [][] isVisit;
    static int [] dx = {0, 1, 0, -1};
    static int [] dy = {1, 0, -1, 0};

    public void DFS(int x, int y) {
        isVisit[x][y] = true;

        for(int i = 0; i < 4; i++) {
            int moveX = dx[i] + x;
            int moveY = dy[i] + y;

            if(moveX < 0  || moveY < 0 || moveX >= N || moveY >= M)  continue;
            if(isVisit[moveX][moveY] || arr[moveX][moveY] != 1) continue;

            DFS(moveX, moveY);
        }
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int answer;
        int testCase = Integer.parseInt(br.readLine());

        for(int t = 0; t < testCase; t++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            arr = new int[N][M];
            isVisit = new boolean[N][M];

            for(int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[y][x] = 1;  
            }
            answer = 0;
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if(!isVisit[i][j] && arr[i][j] == 1) {
                        m.DFS(i, j);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
