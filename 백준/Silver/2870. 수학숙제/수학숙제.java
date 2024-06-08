import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        ArrayList<BigInteger> arr = new ArrayList<>();

        for (int t = 0; t < tc; t++) {
            String str = br.readLine();
            String[] strArr = str.split("[^0-9]");
            for (String s : strArr) {
                if(!s.equals("")) arr.add(new BigInteger(s));
            }
        }
        Collections.sort(arr);
        for(BigInteger i : arr) System.out.println(i);
    }
}
