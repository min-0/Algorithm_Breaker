import java.util.*;

public class 나머지더하기 {
    static Scanner sc = new Scanner(System.in);
    public int Solution(int size, int [] intArr) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                if (intArr[i] != intArr[k]) {
                    sum += intArr[i] % intArr[k];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        나머지더하기 m = new 나머지더하기();
        int num = sc.nextInt();
        int p = 0;
        int size = 0;
        int[] intArr= null;
        ArrayList<Integer> result = new ArrayList<>();

        while (p < num) {
            size = sc.nextInt();
            intArr = new int[size];
            for (int i = 0; i < size; i++){
                intArr[i] = sc.nextInt();
            }
            result.add(m.Solution(size, intArr));
            p++;
        }
        int cnt = 1;
        for(int x : result){
            System.out.println("#"+ cnt + " " + x);
            cnt++;
        }
    }
}
