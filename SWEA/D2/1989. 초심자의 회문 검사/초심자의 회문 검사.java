import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public int Solution(String str) {
        String tmp = new StringBuilder(str).reverse().toString().toLowerCase();
        if(str.toLowerCase().equals(tmp)) return 1;
        else return 0;
    }

    public static void main(String[] args) throws IOException {
        Solution m = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        for(int i = 0; i < size; i++) {
            String str = br.readLine();
            System.out.println("#" + (i+1) + " " + m.Solution(str));
        }

    }
}
