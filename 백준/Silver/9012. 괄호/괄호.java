import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static public String Solution(String s) {
        int len = s.length();
        Queue<Character> q = new LinkedList<>();

        if(s.length() % 2 != 0 || s.charAt(0) == ')' || s.charAt(len -1) == '(') return "NO";

        for( char c : s.toCharArray()) q.add(c);

        int cnt = 0;
        while(len > 0) {
            if(q.peek() == '(') {
                q.poll();
                cnt++;
            }
            else{
                q.poll();
                cnt--;
            }

            if(cnt < 0) return "NO";
            len--;
        }

        if(cnt == 0) return "YES";
        else return "NO";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++) {
            String s = br.readLine();
            System.out.println(Solution(s));
        }
    }
}
