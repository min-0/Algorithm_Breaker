class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int n = triangle.length;
        
        for(int i = n - 1; i > 0; i--) {
            for(int k = 0; k < triangle[i].length - 1; k++) {
                triangle[i - 1][k] += Math.max(triangle[i][k], triangle[i][k+1]);
            }
        }
        answer = triangle[0][0];
        
        return answer;
    }
}