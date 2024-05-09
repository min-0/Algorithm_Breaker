import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for(int t = 0; t < size; t++) {
            sc.nextInt();
            int [] cnt = new int[101];
            for(int k = 0; k < 1000; k++) {
                cnt[sc.nextInt()]++;
            }

            int max = 0;
            int index = 0;

            for(int i = 1; i < cnt.length; i++) {
                if(max < cnt[i]) {
                    max = cnt[i];
                    index = i;
                }
                if(max == cnt[i]) {
                    if(index < i) index = i;
                }
            }
            System.out.println("#" +( t+1) + " " + index);
        }
    }
}
