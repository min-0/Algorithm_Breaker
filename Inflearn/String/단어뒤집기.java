package inflearn.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 단어뒤집기 {
    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        단어뒤집기 m = new 단어뒤집기();
        int size;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        String [] strArr = new String[size];
        for(int i = 0; i < size; i++) strArr[i] = br.readLine();
        for(String s : m.solution(strArr)) System.out.println(s);
    }
}
