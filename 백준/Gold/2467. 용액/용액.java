import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int [] array = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0, right = n - 1, result = Integer.MAX_VALUE;
        int[] answer = new int[2];
        
        while (left < right){
            int temp = array[left] + array[right];
            if(Math.abs(temp) < result) {
                result = Math.abs(temp);
                answer[0] = array[left];
                answer[1] = array[right];
            }

            if(temp <= 0) left++;
            else right--;
        }

        System.out.println(answer[0] + " " + answer[1]);
    }
}