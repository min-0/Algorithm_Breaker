package inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 중복문자제거 {
    public String Solution(String str) {
        String answer;
        StringBuffer sb = new StringBuffer();
        Set<Character> set = new HashSet<>();
        for(char c : str.toCharArray()) {
            if(set.add(c)) sb.append(c);
        }
        answer = String.valueOf(sb);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        중복문자제거 m = new 중복문자제거();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(m.Solution(str));
    }
}
