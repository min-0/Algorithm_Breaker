package inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열압축 {
    public String Solution(String str) {
        StringBuilder answer = new StringBuilder();
        int cnt = 1;
        str += " ";
        for(int i = 0;  i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                cnt++;
            }
            else {
                answer.append(str.charAt(i));
                if(cnt > 1) answer.append(cnt);
                cnt = 1;
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        문자열압축 m = new 문자열압축();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.Solution(str));
    }
}
