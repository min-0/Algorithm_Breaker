class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int [2];
        int[][] carpet;
        
        for(int i = 0; i < brown/2; i++) {
            for(int k = i; k < brown/2; k++) {
                if(brown + yellow == i * k) {
                    carpet = new int[k][i];
                    if((carpet.length-2)*(carpet[1].length-2) == yellow) {
                        answer[0] = k;
                        answer[1] = i;
                    };
                }
            }
        }
        return answer;
    }
}