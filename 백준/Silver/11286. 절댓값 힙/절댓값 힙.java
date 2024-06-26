import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) > Math.abs(o2)) return Math.abs(o1) - Math.abs(o2);
                else if(Math.abs(o1) == Math.abs(o2)) {
                    if(o1 > o2) return 1; //순서를 바꾼다
                    else return -1; //바꾸지 않는다
                }
                else return -1;
            }
        });

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if(x == 0) {
                System.out.println(pq.isEmpty() ? 0 : pq.poll());
            }
            else pq.add(x);
        }
    }
}
