package inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 큰수출력하기 {
    public ArrayList<Integer> Solution(int size, int [] intArr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(intArr[0]);
        for(int i = 1; i < size ; i++) {
            if(intArr[i] > intArr[i - 1]) {
                answer.add(intArr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args)  {
        큰수출력하기 m = new 큰수출력하기();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] intArr = new int[size];
        for(int i = 0; i < size; i++) {
            intArr[i] = sc.nextInt();
        }
        for(int x : m.Solution(size, intArr)) System.out.print(x + " ");
    }
}
