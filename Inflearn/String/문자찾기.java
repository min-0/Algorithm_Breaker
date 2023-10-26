package inflearn.String;

import java.io.BufferedReader;
import  java.io.IOException;
import java.io.InputStreamReader;

public class 문자찾기 {
    public int solution(String str, char t) {
        int cnt = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for(char i : str.toCharArray()) {
            if(i == t) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        문자찾기 m = new 문자찾기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char c = br.readLine().charAt(0);
        System.out.print(m.solution(str, c));
    }
}
