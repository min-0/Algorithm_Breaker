package inflearn.Array;

import java.util.Scanner;

public class 보이는학생 {
    public int Solution (int size, int[] intArr) {
        int cnt = 1, max = intArr[0];
        for(int i = 1; i < size ; i++) {
            if(intArr[i] > max) {
                max = intArr[i];
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        보이는학생 m = new 보이는학생();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] intArr = new int[size];
        for(int i = 0; i < size; i++) {
            intArr[i] = sc.nextInt();
        }
        System.out.println(m.Solution(size, intArr));
    }
}
