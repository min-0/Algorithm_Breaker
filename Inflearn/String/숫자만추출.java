package inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자만추출 {
    public int Solution(String str) {
        StringBuffer sb = new StringBuffer();
        char[] strArr = str.toCharArray();
        for(char x : strArr) {
            if(x >= '0' && x <= '9') sb.append(x);
        }
        return Integer.parseInt(String.valueOf(sb));
    }

    public static void main(String[] args) throws IOException {
        숫자만추출 m = new 숫자만추출();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.Solution(str));
    }
}
