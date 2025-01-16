import java.util.ArrayList;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int startIndex = 0, endIndex = 0;
        int sum = sequence[0];
        int minLength = Integer.MAX_VALUE;
        
        while(true) {
            if(sum < k) {
                endIndex++;
                if(endIndex >= sequence.length) break;
                sum += sequence[endIndex];
            }
            else if(sum > k){
                sum -= sequence[startIndex];
                startIndex++;
                if(startIndex >= sequence.length) break;
            }
            else {
                if(endIndex - startIndex < minLength) {
                    minLength = endIndex - startIndex;
                    answer[0] = startIndex;
                    answer[1] = endIndex;
                }
                endIndex++;
                if(endIndex >= sequence.length) break;
                sum += sequence[endIndex];
            }
        }
        return answer;
    }
}