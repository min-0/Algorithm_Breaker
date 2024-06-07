class Solution {
    public int [] solution(long n) {
        String [] str = String.valueOf(n).split("");
        int [] answer = new int[str.length];
        StringBuilder sb = new StringBuilder();
        
        for(String s : str) sb.append(s);
        str = sb.reverse().toString().split("");
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(str[i]);
        }
        
        return answer;
    }
}