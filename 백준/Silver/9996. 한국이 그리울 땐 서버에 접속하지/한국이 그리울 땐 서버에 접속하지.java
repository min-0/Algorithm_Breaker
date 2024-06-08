import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        String temp = br.readLine();
        String [] pattern = temp.split("\\*");

        for(int t = 0; t < tc; t++) {
            String str = br.readLine();

            if(pattern[0].length() + pattern[1].length() > str.length()) {
                System.out.println("NE");
                continue;
            }
            
            String f = str.substring(0, pattern[0].length());
            String b = str.substring(str.length() - pattern[1].length());

            if(f.equals(pattern[0]) && b.equals(pattern[1])) System.out.println("DA");
            else System.out.println("NE");
        }
    }
}
