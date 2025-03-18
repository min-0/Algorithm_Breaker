import java.util.*;

class Solution {
    ArrayList<ArrayList<int[]>> array;
    boolean[] isVisit;
    public int prim(int n) {
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        q.add(new int[] {0,0});
        int sum = 0;
        while(!q.isEmpty()) {
            int[] current = q.poll();
            int node = current[0];
            int cost = current[1];
            if(isVisit[node]) continue;
            isVisit[node] = true;
            sum += cost;
            for(int[] i : array.get(node)) {
                if(!isVisit[i[0]]) q.add(new int[] {i[0], i[1]});
            }
        }
        return sum;
    }
    public int solution(int n, int[][] costs) {
        int answer = 0;
        isVisit = new boolean[n];
        array = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            array.add(new ArrayList<>());
        }
        for(int i = 0; i < costs.length; i++) {
            array.get(costs[i][0]).add(new int[] {costs[i][1], costs[i][2]});
            array.get(costs[i][1]).add(new int[] {costs[i][0], costs[i][2]});
        }
        answer = prim(n);
        return answer;
    }
}