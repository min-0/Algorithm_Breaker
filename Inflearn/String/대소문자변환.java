package inflearn.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 대소문자변환 {
    public String solution(String s) {
        String answer = "";
        for(int i = 0; i < s.length(); i ++) {
            if(s.charAt(i) >= 'a') {
                answer += (Character.toUpperCase(s.charAt(i)));
            }
            else {
                answer += (Character.toLowerCase(s.charAt(i)));
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        대소문자변환 a = new 대소문자변환();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(a.solution(str));
    }
}
