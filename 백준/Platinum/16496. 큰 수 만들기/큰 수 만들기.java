import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String str = br.readLine();
        String [] arr = str.split(" ");
        String answer;

        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        answer = String.join("", arr);

        String temp = answer.replaceAll("0", "");
        if(temp.equals("")) answer = "0";

        System.out.println(answer);
    }
}