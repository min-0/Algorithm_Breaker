class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i = 0; i < prices.length; i++) {
            int pri = prices[i];
            int sec = 0;
            
            for(int k = i + 1; k < prices.length; k++) {
                int tmp = prices[k];
                sec++;
                
                if(pri > tmp) {
                    break;
                }
            }
            answer[i] = sec;
        }
        return answer;
    }
}