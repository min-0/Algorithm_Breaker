import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = 0; i <= input; i++) {
            System.out.print((1<<i) + " ");
        }
    }
}
