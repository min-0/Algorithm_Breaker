package inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 유효한팰린드롬 {
    public String Solution(String str) {
        StringBuffer sb = new StringBuffer();
        char[] strArr = str.toCharArray();
        for(char x : strArr) {
            if(Character.isAlphabetic(x)) sb.append(x);
        }
        if(sb.toString().equalsIgnoreCase(sb.reverse().toString())) return "YES";
        else return "NO";
    }

    public static void main(String[] args) throws IOException {
        유효한팰린드롬 m = new 유효한팰린드롬();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.Solution(str));
    }
}
