import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int len = words.length;
        ArrayList<String> array = new ArrayList<>();
        array.add(words[0]);
        
        for(int i = 1; i < len; i++) {
            if(array.contains(words[i]) || array.size() > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }
                array.add(words[i]);                  
        }
        return new int[] {0, 0};
    }
}