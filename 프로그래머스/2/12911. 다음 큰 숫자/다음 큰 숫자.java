class Solution {
    public int oneCount(String binary) {
        int oneCnt = 0;
        
        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') oneCnt++;
        }
        
        return oneCnt;
    }
    
    public int solution(int n) {
        int nextNum = n;
        String binary = Integer.toBinaryString(n);
        
        while(true) {
            nextNum++;
            if(oneCount(binary) == oneCount(Integer.toBinaryString(nextNum))) break;
        }
        
        return nextNum;
    }
}