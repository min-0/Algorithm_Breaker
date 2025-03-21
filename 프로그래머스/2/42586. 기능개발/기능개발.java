import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue <Integer> q = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            int n = 100 - progresses[i];
            int days = (int) Math.ceil((double) n / speeds[i]);
            q.add((int)days);
        }
        
        while(!q.isEmpty()) {
            int cnt = 1;
            int first = q.poll();
            
            while (!q.isEmpty() && q.peek() <= first) {
                q.poll();
                cnt++;
            }
            answer.add(cnt);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}