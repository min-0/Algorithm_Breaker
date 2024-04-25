class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW = 0, maxH = 0, temp = 0;
        int bigW = 0, bigH = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            bigW = sizes[i][0]; bigH = sizes[i][1];
            
            if(bigW < bigH) {
                temp = bigW;
                bigW = bigH;
                bigH = temp;
            }
            
            if(maxW < bigW) maxW = bigW;
            if(maxH < bigH) maxH = bigH;
        }
        
        answer = maxW * maxH;
        
        return answer;
    }
}