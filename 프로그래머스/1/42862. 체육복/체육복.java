import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int [] cnt = new int[n + 1];
        Arrays.fill(cnt, 1);
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i : reserve) cnt[i] = 2;
        for(int i : lost) {
            if(cnt[i] == 2) cnt[i]--;
            else cnt[i] = 0;
        }
        
        for(int i = 1; i <= n; i++) {
            if(cnt[i] == 2 && cnt[i - 1] == 0) {
                cnt[i - 1]++;
                cnt[i]--;
            } else if(cnt[i] == 2 && i + 1 <= n && cnt[i + 1] == 0) {
                cnt[i + 1]++;
                cnt[i]--;
            }
        }
        
        for(int i : cnt) {
            if(i != 0) answer++;
        }
        
        return answer-1;
    }
}