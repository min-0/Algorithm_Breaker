import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        if(arr.length <= 1) return new ArrayList<>(Arrays.asList(-1));
        int min = Integer.MAX_VALUE;
        int index = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i : arr) temp.add(i);
        for(int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
            if(min == arr[i]) index = i;
        }
        temp.remove(index);
        return temp;
    }
}