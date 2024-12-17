import java.util.*;

class Solution {
    public long puzzleGame(int[] diffs, int[] times, int level) {
        long timeTaken = 0;
        for(int i = 0; i < diffs.length; i++) {
            if(diffs[i] <= level) {
                timeTaken += times[i];
            }
            else if(diffs[i] > level) {
                int retryCnt = diffs[i] - level;
                timeTaken += (times[i] + (i == 0 ? 0 : times[i - 1])) * retryCnt + times[i];
            }
        }
        return timeTaken;
    }
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        int max_level = Arrays.stream(diffs).max().getAsInt(), min_level = 1;
        
        while(min_level <= max_level) {
            int mid = (max_level + min_level) / 2;
            long timeTaken = puzzleGame(diffs, times, mid);
            
            if(timeTaken <= limit) {
                answer = mid;
                max_level = mid - 1;
            }
            else min_level = mid + 1;
        }
        return answer;
    }
}