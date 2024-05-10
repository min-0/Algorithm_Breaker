import java.util.ArrayList;
import java.util.Scanner;

public class 간단한삼육구게임 {
    public String[] Solution(String[] sb) {
        for (int i = 0; i < sb.length; i++) {
            if (sb[i].contains("3") == true || sb[i].contains("6") == true || sb[i].contains("9")) {
                sb[i] = String.valueOf(i+1).replaceAll("[369]", "-").replaceAll("\\d", "");
            }
        }
        return sb;
    }
    public static void main(String[] args) {
        간단한삼육구게임 m = new 간단한삼육구게임();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String[] strArr = new String[input];
        for(int i = 0; i < input; i++) {
            strArr[i] = String.valueOf(i + 1);
        }
        for(String x : m.Solution(strArr)){
            System.out.print(x + " ");
        }
    }
}
