class Solution {
    public String solution(String s) {
        String answer = "";
        String [] str = s.split(" ");
        int max = Integer.valueOf(str[0]), min = Integer.valueOf(str[0]);
        
        for(int i = 0; i < str.length; i++) {
            max = Math.max(max, Integer.valueOf(str[i]));
            min = Math.min(min, Integer.valueOf(str[i]));
            
            answer = String.valueOf(min) + " " + String.valueOf(max);
            
        }
        
        
        return answer;
    }
}