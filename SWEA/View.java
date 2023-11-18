import java.util.Scanner;

public class View {
    public int View(int[] intArr) {
        int result = 0;
        int max = 0;
        for (int i = 2; i < intArr.length - 2; i++) {
            max = Math.max(Math.max(intArr[i-1],intArr[i-2]), Math.max(intArr[i+1], intArr[i+2]));
            if(intArr[i] > max) {
                result += intArr[i] - max;
            }
        }
        return result;
    }

    /*
    Array
    int max = Arrays.stream(arr).max().getAsInt();
    ArrayList
    ArrayList는
    int max2 = Collections.max(arr);
     */

    public static void main(String[] args) {
        View m = new View();
        Scanner sc = new Scanner(System.in);
        int[] intArr = null;
        for (int i = 0; i < 10; i++) {
            int size = sc.nextInt();
            intArr = new int[size];
            for (int j = 0; j < size; j++) {
                intArr[j] = sc.nextInt();
            }
            System.out.println("#" + (i + 1) + " " + m.View(intArr));
        }
    }
}