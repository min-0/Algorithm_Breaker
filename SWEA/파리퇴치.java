import java.util.Scanner;

public class 파리퇴치 {
    public int Solution(int[][] intArr, int M, int N) {
        int result = 0;
        int sum = 0;
        int i = 0, j = 0, k = 0, l = 0;

        for (i = 0; i <= N - M; i++) {
            for (j = 0; j <= N - M; j++) {
                sum = 0;
                for (k = 0; k < M; k++) {
                    for (l = 0; l < M; l++) {
                        sum += intArr[i + k][j + l];
                    }
                }

                result = Math.max(result, sum);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        파리퇴치 m = new 파리퇴치();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] intArr = new int[N][N];
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    intArr[j][k] = sc.nextInt();
                }
            }
            System.out.println("#" + (i + 1) + " " + m.Solution(intArr, M, N));

        }
    }
}