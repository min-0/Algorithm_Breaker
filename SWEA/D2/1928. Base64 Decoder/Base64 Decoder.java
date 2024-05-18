import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++) {
            String Encoding = br.readLine();
            String answer = new String(Base64.getDecoder().decode(Encoding));
            System.out.println("#" + (i+1) + " " + answer);
        }
    }
}
