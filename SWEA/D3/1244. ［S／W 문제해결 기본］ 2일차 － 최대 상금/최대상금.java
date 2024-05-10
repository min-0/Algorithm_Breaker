package SWEA;

import java.util.Scanner;

public class 최대상금 {
    static String [] arr;
    static int change, max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for(int t = 0; t < testCase; t++) {
            arr = sc.next().split("");
            change = sc.nextInt();

            max = 0;
            if(arr.length < change) change = arr.length; //자릿수 만큼 옮겨도 큰 수 뽑기 충분
            DFS(0, 0);

            System.out.println("#" + (t+1) + " " + max);
        }
    }

    static public void DFS(int start, int cnt) {
        String answer = "";
        if(change == cnt) {
            for(String s : arr) answer += s;
            max = Math.max(max, Integer.parseInt(answer));
            return;
        }
        for(int i = start; i < arr.length; i++) {
            for(int k = i + 1; k < arr.length; k++) {
                String temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;

                DFS(i, cnt+1);

                temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
    }
}
