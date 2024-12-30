import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int k = i + 1; k < numbers.length; k++) {
                int sum = numbers[i] + numbers[k];
                if(!arr.contains(sum)) arr.add(sum);
            }
        }
        Collections.sort(arr);
        return arr;
    }
}