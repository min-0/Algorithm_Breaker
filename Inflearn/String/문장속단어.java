package inflearn.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 문장속단어 {
    public String solution(String str) {
        String answer = "";
        int max = 0;
        String [] s = str.split(" ");
        for(String i : s) {
            int len = i.length();
            if(max < len) {
                max = len;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        문장속단어 a = new 문장속단어();
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        System.out.println(a.solution(str));
    }
}
