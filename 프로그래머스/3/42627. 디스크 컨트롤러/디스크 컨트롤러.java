import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, Comparator.comparingInt(o1 -> o1[0]));
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
             Comparator.comparingInt(o1 -> o1[1])
         );

        int currentTime = 0;
        int totalTime = 0;
        int index = 0;
        int count = 0;
        
        while (count < jobs.length) {
            while (index < jobs.length && jobs[index][0] <= currentTime) {
                pq.add(jobs[index++]);
            }
            if (!pq.isEmpty()) {
                int[] job = pq.poll();
                currentTime += job[1];
                totalTime += currentTime - job[0];
                count++;
            } else {
                currentTime = jobs[index][0];
            }
        }
        return totalTime / jobs.length;
    }
}