import java.util.ArrayList;
import java.util.Scanner;

public class 백만장자프로젝트 {
    public long Solution(int day, int[] intArr) {
        long result = 0;
        int max = intArr[day - 1];
        for (int i = day - 2; i >= 0; i--) {
            if(max > intArr[i]) {
                result += max - intArr[i];
            }
            else {
                max = intArr[i];
            }

        }
        return result;
    }
    public static void main(String[] args) {
        백만장자프로젝트 m = new 백만장자프로젝트();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int day = 0, n = 0;
        int [] intArr = null;
        ArrayList<Long> result = new ArrayList<>();

        while (n < size) {
            day = sc.nextInt();
            intArr = new int[day];
            for (int i = 0; i < day; i++){
                intArr[i] = sc.nextInt();
            }
            result.add(m.Solution(day, intArr));
            n++;
        }
        int cnt = 1;
        for(long x : result){
            System.out.println("#"+ cnt + " " + x);
            cnt++;
        }
    }
}
