import java.util.Arrays;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        int max = tangerine.length;
        int[] cnt = new int[tangerine[max - 1]];
        
        for(int i = 0; i < tangerine.length; i++) {
            cnt[tangerine[i] - 1]++;
        }
        
        Arrays.sort(cnt);
        for(int i = cnt.length - 1; i >= 0; i--) {
            if(k > 0) {
                answer++;
                k -= cnt[i];
            }
        }
        return answer;
    }
}