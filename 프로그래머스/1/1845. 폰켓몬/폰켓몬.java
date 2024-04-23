import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        int [] type = Arrays.stream(nums).distinct().toArray();
        
        if(answer < type.length) return answer;
        else if(answer >= type.length) answer = type.length;
        
        return answer;
    }
}