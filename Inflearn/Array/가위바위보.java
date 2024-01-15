package inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 가위바위보 {
    public ArrayList<Character> Solution(int size, int[] A, int[] B) {
        ArrayList<Character>  answer = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            if(A[i] == B[i]) answer.add('D');
            else  if(A[i] == 1) {
                if(B[i] == 2) answer.add('B');
                else answer.add('A');
            }
            else if(A[i] == 2) {
                if(B[i] == 1) answer.add( 'A');
                else answer.add('B');
            }
            else if(A[i] == 3) {
                if(B[i] == 1) answer.add('B');
                else if(B[i] == 2) answer.add('A');
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        가위바위보 m = new 가위바위보();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] A = new int[size];
        int [] B = new int[size];

        for(int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < size; i++) {
            B[i] = sc.nextInt();
        }
        for(char x : m.Solution(size, A, B)) System.out.println(x);
    }
}
