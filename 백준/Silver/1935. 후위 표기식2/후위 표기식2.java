import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        Double [] number = new Double[n];
        Stack<Double> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            number[i] = Double.parseDouble(br.readLine());
        }

        double res, op1, op2;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                st.push(number[str.charAt(i) - 'A']);
                continue;
            }
            op2 = st.pop();
            op1 = st.pop();
            switch (str.charAt(i)) {
                case '*' :
                    res = op1 * op2;
                    st.push(res);
                    break;
                case '/' :
                    res = op1 / op2;
                    st.push(res);
                    break;
                case '+' :
                    res = op1 + op2;
                    st.push(res);
                    break;
                case '-' :
                    res = op1 - op2;
                    st.push(res);
                    break;
            }
        }
        System.out.printf("%.2f", st.pop());
    }
}
