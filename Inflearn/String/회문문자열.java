package inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 회문문자열 {
    public String Solution(String str) {
        String tmp = new StringBuilder(str).reverse().toString().toLowerCase();
        if(str.toLowerCase().equals(tmp)) return "YES";
        else return "NO";
    }

    public static void main(String[] args) throws IOException {
        회문문자열 m = new 회문문자열();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.Solution(str));
    }
}
