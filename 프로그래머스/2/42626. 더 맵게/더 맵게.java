import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int mixScoville = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i : scoville) pq.add(i);
        
        while(pq.size() > 1 && pq.peek() < K) {
            int fir = pq.poll();
            int sec = pq.poll();
            
            mixScoville = (fir + (sec * 2));
            pq.add(mixScoville);
            answer++;
        }
        
        if(pq.peek() < K) return -1;
        
        return answer;
    }
}