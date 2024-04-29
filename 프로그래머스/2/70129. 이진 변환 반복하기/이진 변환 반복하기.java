class Solution {
    int zeroCnt = 0;
    int cnt = 0;
    
    public String binaryChange(String s) {
        StringBuilder result = new StringBuilder();
        
        if(s.equals("1")) return "";
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') {
                zeroCnt++;
            }
        }
        
        s = s.replace(String.valueOf('0'), "");
        s = Integer.toBinaryString(s.length());
        cnt++;
        
        return binaryChange(s);
    }
    
    public int[] solution(String s) {
        int[] answer = new int[2];
    
        s = binaryChange(s);
        
        answer[0] = cnt;
        answer[1] = zeroCnt;
        
        return answer;
    }
}