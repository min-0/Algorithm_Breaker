import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        
        int nowX = 0, nowY = 0;
        
        int moveX [] = {0, 0, 1, -1};
        int moveY [] = {1, -1, 0, 0};
        
        boolean isVisit [][] = new boolean[maps.length][maps[0].length];
        
        Queue<int []> q = new LinkedList<>();
        q.add(new int[] {0, 0});
        isVisit[0][0] = true;
        
        while(!q.isEmpty()) {
            int[] p = q.poll();
            for(int i = 0; i < 4; i++) {
                int nextX = p[0] + moveX[i];
                int nextY = p[1] + moveY[i];
                
                if(nextX < 0 || nextY < 0 || nextX >= maps.length || nextY >= maps[0].length) continue;
                if(maps[nextX][nextY] == 0 || isVisit[nextX][nextY]) continue;
                
                q.add(new int[] {nextX, nextY});
                isVisit[nextX][nextY] = true;
                maps[nextX][nextY] = maps[p[0]][p[1]] + 1;
            }
        }
        answer = maps[maps.length-1][maps[0].length-1];
        if(answer == 1) answer = -1;
        return answer;
    }
}