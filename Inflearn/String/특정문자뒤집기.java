package inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 특정문자뒤집기 {
    public String Solution(String str) {
        String answer ;
        char [] strArr = str.toCharArray();
        int lt = 0;
        int rt = str.length() -1;
        while (lt < rt) {
            if(!Character.isAlphabetic(strArr[lt])) lt++;
            else if(!Character.isAlphabetic(strArr[rt])) rt++;
            else{
                char tmp = strArr[lt];
                strArr[lt] = strArr[rt];
                strArr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(strArr);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        특정문자뒤집기 m = new 특정문자뒤집기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.Solution(str));
    }
}
