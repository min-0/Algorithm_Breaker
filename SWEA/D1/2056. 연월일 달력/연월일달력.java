package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 연월일달력 {
    public String Solution(String str) {
        String answer;
        String year = str.substring(0, 4);
        String month = str.substring(4, 6);
        String day = str.substring(6, 8);

        if(Integer.parseInt(month) == 0 || Integer.parseInt(month) > 12 || Integer.parseInt(day) == 0 || Integer.parseInt(day) > 31) return "-1";
        else {
            if(Integer.parseInt(month) == 4 || Integer.parseInt(month) == 6 || Integer.parseInt(month) == 9 || Integer.parseInt(month) == 11) {
                if(Integer.parseInt(day) < 31) answer = year + "/" + month + "/" + day;
                else return "-1";
            } else if (Integer.parseInt(month) == 2) {
                if(Integer.parseInt(day) < 29) answer = year + "/" + month + "/" + day;
                else return "-1";
            }
            else answer = year + "/" + month + "/" + day;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        연월일달력 m = new 연월일달력();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str;
        for(int i = 0; i < n; i++) {
            str = br.readLine();
            System.out.println("#" + (i + 1) + " " + m.Solution(str));
        }
    }
}
